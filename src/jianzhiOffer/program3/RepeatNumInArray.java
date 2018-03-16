package jianzhiOffer.program3;

/**
 * 找出数组中任意重复的数
 *
 */
public class RepeatNumInArray {


    /**
     * 题目：找出数组中任意重复的数
     * 在一个长度为n的数组里的所有数字都在0～n-1的范围内。数组中某些数字是重复的，重复的数字与重复的次数均不确定。找出数组中任意重复的数。
     *
     * 解法：通过交换坐标与坐标值找到
     *
     */
    public static int getRepeatNumByExchange(int[] a) {
        if (a.length <= 1) {
            return -1;
        }

        int temp, point;
        for (int i = 0; i < a.length -1; i++) {
            while (a[i] != i) {
                point = a[i];

                if (a[point] == point) {
                    return point;
                }

                temp = a[i];
                a[i] = a[point];
                a[point] = temp;
            }
        }

        return -1;
    }

    /**
     * 题目：不修改数组找出重复的数
     * 在一个长度为n+1的数组里的所有数字都在1～n的范围内。数组中某些数字是重复的，重复的数字与重复的次数均不确定。找出数组中任意重复的数。
     *
     * 解法：
     * 1、复制一个临时数组，使用之前的交换方法，需要O(n)的临时空间
     * 2、按照二分查找的思路
     *
     */
    public static int getRepeatNum(int[] a) {
        if (a.length <= 1) {
            return -1;
        }

        int n = a.length - 1;

        return -1;
    }

    public static void main(String[] args) {
        int array[] = {3, 2 ,1, 4, 5, 6, 2, 7};
        int result = getRepeatNumByExchange(array);

        System.out.printf("The repeat num is: " + result);
    }
}
