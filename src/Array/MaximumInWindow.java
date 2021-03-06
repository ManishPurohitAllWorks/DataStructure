package Array;

import java.util.*;

public class MaximumInWindow {
    public static Integer[] maxsInEveryWindows(int[] arr, int k) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        /* Process first k (or first window) elements of array */
        for (int i = 0; i < k; i++) {
            // For very element, the previous smaller elements are useless so
            // remove them from deque
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast(); // Remove from rear
            }
            // Add new element at rear of queue
            deque.addLast(i);
        }
        List<Integer> result = new ArrayList<Integer>();
        // Process rest of the elements, i.e., from arr[k] to arr[n-1]
        for (int i = k; i < arr.length; i++) {
            // The element at the front of the queue is the largest element of
            // previous window, so add to result.
            result.add(arr[deque.getFirst()]);
            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            // Remove the elements which are out of this window
            while (!deque.isEmpty() && deque.getFirst() <= i - k) {
                deque.removeFirst();
            }
            // Add current element at the rear of deque
            deque.addLast(i);
        }
        // Print the maximum element of last window
        result.add(arr[deque.getFirst()]);

        return result.toArray(new Integer[0]);
    }

    public static void main(String args[])
    {
        int nums[]={1,-2,5,1,0,2,8,-1,2,0};
        System.out.println(Arrays.toString(maxsInEveryWindows(nums,3)));

    }
}
