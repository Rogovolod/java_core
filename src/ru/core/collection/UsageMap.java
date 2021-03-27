package ru.core.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mail@mail.mail", "SavinPP");
        map.put("mail@mail.mail", "VasyaUU");
        map.put("mail@mail.com", "SavinPP");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }
    }
}