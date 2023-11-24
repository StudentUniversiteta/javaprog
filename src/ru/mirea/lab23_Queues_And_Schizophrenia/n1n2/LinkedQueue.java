package ru.mirea.lab23_Queues_And_Schizophrenia.n1n2;

public class LinkedQueue<T> extends AbstractQueue<T>
{
    private Node<T> head; // Голова очереди
    private Node<T> tail; // Хвост очереди

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    protected void enqueueElement(T element) {
        Node<T> newNode = new Node<>(element);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    protected void dequeueElement() {
        head = head.next;

        if (isEmpty()) {
            tail = null;
        }
    }

    protected T peekElement() {
        return head.data;
    }
}
