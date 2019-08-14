package lintcode;

/**
 * 动态规划练习
 *
 * @author alfred.zhang
 * @date 2019/8/14
 */
public class DynamicProgramming {





    /**
     * 最少成本的爬台阶
     * stepCost表示到达几个台阶的成本
     */
    public int minCostClimbingStairs(int[] cost) {
        int[] stepCost = new int[cost.length + 1];

        stepCost[0] = 0;
        stepCost[1] = 0;
        for (int i = 2; i < stepCost.length; i ++) {
            stepCost[i] = min(stepCost[i - 1] + cost[i - 1], stepCost[i - 2] + cost[i - 2]);
        }

        return stepCost[cost.length];
    }

    private int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

}
