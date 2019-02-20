package com.javarush.task.task03.task0318;

/* 
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sallary = Integer.parseInt(br.readLine());
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код .
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("сколько лет");
        int nAge = Integer.parseInt(reader.readLine());
        //String sAge = reader.readLine();
        //int nAge = Integer.parseInt(sAge);

        System.out.println("Ваше имя");
        String name = reader.readLine();

       // System.out.println(name + " захватит мир через " + sAge + " лет. Му-ха-ха!");
        System.out.println(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");
    }
}
