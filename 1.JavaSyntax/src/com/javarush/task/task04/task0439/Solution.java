package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
       // int a = Integer.parseInt(br.readLine());
        String name = br.readLine();
        for (int i = 0; i < 10;i++ )
            System.out.println(name + " " + "любит меня.");



    }
}