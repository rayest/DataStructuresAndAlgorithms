package cn.rayest.sort;

/**
 * Created by Rayest on 2016/8/11 0011.
 */

// ѡ������
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
        // �� n ��Ԫ�أ�Ҫ�Ƚ� n-1 ��
        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            // �ҳ���ǰ�����е���Сֵ
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            // �õ�ǰλ�õ�ֵ������Сֵ
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;

        }
    }
}

