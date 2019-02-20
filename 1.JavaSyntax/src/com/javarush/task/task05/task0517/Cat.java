package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;//null
    int age;// указать возраст
    int weight;//указать вес
    String address;
    String color ;
    public Cat(String name){
        this.name = name;
        this.age = 1;
        this.weight = 2;
        this.color = "green";
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "red";
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "red";
    }
    public Cat(int weight, String color){
        this.age = 4;
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color, String address){
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
