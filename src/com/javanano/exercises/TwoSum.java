package com.javanano.exercises;

import java.util.Arrays;

public class TwoSum{
    public static boolean twoSum(int[] nums, int target) {
        int arraySize = nums.length;
        for (int i = 0; i < arraySize; i++){
            for (int j = i+1; j < arraySize; j++){
                if (nums[i] + nums[j] == target) return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3,4};
        int target = 5;
        boolean canBeSummed = twoSum(intArray, target);
        System.out.println("Two numbers of "+ Arrays.toString(intArray) + " can be summed to " + target + ": "+canBeSummed);

        intArray = new int[]{1,4,5,1,6,6};
        target = 12;
        System.out.println("Two numbers of "+ Arrays.toString(intArray) + " can be summed to " + target + ": "+twoSum(intArray, target));

    }
}
