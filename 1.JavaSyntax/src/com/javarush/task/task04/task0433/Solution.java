package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        //int a = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int a = 1;

        while (a <= 10){
            int b=1;

            while (b < 10){
                System.out.print(s);
                b++;
            }
            System.out.println(s);
            a++;
        }




    }
}
