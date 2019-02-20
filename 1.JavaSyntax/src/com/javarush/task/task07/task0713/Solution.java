package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
5
10
16
17
9
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer>list = new ArrayList<Integer>();
        ArrayList<Integer>li_3 = new ArrayList<Integer>();
        ArrayList<Integer>li_2 = new ArrayList<Integer>();
        ArrayList<Integer>li_ost = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        for (int i = 0;i < 20;i++)
        {
            int y = Integer.parseInt(br.readLine());
            list.add(y);
        }
        for(int i = 0;i < 20;i++){
            if(list.get(i)%3 == 0 && list.get(i)%2 ==0){
                li_3.add(list.get(i));
                li_2.add(list.get(i));
            }
            else if (list.get(i)%3 == 0){
                li_3.add(list.get(i));
            }
            else if(list.get(i)%2 == 0){
                li_2.add(list.get(i));
            }
            else {
                li_ost.add(list.get(i));
            }
        }


        printList(li_3);
        printList(li_2);
        printList(li_ost);

    }

    public static void printList(List<Integer> list) {
       //напишите тут ваш код
       for (Integer x : list){
           System.out.println(x);
       }


    }
}
