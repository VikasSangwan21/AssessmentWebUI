
package com.assessment.utils;

public class ReverseArray {


    public static void ReverseGivenArray(int[] arr){
        int start = 0, end = arr.length-1;
        while ((start < end)) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }
    }

}