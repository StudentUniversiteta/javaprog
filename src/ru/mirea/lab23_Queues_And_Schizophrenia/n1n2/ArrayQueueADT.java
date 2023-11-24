package ru.mirea.lab23_Queues_And_Schizophrenia.n1n2;

// Класс для работы с очередью как абстрактным типом данных
class ArrayQueueADT {
    public static void enQueue(ArrayQueue queue, int item) {
        queue.enQueue(item);
    }

    public static int deQueue(ArrayQueue queue) {
        return queue.deQueue();
    }

    public static int element(ArrayQueue queue) {
        return queue.element();
    }

    public static int size(ArrayQueue queue) {
        return queue.size();
    }

    public static boolean isEmpty(ArrayQueue queue) {
        return queue.isEmpty();
    }

    public static void clear(ArrayQueue queue) {
        queue.clear();
    }
}