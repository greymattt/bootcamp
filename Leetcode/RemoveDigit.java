class Solution {
    static String remove(String num, int index) {
        String res = "";
        for (int i=0; i<num.length(); i++) {
            if (index != i) {
                res += num.charAt(i);
            }
        }
        return res;
    }

    static int cmpr(String s, String m) {
        if (s.length() > m.length())
            return 1;
        else if (s.length() < m.length())
            return 0;
        else {
            for (int i=0; i<s.length(); i++) {
                if ((int)s.charAt(i) > (int)m.charAt(i))
                    return 1;
                else if((int)s.charAt(i) < (int)m.charAt(i))
                    return 0;
            }
        }
        return -1;
    }

    public String removeDigit(String number, char digit) {
        Stack<Integer> stack = new Stack<Integer>();


        String res = "";
        boolean flag = true;
        for (int i=0; i<number.length(); i++) {
            if (number.charAt(i) == digit)
                stack.push(i);
        }
        String max="";
        while (!stack.empty()) {
            String n = remove(number, stack.pop());
            if (cmpr(n,max)==1) // 1 = n, 0 = max
                max = n;
        }
        return max;
    }
}

// https://leetcode.com/contest/weekly-contest-291/problems/remove-digit-from-number-to-maximize-result/
// 3 Aug
