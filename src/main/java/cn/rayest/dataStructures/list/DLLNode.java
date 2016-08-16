package cn.rayest.dataStructures.list;

/**
 * Created by Rayest on 2016/8/16 0016.
 */
// 声明双向链表
public class DLLNode {
    /*
        双向链表三要素
        1. 数据元素
        2. 指向前驱节点的指针：previous
        3. 指向后继元素的指针：next
     */
    private int data;
    private DLLNode next;
    private DLLNode previous;

    //
    public DLLNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DLLNode getNext() {
        return next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }

    public DLLNode getPrevious() {
        return previous;
    }

    public void setPrevious(DLLNode previous) {
        this.previous = previous;
    }

    // 获取链表的长度
    public int getDLLLength(DLLNode headNode){
        int length = 0;
        DLLNode currentNode = headNode;
        while (currentNode != null){
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    // 插入节点
    public DLLNode insertNode(DLLNode headNode, DLLNode nodeToInsert, int position){
        // 空链表
        if (headNode == null){
            return headNode;
        }
        int size = getDLLLength(headNode);
        // 判断插入位置是否有误
        if (position > size + 1 || position < 1){
            System.out.println("插入位置有误");
        }
        // 向表头插入节点
        else if (position == 1){
            nodeToInsert.setNext(headNode);
            headNode.setPrevious(nodeToInsert);
            return nodeToInsert;
        }
        // 向表尾或表中插入节点
        else {
            // 初始化表头结点为 previousNode
            DLLNode previousNode = headNode;
            // 遍历链表，从 1 开始
            int count = 1;
            // 判断是否遍历到要插入节点的前一结点
            while (count < position - 1){
                previousNode = previousNode.getNext();
                count++;
            }
            // 遍历到插入节点的前一节点时，将要插入位置的节点设置为 currentNode
            DLLNode currentNode = previousNode.getNext();
            // 将要插入节点的后驱节点指向为 currentNode
            nodeToInsert.setNext(currentNode);
            if (currentNode != null){
                currentNode.setPrevious(nodeToInsert);
            }
            previousNode.setNext(nodeToInsert);
            nodeToInsert.setPrevious(previousNode);
        }
        return headNode;
    }

    // 删除节点
    public DLLNode deleteNode(DLLNode headNode, int position){
        int size = getDLLLength(headNode);
        if (position > size + 1 || position < 1){
            System.out.println("删除节点有误");
            return headNode;
        }
        // 删除头结点
        else if (position == 1){
            DLLNode currentNode = headNode.getNext();
            // 将已经删除的头结点置空
            headNode = null;
            currentNode.setPrevious(null);
            return currentNode;
        }
        else {
            DLLNode previousNode = headNode;
            int count = 1;
            while (count < position - 1){
                previousNode = previousNode.getNext();
                count++;
            }
            DLLNode currentNode = previousNode.getNext();
            DLLNode laterNode = currentNode.getNext();
            previousNode.setNext(laterNode);
            if (laterNode != null){
                laterNode.setPrevious(previousNode);
            }
            // 将已经删除的节点置空
            currentNode = null;
        }
        return headNode;
    }

}
