package ru.mirea.lab23_Queues_And_Schizophrenia.n1n2;

public interface Queue<T>
{
    void enQueue(T element);
    T dequeue();
    T peek();
    int size();
    boolean isEmpty();
}
