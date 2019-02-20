package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        //int a = Integer.parseInt(br.readLine());
       // String name = br.readLine();

        //System.out.println("Введите имя");
        String name = br.readLine();
        //System.out.println("Введите возраст");
        String age = br.readLine();
        int Age = Integer.parseInt(age);
        if (Age > 20){
            System.out.println("И 18-ти достаточно");
        }

       // System.out.println(a);
       // System.out.println(name);


        //if (a > 20 )
        //System.out.println("И 18-ти достаточно");
    }
}
