package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int max, min, mid;

        if (a > b && a > c) {
            max = a;
            if (b > c) {
                min = c;
                mid = b;
            }
            else {
                min = b;
                mid = c;
            }
        }
        else  if (b > a && b > c) {
            max = b;
            if (a > c) {
                min = c;
                mid = a;
            }
            else {
                min = a;
                mid = c;
            }
        }
        else {
            max = c;
            if (a > b) {
                min = b;
                mid = a;
            }
            else {
                min = a;
                mid = b;
            }
        }

        System.out.println (max +  "  "  + mid +  "  "  + min);

    }
}
