package com.project;

public class LinkedList<T> implements List<T> {
    private Node<T> head;
    int size=0;

    //to check whether the linked list is empty or not
    public boolean isEmpty(){
        if(this.head==null)
            return true;
        return false;
    }


    //to return the size of the linked list
    public int size(){
        return this.size;
    }

    //to check whether the value is present in linked list or not
    public boolean contains(T val){
        return contains(head, val);
    }


    private boolean contains(Node<T> head, T val){
        while(head!=null){
            if(head.val==val)
                return true;
            head=head.next;
        }
        return false;
    }
//     @Override
//     public Iterator<Integer> iterator() {
//         return new Iterator<Integer>(){
//             private Node temp=head;
//             @Override
//             public boolean hasNext(){
//                 return temp!=null;
//             }

//             public Integer next(){
//                 int t=temp.key;
//                 temp=temp.next;
//                 return t;
//             }
//         };
//     }

    //to add the  element at end of the list
    public void add(T val) {
        head=add(head,val);
        this.size++;
    }


    private Node<T> add(Node<T> head,T val){
        if(head==null){
            return new Node(val);
        }

        head.next=add(head.next,val);
        return head;
    }


    //to add the element at some specific index
    public void add(int index,T val){
        add(head, index, val);
    }


    private void add(Node<T> head,int index,T val){
        Node<T> n=new Node(val);
        this.size++;
        if(index==0){
            n.next=head;
            this.head=n;
            return;
        }

        Node<T> temp=head;
        int cnt=0;

        while(cnt<index-1 && temp.next!=null){
            temp=temp.next;
            cnt++;
        }

        n.next=temp.next;
        temp.next=n;
        return;
    }


    //to remove the element from end of the linked list
    public void remove(){
        remove(head);
    }


    private void remove(Node<T> head){
        Node<T> temp=head;

        if(temp==null)
            return;

        this.size--;
        if(temp.next==null){
            this.head=null;
            return;
        }

        while(temp.next.next!=null){
            temp=temp.next;
        }

        temp.next=null;
    }


    //to remove the element from the specific index
    public void remove(int index ){
        if(head==null)
            return;

        remove(head,index);
    }


    private void remove(Node<T> head,int index){
        if(index==0){
            this.head=head.next;
            this.size--;
            return;
        }

        int cnt=0;
        Node<T> temp=head;

        while(cnt<index-1 && temp!=null){
            temp=temp.next;
            cnt++;
        }

        if(temp==null){
            System.out.println();
            System.out.println("List index out of bound element can not be deleted");
            return;
        }
        this.size--;
        temp.next=temp.next.next;
    }


    //to get the element from list
    public T get(int index){
        return get(head,index);
    }

    private T get(Node<T> head,int index){
        if(index>=this.size){
            System.out.println("index out of bound element cannot be retrieved");
            return null;
        }
        for(int i=0;i<index;i++){
            head=head.next;
        }
        return head.val;
    }
//  for testing purposes!
    public void print(){
        Node<T> temp=head;
        if(head==null){
            System.out.println("empty list");
            return;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }


    private static class Node<T>{
        T val;
        Node<T> next;
        Node(T val){
            this.val=val;
            this.next=null;
        }
    }

}
