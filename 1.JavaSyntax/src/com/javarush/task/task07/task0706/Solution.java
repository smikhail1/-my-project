package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int [] array = new int[15];
        for (int i = 0; i<array.length;i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        int d1 = 0, d2 = 0;
        for (int i = 0; i<array.length;i++){
            if (i%2==0||i==array[0]){
                d1=d1+array[i];
            }
            else
                d2=d2+array[i];

        }
        //System.out.println(d1);
        //System.out.println(d2);
        if (d1<d2){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        if (d1>d2)
            System.out.println("В домах с четными номерами проживает больше жителей.");

    }
}
