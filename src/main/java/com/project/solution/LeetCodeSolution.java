package com.project.solution;

import java.util.Arrays;
import java.util.Comparator;

import javafx.util.Pair;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[] nums1 =  {18,43,36,13,7};
        System.out.println(maximumSum(nums1));

        int[] nums2 =  {10,12,19,14};
        System.out.println(maximumSum(nums2));

    }

    // Helper function to compute the sum of digits of a number
    private static int calculateDigitSum(int num) {

        int digitSum = 0;

        while (num > 0) {
            digitSum += num % 10;
            num /= 10;
        }

        return digitSum;

    }

    public static int maximumSum(int[] nums) {

        Pair<Integer, Integer>[] digitSumPairs = new Pair[nums.length];

        // Store numbers with their digit sums as pairs
        for (int i = 0; i < nums.length; i++) {
            int digitSum = calculateDigitSum(nums[i]);
            digitSumPairs[i] = new Pair<>(digitSum, nums[i]);
        }

        // Sort based on digit sums, and if equal, by number value
        Arrays.sort(digitSumPairs, Comparator.comparing(Pair<Integer, Integer>::getKey)
                .thenComparing(Pair<Integer, Integer>::getValue));

        int maxPairSum = -1;

        // Iterate through the sorted array to find the maximum sum of pairs
        for (int index = 1; index < digitSumPairs.length; index++) {

            int currentDigitSum = digitSumPairs[index].getKey();
            int previousDigitSum = digitSumPairs[index - 1].getKey();

            // If two consecutive numbers have the same digit sum
            if (currentDigitSum == previousDigitSum) {
                int currentSum = digitSumPairs[index].getValue() + digitSumPairs[index - 1].getValue();
                maxPairSum = Math.max(maxPairSum, currentSum);
            }

        }

        return maxPairSum;

    }

}
