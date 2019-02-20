package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        if ((a > b)&&(a > c)&&(a > d))
            System.out.println(a);
        if ((b > c)&&(b > a)&&(b > d))
            System.out.println(b);
        if ((c > a)&&(c > b)&&(c > d))
            System.out.println(c);
        if ((d > a)&&(d > b)&&(d > c))
            System.out.println(d);

        if ((a == b)&&(b == c)&&(c == d))

            System.out.println(a);



    }
}
