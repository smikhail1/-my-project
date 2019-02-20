package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man("ara1", 1, "v pope1");
        System.out.println(man.name + " " + man.age + " " + man.address);
        Man man1 = new Man("ara2", 2, "v pope2");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        Woman woman = new Woman("ara3", 3, "v pope3");
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        Woman woman1 = new Woman("ara4", 4, "v pope4");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);

    }

    //напишите тут ваш код
    public static class Man{
        String name;
        int age;
        String address;

       public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
