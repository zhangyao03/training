package sort;

/**
 * 归并排序
 * 使用递归的分解数组，然后将两个有序数组合并
 *
 * 平均时间复杂度O(N*logN)
 * 最坏时间复杂度O(N*logN)
 *
 * 空间复杂度O(N)
 */
public class MergeSort {

    /**
     * a要排序的数组
     * temp要外部传入，需要耗费n的空间
     */
    public static void mergeSort(int[] a, int first, int last, int[] temp) {
        if (a.length <= 1) {
            return;
        }
        int mid = 0;
        if (first < last) {
            mid = (first + last) / 2;
            mergeSort(a, first, mid, temp);
            mergeSort(a, mid + 1, last, temp);
            mergeArray(a, first, mid, last, temp);
        }
    }

    private static void mergeArray(int[] a, int first, int mid, int last, int[] temp) {
        int i = first, j = mid;
        int m = mid + 1, n = last;
        int k = 0;

        while (i <= j && m <= n) {
            if (a[i] < a[m]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[m++];
            }
        }

        // 其中一部分结束
        while (i <= j) {
            temp[k++] = a[i++];
        }

        while (m <= n) {
            temp[k++] = a[m++];
        }

        for (int q = 0; q < k; q++) {
            a[first + q] = temp[q];
        }
    }

}
