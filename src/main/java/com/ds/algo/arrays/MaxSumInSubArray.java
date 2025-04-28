package com.ds.algo.arrays;

public class MaxSumInSubArray {

    public static void main(String[] args) {
        //int arr[] = {2, 3, 5, -2, 7, -4};
        int arr[] = {-2, -3, -7, -2, -10, -4};
        System.out.println("Max sum in sub array is: " + sum(arr));
    }
    
    private static int sum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<nums.length; i++) {
            currSum = currSum + nums[i];
            
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
