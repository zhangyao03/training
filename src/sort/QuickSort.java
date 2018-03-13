package sort;

/**
 * 快速排序，快速搞定
 * 俗称:挖坑填数+分治法
 *
 * 平均时间复杂度O(N*logN)
 * 最坏时间复杂度O(N*N)，最坏情况是每次划分选取的基准都是当前无序区中关键字最小(或最大)的记录
 *
 * 平均空间复杂度O(logN)，快速排序在系统内部需要一个栈来实现递归。
 */
public class QuickSort {

    public static void quickSort(int[] s, int low, int high) {
        if (s.length < 1) {
            return;
        }

        if (low < high) {
            int middle = partition(s, low, high);
            quickSort(s, low, middle - 1);
            quickSort(s, middle + 1, high);
        }
    }

    public static int partition(int[] unsorted, int low, int high) {
        if (unsorted.length < 1) {
            return low;
        }

        int point = unsorted[low];
        while (low < high) {
            while (low < high && unsorted[high] >= point) {
                high--;
            }
            if (low < high) {
                unsorted[low] = unsorted[high];
            }

            while (low < high && unsorted[low] <= point) {
                low++;
            }
            if (low < high) {
                unsorted[high] = unsorted[low];
            }
        }
        unsorted[low] = point;

        return low;
    }
}
