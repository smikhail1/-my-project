package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;//силы

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if (this.age+this.weight+this.strength<
                anotherCat.age+anotherCat.weight+anotherCat.strength)
           /* cat1.fight(cat2) - его значение извлекаются командой this.age, this.weight.. etc.
                Второй объект, тот который передается в параметр метода (в скобки):
        cat1.fight(cat2) - его значения извлекаются командой anotherCat.age... etc.*/
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 1;
        cat1.weight = 3;
        cat1.strength = 20;
        Cat cat2 = new Cat();
        cat2.age = 2;
        cat2.weight = 6;
        cat2.strength = 30;

        cat1.fight(cat2);
        cat2.fight(cat1);


    }
}
