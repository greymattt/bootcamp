package Test;

public class AdjacentChars {
    public static void main(String [] args) {
        String s = "aaabbb";
        int length = s.length();
        String res = "";
        // res += s.charAt(0);
        for (int i=0; i<length-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                res += s.charAt(i);
                res += "*";
            }
            else{
                res+=s.charAt(i);
            }
        }
        res += s.charAt(length-1);
        System.out.println(res);
    }
}
