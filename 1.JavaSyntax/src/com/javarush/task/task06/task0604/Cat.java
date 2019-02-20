package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;


    //напишите тут ваш код
    public Cat(){
        catCount++;
        //System.out.println(catCount);

    }

    @Override
    protected void finalize() throws Throwable {
       // super.finalize();
        catCount--;
       // System.out.println(catCount);

    }

    public static void main(String[] args) {
        //System.out.println(catCount);
    }
}