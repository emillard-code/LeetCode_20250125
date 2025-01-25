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

    public static int[] makeLexicographicallySmallestArrayBySwappingElements(int[] nums, int limit) {

        while (true) {

            int[] old_nums = Arrays.copyOf(nums, nums.length);

            for (int i = 0; i < nums.length; i++) {

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

            if (Arrays.equals(nums, old_nums)) { break;}

        }

        return nums;

    }

}
