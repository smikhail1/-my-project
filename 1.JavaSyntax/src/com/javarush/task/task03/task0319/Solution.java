package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
/*
        System.out.println("сколько лет");
        String sAge = reader.readLine();
                                        //int nAge = Integer.parseInt(sAge);

        System.out.println("Ваше имя");
        String name = reader.readLine();*/

        System.out.println("Name");
        String s = reader.readLine();

        System.out.println("1");
        String s1 = reader.readLine();

        System.out.println("2");
        String s3 = reader.readLine();

        System.out.println(s + " " + "получает" + " " + s1 + " " + "через" + " " + s3 + " " + "лет." );
    }
}
