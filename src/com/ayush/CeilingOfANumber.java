package com.ayush;

public class CeilingOfANumber {
    public static void  main(String args[]){
        int[] arr = {1,5,7,8,9};
        int target = 10;
        int result = CeilingOfANumber(arr, target);
        System.out.println(result);
    }
    static int CeilingOfANumber(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;
        if(target > arr[arr.length-1]){
            return -1;
        }
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
                return end+1;
            }

        }

        return start;
    }
}
