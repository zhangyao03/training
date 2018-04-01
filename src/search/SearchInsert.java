package search;

/**
 * 给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。如果没有，返回到它将会被按顺序插入的位置。
 *  你可以假设在数组中无重复元素。
 *  样例
 *  [1,3,5,6]，5 → 2
 *  [1,3,5,6]，2 → 1
 *  [1,3,5,6]，7 → 4
 *  [1,3,5,6]，0 → 0
 */
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0, right = nums.length;
        int mid;

        while (left < right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
