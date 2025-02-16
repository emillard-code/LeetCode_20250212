package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 =  {18,43,36,13,7};
        System.out.println(maxSumOfAPairWithEqualSumOfDigits(nums1));

        int[] nums2 =  {10,12,19,14};
        System.out.println(maxSumOfAPairWithEqualSumOfDigits(nums2));

    }

    public static int maxSumOfAPairWithEqualSumOfDigits(int nums[]) {

        int max = -1;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (i == j) { continue; }

                int sum1 = nums[i] / 10 + nums[i] % 10;
                int sum2 = nums[j] / 10 + nums[j] % 10;
                if (sum1 == sum2 && max < nums[i] + nums[j]) { max = nums[i] + nums[j]; }

            }

        }

        return max;

    }

}
