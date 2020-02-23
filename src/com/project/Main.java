package com.project;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(1);
        l.add(2);
        l.add(1,10);
        l.add(2,60);
        l.remove();
        l.remove();
        l.print();
        l.remove(3);
        System.out.println();
        l.print();
    }
}
