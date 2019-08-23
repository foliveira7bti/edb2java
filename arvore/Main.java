package com.company;

public class Main {

    public static void main(String[] args) {
        Node root = new Node("Raiz");
        Node child = root.addChild("Filho 1");

        root.addChild(new Node("Filho 2");
        child.addChild("Neto 1");

        child.isSibling(child);

    }
}
