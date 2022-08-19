/**
 * 278. First Bad Version
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version.
 * You should minimize the number of calls to the API.
 *
 */

package Day_01;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion
{
    public int firstBadVersion(int n)
    {
        int low = 0, mid, high = n - 1, target = n;

        while (low <= high)
        {
            mid = (low + high) / 2;

            // if mid value is bad then neglect the right half
            // update high
            if (isBadVersion(mid))
            {
                target = mid;
                high = mid - 1;
            } else
            {
                // if mid value is not bad then move to the right half
                low = mid + 1;
            }
        }
        return target;
    }
}
