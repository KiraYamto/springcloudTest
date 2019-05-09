package org.bobo.datastruct.tree;

/**
 * @author tian.xubo
 * @created 2019 - 04 - 28 15:30
 */
public class AvlNode {
    private int data;
    private AvlNode leftChild;
    private AvlNode rightChild;
    private int height;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public AvlNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(AvlNode leftChild) {
        this.leftChild = leftChild;
    }

    public AvlNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(AvlNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
