package lintcode;

/**
 * @author alfred.zhang
 * @date 2021/10/26
 */
public class TopK {

    public static void printLeastNumbers(int[] array) {
        int k = 10;
        if (array.length < 1) {
            return;
        }

        if (array.length <= k) {
            print(array, 0, array.length - 1);
            return;
        }

        getLeastPart(array, 0, array.length - 1, k);
        print(array, 0, k - 1);

    }

    private static void getLeastPart(int[] array, int low, int high, int k) {
        if (low > high) {
            return;
        }

        int point = partition(array, low, high);
        if (point == k) {
            return;
        } else if (point > k) {
            getLeastPart(array, low, point - 1, k);
        } else {
            getLeastPart(array, point + 1, high, k);
        }
    }

    private static int partition(int[] array, int low, int high) {
        if (array.length < 1 || low > high) {
            return low;
        }

        int point = array[low];
        while (low < high) {
            while (low < high && point < array[high]) {
                high--;
            }
            array[low] = array[high];

            while (low < high && point >= array[low]) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = point;
        return low;
    }


    private static void print(int[] array, int low, int high) {
        if (array.length < 1 || low > high) {
            return;
        }
        for (int i = low; i <= high; i++) {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {
        int[] array = {1 , 2 ,4 ,6, 0, 11, 18, 5, 3, 10, 15, 12, 11, 7, 8, 9};

        System.out.println("before");
        print(array, 0, array.length - 1);
        printLeastNumbers(array);
        System.out.println("end");
        print(array, 0, array.length - 1);


    }
}
