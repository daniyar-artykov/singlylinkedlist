package com.quangnguyen.dto;

/**
 * Created by quang.nguyen on 6/21/17.
 */
public class Node {
    protected int val;
    protected Node link;

    public Node() {
        link = null;
        val = 0;
    }

    public Node(int d, Node n) {
        val = d;
        link = n;
    }

    public void setLink(Node n) {
        link = n;
    }

    public void setVal(int d) {
        val = d;
    }

    public Node getLink() {
        return link;
    }

    public int getVal() {
        return val;
    }
}
