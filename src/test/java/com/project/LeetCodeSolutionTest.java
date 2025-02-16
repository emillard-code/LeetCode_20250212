package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void maximumSumTest() {

        int[] nums1 =  {18,43,36,13,7};
        assertEquals(54, LeetCodeSolution.maximumSum(nums1));

        int[] nums2 =  {10,12,19,14};
        assertEquals(-1, LeetCodeSolution.maximumSum(nums2));

    }

}
