package Test;
import java.util.*;

public class TelephoneBill {
    public static void main(String [] args) {
        String s = "00:01:07,400-234-090";
        String arr[] = new String[2];
        arr = s.split(",");
        System.out.println(Arrays.toString(arr));
        String a[] = new String[3];
        String temp = arr[0];
        System.out.println(temp);
        a = temp.split(":");
        System.out.println(a);
    }
}
