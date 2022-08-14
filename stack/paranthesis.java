package stack;

class paranthesis {
  static class Stack {
    int top;
    char arr[];

    Stack(int size) {
      arr = new char[size];
      top = -1;
    }

    void push(char x) {
      arr[++top] = x;
    }

    char pop() {
      return arr[top--];
    }

    boolean isEmpty() {
      return top == -1;
    }

    char peek() {
      return arr[top];
    }

    void display() {
      for (char i: arr)
        System.out.print(i+" ");
    }
  }
  public static void main(String [] args) {
    String s = "{[]}({})";
    Stack stack = new Stack(10);
    System.out.println();
    for (int i=0; i<s.length(); i++) {
      if (s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(') {
        stack.push(s.charAt(i));
      }
      if ((s.charAt(i)==']' && stack.peek()=='[') ||
          (s.charAt(i)=='}' && stack.peek()=='{') ||
          (s.charAt(i)==')' && stack.peek()=='(')) {
                 stack.pop();
      }
    }
    if (stack.isEmpty())
      System.out.println("Balanced");
    else
      System.out.println("Not Balanced");
  }
}
