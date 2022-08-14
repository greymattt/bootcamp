package Leetcode;
import java.util.*;

class DivideArrtoEqualPair {
    static boolean sp(int arr[]) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i=0; i<arr.length; i++) {
            if (arr[i]!=arr[i+1])
                return false;
            i++;
        }
        return true;
    }

    public static void main(String [] args) {
        int nums[] = {3,2,3,2,1,1};
        System.out.println(sp(nums));

    }
}
