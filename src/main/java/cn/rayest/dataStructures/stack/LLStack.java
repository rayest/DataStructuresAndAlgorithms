package cn.rayest.dataStructures.stack;

import cn.rayest.dataStructures.list.LLNode;

import java.util.EmptyStackException;

/**
 * Created by Rayest on 2016/8/19 0019.
 */
public class LLStack {
    private LLNode headNode;

    public LLStack() {
        this.headNode = new LLNode();
    }

    // Ԫ����ջ
    public void push(int data) {
        // ���ջΪ�գ����½�һ���ڵ���Ϊ��ʼջ
        if (headNode == null) {
            headNode = new LLNode(data);
        }
        // �жϽڵ������Ƿ�Ϊ�գ����� -1 ����
        else if (headNode.getData() == -1) {
            headNode.setData(data);
        } else {
            LLNode llNode = new LLNode(data);
            llNode.setNext(headNode);
            headNode = llNode;
        }
    }

    // top: ���ص���ɾ��Ԫ��
    public int top() {
        if (headNode == null) {
            return -1;
        } else {
            return headNode.getData();
        }
    }

    // pop: ���ز�ɾ��Ԫ�أ������ջ���׳��쳣
    public int pop() {
        if (headNode == null) {
            throw new EmptyStackException();
        } else {
            int data = headNode.getData();
            // ɾ��ͷ��㣺��ջ
            headNode = headNode.getNext();
            return data;
        }
    }

    // �ж�ջ�Ƿ�Ϊ�գ����ͷ��㲻������Ϊ�գ�����Ϊ��
    public boolean isEmpty() {
        if (headNode == null) {
            return true;
        } else {
            return false;
        }
    }

    // ɾ��ջ��ֱ�ӽ�ͷ��㸳ֵΪ��
    public void deleteStack() {
        headNode = null;
    }
}
