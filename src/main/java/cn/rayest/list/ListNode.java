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
    public int listLength(ListNode headNode) {
        int length = 0;
        ListNode currentNOde = headNode;
        while (currentNOde != null) {
            length++;
            currentNOde = currentNOde.getNext();
        }
        return length;
    }

    // ����Ľڵ����
    public ListNode insertNode(ListNode headNode, ListNode newNode, int position) {

        if (headNode == null) {
            return newNode;
        }
        int size = listLength(headNode);
        if (position > size + 1 || position < 1) {
            System.out.println("����λ������");
            return headNode;
        }

        // �ڱ�ͷ����
        if (position == 1) {
            newNode.setNext(headNode);
            return newNode;
        } else {
            // ���л��β���롣
            // ������Ҫ�����λ�õ�ǰһ���ڵ�λ�� previousNode
            ListNode previousNode = headNode;
            // count ��¼ previousNode ��λ��
            int count = 1;
            while (count < position - 1) {
                previousNode = previousNode.getNext();
                count++;
            }
            // ���Ƹ�ֵ������˳��
            ListNode currentNode = previousNode.getNext();
            newNode.setNext(currentNode);
            previousNode.setNext(newNode);
        }
        return headNode;
    }

    // ����Ľڵ�ɾ��
    public ListNode deleteNode(ListNode headNode, int position) {
        int size = listLength(headNode);
        if (position > size || position < 1) {
            System.out.println("�ڵ�ɾ������");
            return headNode;
        }
        // ɾ����ͷ�ڵ�
        else if (position == 1) {
            ListNode currentNode = headNode.getNext();
            headNode = null;
            return currentNode;
        }
        else {
            ListNode previousNode = headNode;
            int count = 1;
            while (count < position){
                previousNode = previousNode.getNext();
                count++;
            }
            ListNode currentNode = previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
            currentNode = null;
        }
        return headNode;
    }
}
