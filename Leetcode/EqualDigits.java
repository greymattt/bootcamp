package Leetcode;
import java.util.*;

class EqualDigits {
    public static void main(String [] args) {
        String s = "030";
        char arr[] = s.toCharArray();
        boolean flag = true;
        for (int i=0; i<arr.length; i++) {
            int count = 0;
            int times = arr[i];
            times = times-48;
            for (int j=0; j<arr.length; j++) {
                int arj = (int)arr[j] - 48;
                if (arj==i)
                    count++;
            }
            if (count != times) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
