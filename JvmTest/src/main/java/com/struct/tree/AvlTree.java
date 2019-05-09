package com.struct.tree;

/**
 * @author tian.xubo
 * @created 2019 - 04 - 28 15:32
 */
public class AvlTree {
    private AvlNode root;

    int height(AvlNode node){
        if(node == null){
            return -1;
        }else{
            return node.getHeight();
        }
    }
    int max(int a,int b){
        return a>b?a:b;
    }
    //左左
    AvlTree singleRotateWithLeftLeft(AvlTree tree){
        AvlNode root = tree.getRoot(); //k1
        AvlNode newRoot = root.getLeftChild();//k2
        root.setLeftChild(newRoot.getRightChild());
        newRoot.setRightChild(root);
        root.setHeight(max( height(root.getLeftChild()), height(newRoot.getRightChild())) + 1);
        newRoot.setHeight(max( height(root.getLeftChild()), newRoot.getHeight()) + 1);
        return tree;
    }
    //右右
    AvlTree singleRotateWithRightRight(AvlTree tree){
        AvlNode root = tree.getRoot();
        AvlNode newRoot = root.getRightChild();
        root.setRightChild(newRoot.getLeftChild());
        newRoot.setLeftChild(root);
        tree.setRoot(newRoot);
        return tree;
    }

    public AvlTree(int data) {
        AvlNode root = new AvlNode();
        root.setData(data);
        root.setHeight(0);
        this.root = root;
    }
    public AvlTree(AvlNode root) {
        this.root = root;
    }

    public AvlNode getRoot() {
        return root;
    }

    public void setRoot(AvlNode root) {
        this.root = root;
    }
}
