package sort;

/**
 * 插入排序
 * 平均时间复杂度为O(N*N)
 *
 *
 */
public class InsertSort {

    /**
     * n表示数组的长度
     */
    public static void insertSort(int[] a, int n) {
        int i, j, k, temp = 0;
        boolean flag;

        for (i = 1; i < n; i++) {

            flag = false; // 每轮flag重置，避免上一轮干扰
            for (j = 0; j < i; j++) {
                if (a[j] > a[i]) {
                    flag = true;
                    temp = a[i];
                    break;
                }
            }

            if (flag) {
                for (k = i; k > j; k--) {
                    a[k] = a[k-1];
                }

                a[j] = temp;
            }

        }
    }
}
