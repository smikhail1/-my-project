package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int summ = 0;
        for (;true;) {
            String money = br.readLine();
            if (!money.equals("сумма"))
                summ = summ + Integer.parseInt(money);
            else {
                System.out.println(summ);
                break;
            }
        }
    }
}
