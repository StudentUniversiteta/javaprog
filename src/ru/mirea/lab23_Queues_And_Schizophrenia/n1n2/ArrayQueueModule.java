package ru.mirea.lab23_Queues_And_Schizophrenia.n1n2;

// Класс для работы с единственным экземпляром очереди
class ArrayQueueModule {
    private static ArrayQueue queue = new ArrayQueue();

    public static void enQueue(int item) {
        queue.enQueue(item);
    }

    public static int deQueue() {
        return queue.deQueue();
    }

    public static int element() {
        return queue.element();
    }

    public static int size() {
        return queue.size();
    }

    public static boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void clear() {
        queue.clear();
    }
}