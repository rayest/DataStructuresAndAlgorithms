package cn.rayest.list;

/**
 * Created by Rayest on 2016/8/11 0011.
 */

// ����һ����������
public class ListNode {
    private int data;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    // ��������
    public int ListLength(ListNode headNode){
        int length = 0;
        ListNode currentNOde = headNode;
        while (currentNOde != null){
            length++;
            currentNOde = currentNOde.getNext();
        }
        return length;
    }
}
