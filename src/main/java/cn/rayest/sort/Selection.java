package cn.rayest.sort;

/**
 * Created by Rayest on 2016/8/11 0011.
 */

// 选择排序法
public class Selection {
    public static void main(String[] args) {
        int[] a = new int[]{1, 0, 2, 9, 3, 9527, 5, 4, 6, 7, 8};
        selection(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void selection(int[] a) {
        int min;
        int temp;
        // 有 n 个元素，要比较 n-1 次
        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            // 找出当前序列中的最小值
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            // 用当前位置的值交换最小值
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;

        }
    }
}

