package com.example;

/**
 * @Description: 冒泡排序
 *
 *  是一个原地排序算法
 *  是一个稳定的排序算法
 *  空间复杂度为 O(1)：只涉及相邻数据的交换操作，只需要常量级的临时空间
 *  最好情况时间复杂度是 O(n)，排序的数据有序，[1,2,3,4,5,6]
 *  最坏情况时间复杂度为 O(n2)，排序的数据倒序[6,5,4,3,2,1]
 *  平均情况下的时间复杂度就是 O(n2)
 *
 *
 * @Author: Shichao.Lu
 * @Date: Created in 17:56 2019/9/4
 */
public class BubbleSort {

    /**
     * 冒泡排序
     *
     * @param a 数组
     * @param n 数组大小
     */
    public void bubbleSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                // 交换
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    // 表示有数据交换
                    flag = true;
                }
            }
            if (!flag) {
                break;  // 没有数据交换，提前退出
            }
        }
    }

}
