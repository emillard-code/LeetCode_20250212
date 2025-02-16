package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 =  {18,43,36,13,7};
        System.out.println(maxSumOfAPairWithEqualSumOfDigits(nums1));

        int[] nums2 =  {10,12,19,14};
        System.out.println(maxSumOfAPairWithEqualSumOfDigits(nums2));

    }

    // This method returns the maximum value that fulfills the challenge specifications.
    public static int maxSumOfAPairWithEqualSumOfDigits(int nums[]) {

        // The default value is -1 if no match is found.
        int max = -1;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // We do not want to compare the same indices with each other.
                if (i == j) { continue; }

                // If the sum of the digits found in both indexes is the same, check if the sum of
                // the values at those indexes surpasses int max. If yes, then overwrite int max
                // with the sum of the current values at both indexes.
                int sum1 = nums[i] / 10 + nums[i] % 10;
                int sum2 = nums[j] / 10 + nums[j] % 10;
                if (sum1 == sum2 && max < nums[i] + nums[j]) { max = nums[i] + nums[j]; }

            }

        }

        // Return int max at the end.
        return max;

    }

}
