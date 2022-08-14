import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        String s[] = new String[n], temp;
        for (int i=0; i<n; i++) {
            temp = sc.next();
            s[i] = temp;
        }
        for (int i=0; i<n-1; i++) {
            if (s[i].equals("cookie") && s[i+1].equals("cookie")) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
