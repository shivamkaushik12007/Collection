package com.project;

public interface List<T> extends Collection<T> {
    void add(T val);
    void add(int index,T val);
    void remove();
    void remove(int index);
    T get(int index);
    int size();
    boolean isEmpty();

}
