package com.example;

/**
 * @Description: 插入排序
 *
 * 是一个稳定的排序算法
 * 空间复杂度为 O(1)：运行并不需要额外的存储空间
 * 最好情况时间复杂度是 O(n)
 * 最坏情况时间复杂度为 O(n2)
 * 平均情况下的时间复杂度就是 O(n2)
 *
 *
 *
 *
 * @Author: Shichao.Lu
 * @Date: Created in 11:01 2019/9/5
 */
public class InsertSort {

    /**
     * 插入排序
     * @param a 表示数组
     * @param n 表示数组大小
     */
    public void insertionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    // 数据移动
                    a[j+1] = a[j];
                } else {
                    break;
                }
            }
            // 插入数据
            a[j+1] = value;
        }
    }


}
