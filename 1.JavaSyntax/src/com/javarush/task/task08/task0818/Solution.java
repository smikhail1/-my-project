package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 333);
        map.put("b", 222);
        map.put("c", 111);
        map.put("d", 11111);
        map.put("e", 22222);
        map.put("i", 3333);
        map.put("f", 44);
        map.put("g", 6666);
        map.put("w", 6);
        map.put("t", 7777);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        List<String> key = new ArrayList<>();
        for (String s : map.keySet()){
            int zp = map.get(s);
            if (zp<500){
                key.add(s);
            }
        }
        for (String b : key){
            map.remove(b);
        }
    }

    public static void main(String[] args) {

    }
}