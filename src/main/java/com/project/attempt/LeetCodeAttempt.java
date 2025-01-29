package com.project.attempt;

import java.util.Arrays;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1,5,3,9,8};
        System.out.println(Arrays.toString(makeLexicographicallySmallestArrayBySwappingElements(nums1, 2)));

        int[] nums2 = new int[]{1,7,6,18,2,1};
        System.out.println(Arrays.toString(makeLexicographicallySmallestArrayBySwappingElements(nums2, 3)));

        int[] nums3 = new int[]{1,7,28,19,10};
        System.out.println(Arrays.toString(makeLexicographicallySmallestArrayBySwappingElements(nums3, 3)));

    }

    // This method returns the lexicographically smallest array that can be obtained from nums[]
    // by performing any number of the operations mentioned in the challenge specifications.
    public static int[] makeLexicographicallySmallestArrayBySwappingElements(int[] nums, int limit) {

        // We will keep performing the operation until no more can be performed. Performing
        // them as much possible will lead to the lexicographically smallest array.
        while (true) {

            // We will use this array to check whether or not any changes have been
            // made to the nums[] array, so as to know when to ultimately exit the loop.
            int[] old_nums = Arrays.copyOf(nums, nums.length);

            // We will loop through the entire array.
            for (int i = 0; i < nums.length; i++) {

                // For each index i that we loop through, we will also loop through
                // every element that comes after index i. We will compare each
                // element at index j with the one at index i. If nums[i] turns out
                // to be greater than nums[j], and the difference is within the int
                // limit, then we swap their places and break from the loop.
                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[i] > nums[j] && Math.abs(nums[i] - nums[j]) <= limit) {

                        int old_i = nums[i];
                        int old_j = nums[j];

                        nums[i] = old_j;
                        nums[j] = old_i;

                        break;

                    }

                }

            }

            // If no changes occurred during this iteration of the while loop,
            // it means that no more changes can occur, and we've reached the
            // final state of the nums[] array. We break from the loop when
            // this happens.
            if (Arrays.equals(nums, old_nums)) { break;}

        }

        // Once we are done performing the operation as many times as we can,
        // we return the final state of the nums[] array.
        return nums;

    }

}
