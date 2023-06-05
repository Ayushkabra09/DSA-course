package com.ayush;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 1;
        int result = OrderAgnosticBS(arr, target);
        System.out.println(result);
    }

    static int OrderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }


        }

        return -1;
    }

}
