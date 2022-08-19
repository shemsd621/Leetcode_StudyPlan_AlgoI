/**
 * 35. Search Insert Position
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * Algorithm with O(log n) runtime complexity
 */

package Day_01;

public class SearchInsertPosition
{
    public int searchInsert(int[] nums, int target)
    {
        int low = 0, high = nums.length - 1;

        while (low <= high)
        {
            int mid = (low + high) / 2;

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

        return low;
    }

}

