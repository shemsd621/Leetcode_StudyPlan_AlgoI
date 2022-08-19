/**
 * 704. Binary Search
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 *
 * Algorithm with O(log n) runtime complexity
 */

package Day_01;

public class BinarySearch
{
    public int search(int[] nums, int target)
    {
        int low = 0, mid, high = nums.length - 1;

        while (low <= high)
        {
            mid = (low + high) / 2;

            // checks whether mid element is the same as the target
            if(nums[mid] == target)
                return mid;
            // move mid element to right if the target is not found on the left
            else if (nums[mid] < target)
                low = mid + 1;
            // move mid element to left if the target is not found on the right
            else
                high = mid - 1;
        }

        // return -1 if target not found
        return -1;
    }
}
