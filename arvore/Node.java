package com.company;

import java.util.ArrayList;

public class Node {
    private String name;
    private ArrayList<Node> children;
    private Node parent = null;

    public Node(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public boolean isLeaf()
    {
        return children.isEmpty();
    }

    public int nodeDegree()
    {
        return children.size();
    }

    public int treeDegree()
    {
        //TODO calcular qual o grau da árvore
        return 0;
    }

    public boolean isSibling(Node other)
    {
        if(other == null || other == this)
        {
            return false;
        }
        return other.parent == this.parent;
    }

    public Node addChild(String name) {
        Node node = new Node(name);
        return addChild(node);
    }

    public Node addChild(Node node){
        children.add(node);
        node.parent = this;
        return node;
    }

    public Node getParent() {
        return parent;
    }
}
