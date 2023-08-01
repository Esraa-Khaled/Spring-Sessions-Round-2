package org.example.configurations;

public interface crudOperations<T> {

    int count();
    T getById(int id);
    T add(T obj);

    //update & delete
}
