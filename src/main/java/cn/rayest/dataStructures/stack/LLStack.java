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

    // 元素入栈
    public void push(int data) {
        // 如果栈为空，则新建一个节点作为初始栈
        if (headNode == null) {
            headNode = new LLNode(data);
        }
        // 判断节点数据是否为空，先用 -1 代替
        else if (headNode.getData() == -1) {
            headNode.setData(data);
        } else {
            LLNode llNode = new LLNode(data);
            llNode.setNext(headNode);
            headNode = llNode;
        }
    }

    // top: 返回但不删除元素
    public int top() {
        if (headNode == null) {
            return -1;
        } else {
            return headNode.getData();
        }
    }

    // pop: 返回并删除元素，如果空栈则抛出异常
    public int pop() {
        if (headNode == null) {
            throw new EmptyStackException();
        } else {
            int data = headNode.getData();
            // 删除头结点：出栈
            headNode = headNode.getNext();
            return data;
        }
    }

    // 判断栈是否为空：如果头结点不存在则为空，否则不为空
    public boolean isEmpty() {
        if (headNode == null) {
            return true;
        } else {
            return false;
        }
    }

    // 删除栈，直接将头结点赋值为空
    public void deleteStack() {
        headNode = null;
    }
}
