package ru.mirea.lab23_Queues_And_Schizophrenia.n1n2;

import java.util.Arrays;

// Класс представляющий циклическую очередь
class ArrayQueue {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elements;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue() {
        this.elements = new int[DEFAULT_CAPACITY];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public void enQueue(int item) {
        //ensureCapacity();
        if (isFull())
        {
            System.out.println("Full");
        }
        else {
            if (front == -1)
            {
                front = 0;
            }
            rear++;
            elements[rear] = item; //вставляем элемент
            size++;
            System.out.println("Inserted " + item);
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int item = elements[front];
        front = (front + 1) % elements.length;
        size--;
        return item;
    }

    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }
    public int showElement(int i)
    {
        return elements[i];
    }
    public int size() {
        return size;
    }

    public boolean isEmpty()
    {
        if (front == -1)
        {
            return true;
        }
        else return false;
    }
    public boolean isFull()
    {
        if (front == 0 && rear == size-1)
        {
            return true;
        }
        return false;
    }

    public void clear() {
        Arrays.fill(elements, 0);
        front = 0;
        rear = 0;
        size = 0;
    }

//    private void ensureCapacity() {
//        if (size == elements.length) {
//            int[] newElements = new int[2 * elements.length];
//            System.arraycopy(elements, front, newElements, 0, elements.length - front);
//            System.arraycopy(elements, 0, newElements, elements.length - front, rear);
//            elements = newElements;
//            front = 0;
//            rear = size;
//        }
//    }
}