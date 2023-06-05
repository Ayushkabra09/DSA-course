package com.ayush;

public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] arr = {12, 43, 23, 54, 65, 22};
        int found_index = linearSearch(arr, 22);

        System.out.println(found_index);
    }

    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target)
                return i;
        }

        return -1;
    }
}
