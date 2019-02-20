package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.List;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String currentEl = list.get(i);
            if (currentEl.contains("р") && currentEl.contains("л")) {
                result.add(currentEl);
            } else if (currentEl.contains("л")) {
                result.add(currentEl);
                result.add(currentEl);
            } else if (!currentEl.contains("р")) {
                result.add(currentEl);
            }
        }
        return result;
    }
}
