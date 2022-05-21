package com.company;

public class Main {

    public static void main(String[] args) {
        Tree<String> q = new Tree<>();
        q.InsertNode("F");
        q.InsertNode("E");
        q.InsertNode("H");
        q.InsertNode("D");
        q.InsertNode("G");
        q.InsertNode("C");
        q.InsertNode("B");
        q.InsertNode("H");
        q.InsertNode("K");
        q.InsertNode("J");
        q.searchBST("K");
        q.searchBST("A");
    }
}
