package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        ArrayList<String> lst = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++)
            lst.add(br.readLine());

        for (int i=0; i<M; i++)
            lst.add (lst.get(i));

        for (int i=M-1; i>=0; i--)
            lst.remove (i);

        for (String s : lst)
            System.out.println(s);
    }
}
