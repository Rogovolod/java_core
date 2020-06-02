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
        Item[] namesWithoutNull = new Item[this.items.length];
        int size = 0;
        for (int index = 0; index < this.items.length; index++) {
            Item name = this.items[index];
            if (name != null) {
                namesWithoutNull[size] = name;
                size++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        for (int index = 0; index < namesWithoutNull.length; index++) {
            System.out.println(namesWithoutNull[index]);
        }
        return namesWithoutNull;
    }

    public Item[] findByName(String key) {
        for (int i = 0; i < this.items.length; i++) {
            Item name = this.items[i];
            if (key.equals(name)) {
                System.out.println(this.items[i]);
            }
        }
        return items;
    }

    public Item findById(String id) {
        for (int i = 0; i < this.items.length; i++) {
            Item item = this.items[i];
            if (id.equals(id)) {
                item = this.items[i];
            } else {
                item = null;
            }
        }
        return null;
    }
    }