package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
import java.lang.*;
import java.io.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(20);
        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
        //HashSet<Integer> set1 = new HashSet<Integer>();
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext())
        {
            Integer text = iterator.next();
            if (text>10){
                iterator.remove();
            }

        }
        return set;
    }

    public static void main(String[] args) {
       // System.out.println(createSet());
    }
}
