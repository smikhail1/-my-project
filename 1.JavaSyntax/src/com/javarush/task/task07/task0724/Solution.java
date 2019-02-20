package com.javarush.task.task07.task0724;

/* 
Семейная перепись


name (String),
gender (boolean),пол
age (int) возраст
child (Human)
 father (Human) отец
 mother (Human) мать
 grandmother (Human) бабушка
  grandfather (Human) дедушка

*/

public class Solution {
    public static void main(String[] args) {
        Human baba1 = new Human("Lena", false, 72);
        Human baba2 = new Human("Olya", false, 73);

        Human deda1 = new Human("Egor", true, 74);
        Human deda2 = new Human("Mike", true, 75);

        Human mother = new Human("Mom", false, 45, deda1, baba1);
        Human father = new Human("Dad", true, 50, deda2, baba2);

        Human child1 = new Human("Anny", false, 10, mother, father);
        Human child2 = new Human("Lory", false, 16, mother, father);
        Human child3 = new Human("Jeck", true, 14, mother, father);


        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(deda1);
        System.out.println(deda2);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}