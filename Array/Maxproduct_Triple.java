// Question- Given an integer array, find a maximum product of a triplet in the array
package dsa;

import java.util.*;

public class Maxproduct_Triple {
    public static int maximumProduct(int[] nums) {
        if (nums.length < 3) {
            throw new IllegalArgumentException("Array must contain at least three elements.");
        }

        // Initialize the three largest numbers
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        // Initialize the two smallest numbers
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            // Update largest values
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // Update smallest values
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Max product of three numbers
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }

    public static void main(String[] args) {
        int[] nums = { -10, -10, 5, 2 };
        System.out.println("Maximum Product of a Triplet: " + maximumProduct(nums));
    }
}
