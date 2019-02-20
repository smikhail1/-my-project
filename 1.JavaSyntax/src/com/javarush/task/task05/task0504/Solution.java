package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("kot1",1,10,100);
        Cat cat2 = new Cat("kot2",2,20,200);
        Cat cat3 = new Cat("kot3",3,30,300);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;



        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}