package com.ayush;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
//        arr = {1,2,3,4,5};
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(arr[0]);

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

        System.out.println(Arrays.toString(arr));


        String[] str = {"Ayush", "Kabra"};

        System.out.println(Arrays.toString(str));

    }
}
