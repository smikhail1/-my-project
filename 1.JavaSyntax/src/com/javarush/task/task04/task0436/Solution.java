package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        for (int mz = 1;mz <= m;mz++){
            for (int nz = 1;nz < n;nz++){
                System.out.print(8);
            }
            System.out.println(8);
        }

    }
}
