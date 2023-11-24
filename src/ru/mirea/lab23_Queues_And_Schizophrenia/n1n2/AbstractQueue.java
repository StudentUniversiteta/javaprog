package ru.mirea.lab23_Queues_And_Schizophrenia.n1n2;

import java.util.NoSuchElementException;

public abstract class AbstractQueue<T> implements Queue<T>
{
    protected int size;

    public void enQueue(T element) {
        if (element == null) {
            throw new NullPointerException("Cannot enqueue null element.");
        }

        enqueueElement(element);
        size++;
    }

    protected abstract void enqueueElement(T element);

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot dequeue from an empty queue.");
        }

        T element = peek();
        dequeueElement();
        size--;
        return element;
    }

    protected abstract void dequeueElement();

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot peek an element from an empty queue.");
        }

        return peekElement();
    }

    protected abstract T peekElement();

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
