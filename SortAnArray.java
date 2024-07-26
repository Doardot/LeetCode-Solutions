// Description
/*
Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) 
time complexity and with the smallest space complexity possible.
 */
class Solution {
    // Merge sort
    private void merge(int arr[], int left, int mid, int right) {
        // Find sizes of two subarray to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temp arrays
        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        // Merge the temp arrays
        int i = 0, j = 0; // Initial indices of first and second subarrays
        int k = left; // Initial index of merged subarray

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArr[] if any
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr[] if any
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    private void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + (right - 1)) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }
}

public class SortAnArray {
    public static void main(String args[]) {
        int arr[] = { 5, 1, 1, 2, 0, 0 };

        Solution sol = new Solution();
        int[] sortedArr = sol.sortArray(arr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}