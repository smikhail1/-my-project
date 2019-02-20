package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String,Cat> map = new HashMap<String, Cat>() ;
        map.put("q", new Cat("q"));
        map.put("w", new Cat("w"));
        map.put("e", new Cat("e"));
        map.put("r", new Cat("r"));
        map.put("t", new Cat("t"));
        map.put("y", new Cat("y"));
        map.put("u", new Cat("u"));
        map.put("a", new Cat("a"));
        map.put("s", new Cat("s"));
        map.put("d", new Cat("d"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        return new HashSet(map.values());

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
