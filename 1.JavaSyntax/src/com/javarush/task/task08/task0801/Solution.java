package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        set.add("арбуз");    //4
        set.add("банан");    //3
        set.add("вишня");    //10
        set.add("груша");    //5
        set.add("дыня");     //1
        set.add("ежевика");  //2
        set.add("женьшень"); //7
        set.add("земляника");//8
        set.add("ирис");     //9
        set.add("картофель");//6
        Iterator<String> iterator = set.iterator();

        for (String s : set) {
            System.out.println(s);
        }
    }
}
