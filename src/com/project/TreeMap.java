package com.project;

public class TreeMap<K,V> implements Map<K,V> {
    private Node<K,V> root;

    public void put(K key,V val){
        root=put(root, key, val);
    }

    private Node<K,V> put(Node<K,V> root, K key, V val){
        if(root==null)
            return new Node(key,val);
        if(root.key.compareTo(key)<0)
            root.right=put(root.right,key,val);
        if(root.key.compareTo(key)>0)
            root.left=put(root.left,key,val);
        if(root.key.equals(key))
            root.val=val;
        return root;
    }

    public V get(K key){
        return get(key, root);
    }

    private V get(K key, Node<K,V> root){
        if(root==null)
            return null;
        if(root.key.equals(key))
            return root.val;
        if(root.key.compareTo(key)>0)
            return get(key, root.left);
        if(root.key.compareTo(key)<0)
            return get(key, root.right);
    }

    private class Node<K,V>{
        K key;
        V val;
        Node<K,V> left;
        Node<K,V> right;
        Node(K key,V val){
            this.key=key;
            this.val=val;
        }
    }
}
