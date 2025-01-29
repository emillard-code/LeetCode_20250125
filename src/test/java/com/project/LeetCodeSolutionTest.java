package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void makeLexicographicallySmallestArrayBySwappingElementsTest() {

        int[] nums1 = new int[]{1,5,3,9,8};
        int[] solution1 = new int[]{1, 3, 5, 8, 9};
        assertArrayEquals(solution1, LeetCodeSolution.lexicographicallySmallestArray(nums1, 2));

        int[] nums2 = new int[]{1,7,6,18,2,1};
        int[] solution2 = new int[]{1, 6, 7, 18, 1, 2};
        assertArrayEquals(solution2, LeetCodeSolution.lexicographicallySmallestArray(nums2, 3));

        int[] nums3 = new int[]{1,7,28,19,10};
        int[] solution3 = new int[]{1, 7, 28, 19, 10};
        assertArrayEquals(solution3, LeetCodeSolution.lexicographicallySmallestArray(nums3, 3));

    }

}
