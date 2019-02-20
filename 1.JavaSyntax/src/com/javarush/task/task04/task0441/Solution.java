package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        // a 2 b 33 c 4
        //for (int i = 0;i < 10;i++){
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            if (a > b&&b > c||a < b&&b < c)
                System.out.println(b);
            if (b > a&&a > c||b < a&&a < c)
                System.out.println(a);
            if (a > c&&c > b||a < c&&c < b)
                System.out.println(c);
            boolean m;
            if (m =(a==b&&b==c))
                System.out.println(m);
            if (a==b)
                System.out.println(a);
                if (b==c)
                    System.out.println(b);
                    if (a==c)
                        System.out.println(c);





        //}




    }
}
