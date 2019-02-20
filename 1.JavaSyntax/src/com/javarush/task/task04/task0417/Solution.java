package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
if (x==y && x!=z) System.out.println(x + " " + y);
if (x==z && x!=y) System.out.println(x + " " + z);
if (z==y && x!=z) System.out.println(z + " " + y);
if (x==y && y==z && x==z) System.out.println(x + " " + y + " " + z);
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());


       if (a == b && a != c)  System.out.println(a + " " + b);
       if (a == c && a != b)  System.out.println(a + " " + c);
       if (b == c && a != c)  System.out.println(b + " " + c);
       if (a == b && b == c ) System.out.println(a +  " " + b + " " + c);


    }
}