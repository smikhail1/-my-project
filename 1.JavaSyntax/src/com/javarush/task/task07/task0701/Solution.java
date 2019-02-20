package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив

        int [] number = new int[20];
        for (int i = 0;i< number.length;i++){
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            number[i] = Integer.parseInt(br.readLine());
        }

        return number;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int maximum = array[0];
        for (int i = 0;i<array.length;i++){
            if (maximum < array[i])
                maximum = array[i];
        }
        return maximum;
    }
}
