package Leetcode;
import java.util.*;

class MinimumAvgDifference {
    public static void main(String [] args) {
        int nums[] = {2,5,3,9,5,3};
        int forsum = 0;
        int backsum = 0;
        int back = nums.length-1;
        for (i=0; i<nums.length; i++) {

        }
        // for (int i=1; i<nums.length+1; i++) {
        //     forsum += nums[i-1];
        //     backsum += nums[back--];
        //     System.out.printf("%d %d\n", forsum/i, backsum/i);
        //     // System.out.printf("%d %d\n", forsum/i, backsum/i);
        // }
        // System.out.println();
        // int index=1;
        // for (int i=nums.length-1; i>0; i--) {
        //     sum1 += nums[i];
        //     backw[index] = sum1/index;
        //     index++;
        // }
        // int ind=0;
        // int min=1000000;
        // int indx = -1;
        // for (int i=backw.length-1; i>=0; i--) {
        //     int x = Math.abs(backw[i]-forw[ind++]);
        //     if (x<min) {
        //         min = x;
        //         indx=ind;
        //     }
        // }
        // System.out.println(indx);
    }
}
