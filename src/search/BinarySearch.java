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
    public static int binarySearch2(int[] a, int length, int target) {
        if (a.length < 1 || length < 0 || target < 0) {
            return -1;
        }
        int low = 0, high = length -1, mid;
        while(low <= high) {
            mid = (low + high) / 2;

            if (a[mid] == target) {
                return mid;
            }

            if (a[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int target = 6;

        int point = binarySearch2(array, array.length, target);

        System.out.printf("point is " + point);
    }
}
