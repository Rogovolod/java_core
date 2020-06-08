package ru.job4j.tracker;

import java.util.Random;
import java.util.Arrays;

public class Tracker {

    private final Item[] items = new Item[100];

    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] temp = new Item[this.position];
        for (int i = 0; i < temp.length; i++) {
            if (items[i].getName().equals(key)) {
                temp[count++] = items[i];
            }
        }
        return Arrays.copyOf(temp, count);
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item name) {
        int i = indexOf(id);
        items[i] = name;
        return true;
    }

    public boolean delete(String id) {
        int index = indexOf(id);
        items[index] = null;
        System.arraycopy(items, index + 1, items, index, position - index);
        items[position - 1] = null;
        position--;
        return true;
    }
    }