package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String>list = new ArrayList<>();
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        for (int i = 0; i < 5; i ++)
        {
            String s = br.readLine();
            list.add(s);
        }
        list.remove(2);
        for (int i = 0;i < list.size();i++)
        {
            int m = list.size()-i-1;
            System.out.println(list.get(m));
        }
    }
}


