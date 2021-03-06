package cn.rayest.dataStructures.tree;

/**
 * Created by Rayest on 2016/8/11 0011.
 */
public class BinaryTreeNode {
    private int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    // 前序遍历：递归
    public void preOrder(BinaryTreeNode root) {
        if (root == null) {
            System.out.println("null");
        } else {
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    // 中序遍历
    public void InOrder(BinaryTreeNode root) {
        if (root == null) {
            System.out.println("null");
        } else {
            InOrder(root.getLeft());
            System.out.println(root.getData());
            InOrder(root.getRight());
        }
    }

    // 后续遍历
    public void postOrder(BinaryTreeNode root) {
        if (root == null) {
            System.out.println("null");
        } else {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getData());
        }
    }

}
