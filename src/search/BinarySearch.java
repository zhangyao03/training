package search;

/**
 * 二分查找
 * 基于有序数组查找
 */
public class BinarySearch {

    // 递归实现
    public static int binarySearch1(int[] a, int low, int high, int target) {

        if (a.length < 1 || target < 0 || low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (a[mid] == target) {
            return mid;
        }

        if (a[mid] > target) {
             return binarySearch1(a, low, mid - 1, target);
        } else {
            return binarySearch1(a, mid + 1, high, target);
        }
    }

    // 非递归的实现
    public static int binarySearch2(int[] nums, int target) {
        if (nums.length < 1 || target < 0) {
            return -1;
        }
        int left = 0, rigth = nums.length -1, mid;

        while(left <= rigth) {
            mid = (left + rigth) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                rigth = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static int binarySearch3(int[] nums, int target) {
        if (nums.length < 1 || target < 0) {
            return -1;
        }
        int left = 0, right = nums.length -1, mid;

        while (left < right) {
            mid = (left + right) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (nums[left] == target) {
            return left;
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int target = 6;

        int point = binarySearch2(array, target);

        System.out.printf("point is " + point);
    }
}
