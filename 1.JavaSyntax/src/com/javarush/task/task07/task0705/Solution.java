package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int [] qwer = new int[20];
        int []qw1 = new int[10];
        int []qw2 = new int[10];
        for (int i = 0;i<qwer.length;i++){

            qwer[i]=Integer.parseInt(br.readLine());
        }
        for (int i = 0;i<10;i++){
            qw1 [i] = qwer[i];
           // System.out.println(qw1[i]);
        }
        for (int i = 10;i<qwer.length;i++){

            qw2[i-10] = qwer[i];
            System.out.println(qw2[i-10]);
        }

    }
}
