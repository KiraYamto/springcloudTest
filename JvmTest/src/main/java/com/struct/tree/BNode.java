package com.struct.tree;

import java.util.List;

/**
 * @author tian.xubo
 * @created 2019 - 04 - 24 10:31
 */
public class BNode implements INode {
    private Object data;
    private List<Integer> path;
    private Node parent;
    private INode leftChild;
    private INode rightChild;
    private boolean isLeaf;
    private int level;
    private int deepth;
    private int highth;
}
