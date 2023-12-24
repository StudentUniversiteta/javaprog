package ru.mirea.lab23_Queues_And_Schizophrenia;
import java.util.Queue;
import java.util.LinkedList;

/*
По заданию шизофрения, нужно раз десять реализовать
различные сексуальные девиации одной и той же программы/
По сути везде делаем то что ниже.
Оно всё может быть реализовано одним импортом
библиотеки Queue, но ладно

Enqueue() - добавление в конец, ничего не возвращает
Dequeue() - удаление из начала, возвращает удаленный элемент
Peek() - просмотр очереди, возвращает элемент, на который указывает
передний указатель (??) в очереди
isFull() (Queue overflow)
isEmpty() (Queue underflow)
Линейная/простая очередь - вставка выполняется только с заднего конца.
Даже после удаления элементов не получится впихнуть больше
Циклическая очередь - после последнего элемента идёт первый.
Новые элементы можно добавлять в пустые места
Очередь с приоритетами (А, Б) - Элементы располагаются в зависимости от их приоритета
Если приоритет одинаковый, то располагаются по принципу first in - first out
А - С возрастающим приоритетом
Б - с убывающим
В файле stroke, не понял как эти две работают
Двойная очередь (deque/double ended que) - вставка и удаление с обоих концов

*/
public class README
{
    int size = 5;
    int items[] = new int[size];
    int front, rear;
    README()
    {
        front = -1;
        rear = -1;
    }
    boolean isFull()
    {
        if (front == 0 && rear == size-1)
        {
            return true;
        }
        return false;
    }
    boolean isEmpty()
    {
        if (front==-1)
        {
            return true;
        }
        else return false;
    }
    void enQueue(int element)
    {
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

            items[rear] = element; //вставляем элемент в жопу
            System.out.println("Inserted " + element);
        }
    }
    int deQueue()
    {
        int element;
        if (isEmpty())
        {
            System.out.println("Empty");
            return (-1);
        }
        else {
            element = items[front];
            if (front >= rear)
            {
                front = -1;
                rear = -1;
            }
            else
            {
                //следующий элемент становится первым
                front++;
            }
            System.out.println("Deleted " + element);
            return (element);
        }
    }
    void display()
    {
        int i;
        if (isEmpty())
        {
            System.out.println("Nothing to display");
        }
        else
        {
            System.out.println("\nFront index->" + front);
        }
        System.out.println("Items->");
        for(i = front; i<= rear; i++)
        {
            System.out.print("|" + items[i] + "|");
        }
        System.out.println("\nRead index->" + rear);
    }
    public static void main(String[] args)
    {
        Queue<Integer> que = new LinkedList<>();
        //QueueBasics que = new QueueBasics();

        for (int i = 1; i < 6; i++)
        {
            que.offer(i); // enque
        }
        System.out.println("Queue: " + que);
        int removedNumber = que.poll(); // deque
        System.out.println("Removed " + removedNumber);
        System.out.println("Que after deletion: " + que);
    }
}


