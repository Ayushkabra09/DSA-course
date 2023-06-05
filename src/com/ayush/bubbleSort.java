package com.ayush;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = {12,3,5,6,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped = false;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++){
            //for each step, max item will come at the last respective index
            for (int j = 1; j<arr.length - i; j++){
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
                if (!swapped){
                    break;
                }
            }

        }

    }

}
