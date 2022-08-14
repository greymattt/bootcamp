package queue.circularqueue;
class circular {
  int front;
  int rear;
  int size;
  int arr[];

  circular(int size) {
    front = 0;
    rear = 0;
    arr = new int[size];
  }

  void enQ(int x) {
    arr[rear] = x;
    rear = (rear+1)%5;
    size++;
  }

  int deQ() {
    int data = arr[front];
    front = (front+1)%5;
    size--;
    return data;
  }

  void display() {
    for (int i=0; i<size; i++)
      System.out.printf("%d ", arr[(front+i)%5]);
    System.out.println();
    for (int i: arr)
      System.out.printf("%d ", i);
  }

  public static void main(String [] args) {
    circular queue = new circular(5);
    queue.enQ(10);
    queue.enQ(20);
    queue.enQ(30);
    queue.enQ(40);
    queue.enQ(50);
    queue.enQ(60);
    queue.enQ(70);
    queue.deQ();
    queue.enQ(100);
    queue.display();
  }

}
