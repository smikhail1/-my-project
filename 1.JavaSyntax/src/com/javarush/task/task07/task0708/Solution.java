package com.javarush.task.task07.task0708;

import org.omg.CORBA.Object;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int max_l = 0;
        int s_in;

        for (int i = 0; i < 5; i++) {
            s = br.readLine();
            s_in = s.length();

            if (s_in > max_l)
                max_l = s_in;

            strings.add(s);
        }


        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == max_l) {
                System.out.println(strings.get(i));
            }
        }
    }
}
