package ru.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);
        Iterator<String> iter = list.iterator();
        System.out.println(iter.next());
        System.out.println(iter.next());
        iter.remove();
        System.out.println(list);
    }
}