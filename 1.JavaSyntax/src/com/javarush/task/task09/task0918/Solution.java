package com.javarush.task.task09.task0918;
import java.rmi.RemoteException;
/* 
Все свои, даже исключения
*/

public class Solution {
    public static void main(String[] args) throws MyException2 {
        try {
            method1();
        }
        catch (MyException i) {
        }

    }

    public static void method1() throws MyException, MyException2, MyException3, MyException4 {
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new MyException();
        if (i == 1)
            throw new MyException2();
        if (i == 2)
            throw new MyException3();
        if (i == 3)
            throw new MyException4();
    }
    
    static class MyException  extends NoSuchFieldException{
    }

    static class MyException2 extends RemoteException{
    }

    static class MyException3 extends NumberFormatException{
    }

    static class MyException4 extends IndexOutOfBoundsException{
    }
}

