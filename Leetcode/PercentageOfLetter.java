package Leetcode;
import java.util.*;
class PercentageOfLetter {
    public static void main(String [] args) {
        String s = "foobar";
        String l = "o";
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i)==l.charAt(0)) {
                count++;
            }
        }
        System.out.println((count*100)/s.length());
    }
}
