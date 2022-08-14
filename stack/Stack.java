class Stack {
  int arr[];
  int top;
  int size;

  Stack(int size) {
    arr = new int[size];
    top = -1;
  }

  void push(int x) {
    if (isFull()) {
      System.out.println("Stack Overflow");
      System.exit(1);
    }
    arr[++top] = x;
  }

  int pop() {
    if (isEmpty()) {
      System.out.println("Stack Underflow");
    }
    return arr[top--];
  }

  boolean isFull() {
    return top == size-1;
  }

  boolean isEmpty() {
    return top == -1;
  }

  void display() {
    for (int i=0; i<= top; i++)
      System.out.printf("%d ", arr[i]);
  }
}
