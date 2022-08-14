package Test;
import java.util.*;

public class BinarySearch {
    static int bsearch(int arr[], int x, int low, int high) {
        if (high>=low) {
            int mid = low+(high-low)/2;
            if (x==arr[mid])
                return mid;
            else if(x<arr[mid])
                return bsearch(arr, x, low, mid-1);
            return bsearch(arr, x, mid+1, high);
        }
        return -1;
    }
    public static void main(String [] main) {
        int arr[] = {12, 11, 3, 4, 5, 8};
        int target = 5;
        Arrays.sort(arr);
        System.out.println(bsearch(arr, target, 0, arr.length)+1);
    }
}
