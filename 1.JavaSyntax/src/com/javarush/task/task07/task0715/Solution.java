package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String>li = new ArrayList<>();
        li.add("мама");
        li.add("мыла");
        li.add("раму");

        li.add(1,"именно");
        li.add(3,"именно");
        li.add("именно");
        for (String x : li)
        {
            System.out.println(x);
        }

    }
}
