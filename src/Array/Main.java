//27. Remove Element
package Array;
/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input
array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */

import java.util.Arrays;

public class Main {
  static   public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }

        }
      System.out.println(Arrays.toString(nums));
      return n;
    }
    public static void main(String[] args) {
         int []nums= {3,2,2,3};
        System.out.println(removeElement(nums,4));
    }
}
