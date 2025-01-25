package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void makeLexicographicallySmallestArrayBySwappingElementsTest() {

        int[] nums1 = new int[]{1,5,3,9,8};
        int[] solution1 = new int[]{1, 3, 5, 8, 9};
        assertArrayEquals(solution1, LeetCodeAttempt.makeLexicographicallySmallestArrayBySwappingElements(nums1, 2));

        int[] nums2 = new int[]{1,7,6,18,2,1};
        int[] solution2 = new int[]{1, 6, 7, 18, 1, 2};
        assertArrayEquals(solution2, LeetCodeAttempt.makeLexicographicallySmallestArrayBySwappingElements(nums2, 3));

        int[] nums3 = new int[]{1,7,28,19,10};
        int[] solution3 = new int[]{1, 7, 28, 19, 10};
        assertArrayEquals(solution3, LeetCodeAttempt.makeLexicographicallySmallestArrayBySwappingElements(nums3, 3));

    }

}
