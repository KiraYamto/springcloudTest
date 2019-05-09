package org.bobo.datastruct.tree;

import java.util.List;

/**
 * @author tian.xubo
 * @created 2019 - 04 - 24 10:17
 */
public class Node {
    protected int data;
    protected List<Integer> path;
    protected Node parent;
    protected Node leftChild;
    protected Node rightChild;
    protected boolean isLeaf;
    protected int level;
    protected int deepth;
    protected int highth;

    public Node(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public List<Integer> getPath() {
        return path;
    }

    public void setPath(List<Integer> path) {
        this.path = path;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }



    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDeepth() {
        return deepth;
    }

    public void setDeepth(int deepth) {
        this.deepth = deepth;
    }

    public int getHighth() {
        return highth;
    }

    public void setHighth(int highth) {
        this.highth = highth;
    }
}
