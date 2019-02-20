package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
July August October December April May
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("StallonQ", df.parse("AUGUST 1 1980"));
        map.put("StallonW", df.parse("JUNE 1 1980"));
        map.put("StallonE", df.parse("OCTOBER 1 1980"));
        map.put("StallonR", df.parse("DECEMBER 1 1980"));
        map.put("StallonT", df.parse("APRIL 1 1980"));
        map.put("StallonY", df.parse("JUNE 1 1980"));
        map.put("StallonU", df.parse("JUNE 1 1980"));
        map.put("StallonI", df.parse("JULY 1 1980"));
        map.put("StallonO", df.parse("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        List<String> keyToDelete = new ArrayList<>();
        for (String s : map.keySet()) {
            Date d = map.get(s);
            if (d.getMonth() == 5
                    || d.getMonth() == 6
                    || d.getMonth() == 7
                    ) {
                keyToDelete.add(s);
            }
        }

        for(String a : keyToDelete) {
            map.remove(a);
        }
    }

    public static void main(String[] args)   {

    }
}
