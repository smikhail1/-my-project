package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {

            for (int i = 0; i < 10; i++) {
                int a = Integer.parseInt(br.readLine());
                list.add(a);
            }

        } catch (IOException | NumberFormatException e) {

            for (int i = 0; i < list.size(); i++) {


                System.out.println(list.get(i));
            }
        }


    }
}
