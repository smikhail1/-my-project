package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;//чётные
    public static int odd;//нет

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        for (int i = 0;i < 4;i++){
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int x = Integer.parseInt(br.readLine());
            //String s = br.readLine();
            x = x % 2;

            if (x==0){
                even++;
            }
            else
                odd++;

        }
        System.out.println("Even:" + even + " " + "Odd:" + odd);


    }
}
