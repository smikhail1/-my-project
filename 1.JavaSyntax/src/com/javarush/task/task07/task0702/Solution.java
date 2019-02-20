package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));


        String qwe [] = new String[10];
        for (int i = 0;i<8;i++){
            qwe [i] = br.readLine();

            //System.out.println(qwe[i]);
        }
        for (int i =qwe.length-1;i>=0;i--){

            System.out.println(qwe[i]);
        }

    }
}