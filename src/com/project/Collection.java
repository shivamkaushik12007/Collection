package com.project;

public interface Collection<T> {
    public void add(T val);
    public void add(int index,T val);
    public void remove();
    public void remove(int index);
    public T get(int index);
    public int size();
    public boolean isEmpty();

}
