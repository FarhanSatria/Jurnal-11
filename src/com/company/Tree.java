package com.company;

public class Tree <E extends Comparable<E>>{
    private TreeNode<E> root;
    public Tree(){
        root = null;
    }
    public void InsertNode(E tambahdata){
        if (root == null) {
            root = new TreeNode<>(tambahdata);
            System.out.println(tambahdata + " adalah root");
        }else{
            root.insert(tambahdata);
        }
    }
    public void searchBST(E key){
        boolean hasil = searchBSTHelper(root, key);
        if(hasil)
            System.out.println("Node " + key + " ditemukan");
        else
            System.out.println("Node " + key + " tidak ditemukan");
    }

    public boolean searchBSTHelper(TreeNode<E> node, E key){
        boolean result = false;
        if(node!=null){
            if(key.equals(node.getData()))
                result = true;
            else if(key.compareTo(node.getData())<0)
                result = searchBSTHelper(node.getLeft(),key);
            else
                result = searchBSTHelper(node.getRight(),key);
        }
        return result;
    }
}