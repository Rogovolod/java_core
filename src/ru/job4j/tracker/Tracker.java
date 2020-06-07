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
        String[] temp = new String[this.position];
        for (int i = 0; i < temp.length; i++) {
            if (items[i].getName().equals(key)) {
                temp[count] = items[i].getName();
                count++;
            }
        }
        return Arrays.copyOf(items, temp.length);
    }

    public Item findById(String id) {
        Item item = null;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                item = this.items[i];
                break;
            }
        }
        return item;
    }
    }