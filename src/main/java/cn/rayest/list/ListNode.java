package cn.rayest.list;

/**
 * Created by Rayest on 2016/8/11 0011.
 */

// 声明一个单向链表
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

    // 遍历链表
    public int listLength(ListNode headNode) {
        int length = 0;
        ListNode currentNOde = headNode;
        while (currentNOde != null) {
            length++;
            currentNOde = currentNOde.getNext();
        }
        return length;
    }

    // 链表的节点插入
    public ListNode insertNode(ListNode headNode, ListNode newNode, int position) {

        if (headNode == null) {
            return newNode;
        }
        int size = listLength(headNode);
        if (position > size + 1 || position < 1) {
            System.out.println("插入位置有误");
            return headNode;
        }

        // 在表头插入
        if (position == 1) {
            newNode.setNext(headNode);
            return newNode;
        } else {
            // 表中或表尾插入。
            // 遍历至要插入的位置的前一个节点位置 previousNode
            ListNode previousNode = headNode;
            // count 记录 previousNode 的位置
            int count = 1;
            while (count < position - 1) {
                previousNode = previousNode.getNext();
                count++;
            }
            // 类似赋值操作的顺序
            ListNode currentNode = previousNode.getNext();
            newNode.setNext(currentNode);
            previousNode.setNext(newNode);
        }
        return headNode;
    }

    // 链表的节点删除
    public ListNode deleteNode(ListNode headNode, int position) {
        int size = listLength(headNode);
        if (position > size || position < 1) {
            System.out.println("节点删除有误");
            return headNode;
        }
        // 删除表头节点
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
