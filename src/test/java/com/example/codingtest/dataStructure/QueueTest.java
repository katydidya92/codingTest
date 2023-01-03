package com.example.codingtest.dataStructure;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest<T> {

    @Test
    void queueTest() {
        Queue<Integer> queueList = new LinkedList<>();

        queueList.add(1);
        queueList.offer(2);
        System.out.println(queueList);

        queueList.poll();
        System.out.println(queueList);

        queueList.add(1);
        System.out.println(queueList);

        queueList.remove();
        System.out.println(queueList);


        System.out.println("=========================");

        QueueTest<Integer> myQueue = new QueueTest<>();
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.enQueue(5);
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
    }

    private ArrayList<T> queue = new ArrayList<>();

    public void enQueue(T item) {
        queue.add(item);
    }

    public T deQueue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }
}
