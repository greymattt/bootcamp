package queue;

import java.util.*;
public class queue {
    int front;
    int rear;
    int arr[];

    queue(int size) {
        front = -1;
        rear = -1;
        arr = new int[size];
    }

    void enQueue(int data) {
        if (rear == -1)
            front++;
        else if (rear == size-1 || front>rear)
            System.out.println("Queue full");
        else
            arr[rear++] = data;
    }

    public static void main(String [] args) {}
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        queue que = new queue(size);
        for (int i=0; i<size; i++)
            que.enQueue(sc.nextInt());
    }

}
