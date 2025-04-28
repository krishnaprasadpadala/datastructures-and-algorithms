package com.ds.algo.arrays;

public class SubArrayWithMaxSumTwo {

    public static void main(String[] args) {
        //int arr[] = {2, 3, 5, -2, 7, -4};
        int arr[] = {-4, -3, -7, -20, 0, -2};
        System.out.println("Max sum in sub array is: " + sum(arr));
    }

    private static int sum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int start = 0;
        int end = -1;
        int currStart = start;
        for(int i=0; i<nums.length; i++) {

            currSum = currSum + nums[i];

            if(currSum > maxSum) {
                maxSum = currSum;
                start = currStart;
                end = i;
            }

            if(currSum < 0) {
                currSum = 0;
                currStart = i+1;
            }
        }
        System.out.println("Start index: " + start);
        System.out.println("End index: " + end);
        return maxSum;
    }
}
