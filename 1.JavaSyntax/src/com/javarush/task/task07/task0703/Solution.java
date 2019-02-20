package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        //int a = Integer.parseInt(br.readLine());
        //String s = br.readLine();

        String[]s=new String[10];
        int [] a = new int[10];

         for (int i = 0; i < 10;i++ ){
             s[i] = br.readLine();

             a[i] = s[i].length();

             System.out.println(a[i]);
         }

    }
}
