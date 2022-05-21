package com.company;

public class TreeNode <E extends Comparable<E>>{
    private TreeNode<E>left;
    private E data;
    private TreeNode<E>right;

    public TreeNode(E element){
        data = element;
        left = right = null;
    }

    public E getData() {
        return data;
    }

    public TreeNode<E> getLeft() {
        return left;
    }
    public TreeNode<E> getRight() {
        return right;
    }
    public void insert(E value){
        if (value.compareTo(data)<0) {
            if (left == null) {
                left = new TreeNode<>(value);
                System.out.println(value + " ditambahkan ke child kiri dari parent " + data);
            } else{
                left.insert(value);
            }
        } else if (value.compareTo(data)>0) {
            if (right == null) {
                right = new TreeNode<>(value);
                System.out.println(value + " ditambahkan ke ke child kanan dari parent " + data);
            } else{
                right.insert(value);
            }
        }
    }
}
