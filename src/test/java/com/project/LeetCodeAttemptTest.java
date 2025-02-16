package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void maxSumOfAPairWithEqualSumOfDigitsTest() {

        int[] nums1 =  {18,43,36,13,7};
        assertEquals(54, LeetCodeAttempt.maxSumOfAPairWithEqualSumOfDigits(nums1));

        int[] nums2 =  {10,12,19,14};
        assertEquals(-1, LeetCodeAttempt.maxSumOfAPairWithEqualSumOfDigits(nums2));

    }

}
