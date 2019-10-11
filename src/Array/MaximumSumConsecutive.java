package Array;

public class MaximumSumConsecutive {
    public static void main(String[] args) {
        int[] nums = {100, 200, 300, 400};

        System.out.println(maxSum(nums,nums.length,2));
    }


    static int maxSum(int arr[], int n, int k)
    {
        // k must be greater
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        // Compute sum of first window of size k
        int max_sum = 0;
        for (int i = 0; i < k; i++)
            max_sum += arr[i];

        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int window_sum = max_sum;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }

}
