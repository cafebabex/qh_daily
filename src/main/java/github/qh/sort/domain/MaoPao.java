package github.qh.sort.domain;

import github.qh.sort.application.Sort;

/**
 * @author a58
 * 冒泡排序
 */
public class MaoPao implements Sort {

    /**
     * 冒泡排序
     * 基本思路：第一次循环挑出最小的放在第一位
     * 第二次循环挑出剩下里面最小的放在第二位
     * 以此类推...
     *
     * @param arr 待排序数组
     */
    @Override
    public void sort(int[] arr) {
        for (var i = 0; i < arr.length; i++) {
            for (var j = i + 1; j < arr.length; j++) {
                //主循环的变量,他要跟他后面的所有元素进行比较
                int i1 = arr[i];
                //次循环变量,和主循环变量比较找出比较小的然后交换
                int i2 = arr[j];
                //交换
                if (i1 > i2) {
                    arr[i] = i2;
                    arr[j] = i1;
                }
            }
        }
    }

    /**
     * 对上面冒泡的一种优化
     * 如果第二次循环的时候，没有发生位置交换，代表当前已经是有序的了，直接跳出即可
     * @param arr 待排序数组
     */
    public void optimized(int[] arr){
        for (var i = 0; i < arr.length; i++) {
            var exchange = false;
            for (var j = i + 1; j < arr.length; j++) {
                //主循环的变量,他要跟他后面的所有元素进行比较
                int i1 = arr[i];
                //次循环变量,和主循环变量比较找出比较小的然后交换
                int i2 = arr[j];
                //交换
                if (i1 > i2) {
                    arr[i] = i2;
                    arr[j] = i1;
                    exchange = true;
                }
            }

            //没有交换，直接跳出
            if(!exchange){
                return;
            }
        }
    }
}
