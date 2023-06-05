package com.ayush;

public class FloorOfNumber {
    public static void  main(String args[]){
        int[] arr = {1,5,7,8,9};
        int target = 10;
        int result = FloorOfNumber(arr, target);
        System.out.println(result);
    }
    static int FloorOfNumber(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if (target == arr[mid]){
                return mid;
            }

            if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

            if (start==end){
                return end;
            }

        }

        return start;
    }
}
