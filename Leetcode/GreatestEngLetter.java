package Leetcode;
import java.util.*;

class GreatestEngLetter {
    public static void main(String [] args) {
        String s = "arRAzFif";
        Stack<Character> stack = new Stack<Character>();
        char arr[] = s.toCharArray();
        for (i=0; i<arr.length; i++) {
            if (arr[i].isUpper()) {

            }

            else {
                stack.push(arr[i]);
            }
        }
    }
}
