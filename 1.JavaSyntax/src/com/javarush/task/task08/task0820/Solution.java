package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println("--------------------------");

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        return new HashSet<Cat>() {{
            add(new Cat());
            add(new Cat());
            add(new Cat());
            add(new Cat());
        }};
    }

    public static Set<Dog> createDogs() {
        return new HashSet<Dog>() {{
            add(new Dog());
            add(new Dog());
            add(new Dog());

        }};
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        return new HashSet<Object>(){{
            addAll(cats);
            addAll(dogs);
        }};
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        for (Cat cat: cats)
            pets.remove(cat);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object m : pets){
            System.out.println(m);
        }
    }

    //напишите тут ваш код
    public static class Cat {
    }

    public static class Dog {
    }
}
