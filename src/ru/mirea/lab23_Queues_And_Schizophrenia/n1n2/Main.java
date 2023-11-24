package ru.mirea.lab23_Queues_And_Schizophrenia.n1n2;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        //queue.enQueue(13);
        LinkedQueue que2 = new LinkedQueue();
        que2.enqueueElement(2);
        for (int i = 1; i<4; i++)
        {
            queue.enQueue(i);
            //System.out.println("Added " + i);

        }
        System.out.println("Размер очереди: " + queue.size());
        for (int i = 1; i <= queue.size(); i++)
        {
            System.out.print("|" + queue.showElement(i) + "|");
            if (i == queue.size())
            {
                System.out.print("\n");
            }
        }

//        ArrayQueueADT.enQueue(queue, 1);
//        ArrayQueueADT.enQueue(queue, 2);
//        ArrayQueueADT.enQueue(queue, 3);
//        ArrayQueueModule.enQueue(4);
//        ArrayQueueModule.enQueue(5);
//        while (!ArrayQueueADT.isEmpty(queue)) {
//            System.out.println(ArrayQueueADT.deQueue(queue));
//        }
//
//
//        while (!ArrayQueueModule.isEmpty()) {
//            System.out.println("Removed " + ArrayQueueModule.deQueue());
//        }
//        System.out.println("Empty.");
    }
}