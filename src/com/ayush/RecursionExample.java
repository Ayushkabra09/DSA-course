package com.ayush;

public class RecursionExample {

    public static void  main(String[] args){

        print(1);

    }

    static void print(int n){

        if(n == 6) return;

        System.out.println("value of n : " + n);
        print(n + 1);
    }

}
