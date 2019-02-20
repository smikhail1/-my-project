package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

/* 
Нам повторы не нужны
значит создаем мап мап кей ентри к интеджеру туда пихаем ентри и колвораз сколько повторяется
 фамилия через итерацию запихиваем проходимся по мапе ещё раз достаем по кей ентри из
  второй мапы сверяем число если больше одного добавляем в лист ту делит отнимаем один
   от колва идем дальше проходимся по листу удаляем повторяющиеся значения по ключу ВУАЛЯ
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        //"фамилия" - "имя".
        map.put("A", "qw");
        map.put("B", "er");
        map.put("C", "tom");
        map.put("D", "q");
        map.put("Q", "w");
        map.put("W", "qw");
        map.put("E", "er");
        map.put("R", "tom");
        map.put("T", "e");
        map.put("Y", "r");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> lst = new ArrayList<String>(map.values());

        int count;
        for (String str : lst) {
            count = 0;
            for (String str2 : lst) {
                if (str.equals(str2))
                    count++;
                if (count==2) removeItemFromMapByValue (map, str);
            }
        }
    }



    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}
