package cn.rayest.dataStructures.list;

/**
 * Created by Rayest on 2016/8/16 0016.
 */
// ����˫������
public class DLLNode {
    /*
        ˫��������Ҫ��
        1. ����Ԫ��
        2. ָ��ǰ���ڵ��ָ�룺previous
        3. ָ����Ԫ�ص�ָ�룺next
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

    // ��ȡ����ĳ���
    public int getDLLLength(DLLNode headNode){
        int length = 0;
        DLLNode currentNode = headNode;
        while (currentNode != null){
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    // ����ڵ�
    public DLLNode insertNode(DLLNode headNode, DLLNode nodeToInsert, int position){
        // ������
        if (headNode == null){
            return headNode;
        }
        int size = getDLLLength(headNode);
        // �жϲ���λ���Ƿ�����
        if (position > size + 1 || position < 1){
            System.out.println("����λ������");
        }
        // ���ͷ����ڵ�
        else if (position == 1){
            nodeToInsert.setNext(headNode);
            headNode.setPrevious(nodeToInsert);
            return nodeToInsert;
        }
        // ���β����в���ڵ�
        else {
            // ��ʼ����ͷ���Ϊ previousNode
            DLLNode previousNode = headNode;
            // ���������� 1 ��ʼ
            int count = 1;
            // �ж��Ƿ������Ҫ����ڵ��ǰһ���
            while (count < position - 1){
                previousNode = previousNode.getNext();
                count++;
            }
            // ����������ڵ��ǰһ�ڵ�ʱ����Ҫ����λ�õĽڵ�����Ϊ currentNode
            DLLNode currentNode = previousNode.getNext();
            // ��Ҫ����ڵ�ĺ����ڵ�ָ��Ϊ currentNode
            nodeToInsert.setNext(currentNode);
            if (currentNode != null){
                currentNode.setPrevious(nodeToInsert);
            }
            previousNode.setNext(nodeToInsert);
            nodeToInsert.setPrevious(previousNode);
        }
        return headNode;
    }

    // ɾ���ڵ�
    public DLLNode deleteNode(DLLNode headNode, int position){
        int size = getDLLLength(headNode);
        if (position > size + 1 || position < 1){
            System.out.println("ɾ���ڵ�����");
            return headNode;
        }
        // ɾ��ͷ���
        else if (position == 1){
            DLLNode currentNode = headNode.getNext();
            // ���Ѿ�ɾ����ͷ����ÿ�
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
            // ���Ѿ�ɾ���Ľڵ��ÿ�
            currentNode = null;
        }
        return headNode;
    }

}
