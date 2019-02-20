package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "Oleg");
        map.put("B", "Sasha");
        map.put("C", "Andrey");
        map.put("D", "Kolya");
        map.put("E", "Vasya");
        map.put("F", "Petya");
        map.put("G", "Andrey");
        map.put("H", "Oleg");
        map.put("I", "Sasha");
        map.put("J", "Andrey");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int sum = 0;
        for (String s : map.values()) {
            if (name.equals(s)) {
                sum++;
            }
        }
        //System.out.println(sum);
        return sum;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int sum = 0;
        for (String s : map.keySet()) {
            if (lastName.equals(s)) {
                sum++;
            }
        }
        //System.out.println(suma);
        return sum;

    }

    public static void main(String[] args) {

    }
}
