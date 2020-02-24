package com.project;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> l=new LinkedList<>();
        System.out.println(l.isEmpty());
        l.add(1);
        l.add(2);
        System.out.println(l.contains(10));
        l.add(1);
        l.add(2);
        System.out.println(l.get(3));
        l.add(1,10);
        System.out.println(l.contains(10));
        l.add(2,60);
        l.remove();
        l.remove();
        System.out.println(l.size());
        l.print();
        l.remove(3);
        System.out.println();
        l.print();
    }
}
