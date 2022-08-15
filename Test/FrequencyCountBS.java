package Test;

class FrequencyCountBS {
    static int bsearch(int arr[], int low, int high, int x) {
        if (high>=low) {
            int mid = low + (high-low)/2;
            if (arr[mid] == x)
                return mid;
            else if (x < arr[mid])
                return bsearch(arr, low, mid-1, x);
            return bsearch(arr, mid+1, high, x);
        }
        return -1;
    }

    static int count(int arr[], int length, int x) {
        int index = bsearch(arr, 0, arr.length, x);
        if (index == -1)
            return -1;
        int count = 1;
        int left = index-1;
        while (left>0 && arr[left]==x) {
            count++;
            left--;
        }

        int right = index+1;
        while (right<length && arr[right]==x) {
            count++;
            right++;
        }
        return count;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(count(arr, arr.length, target));
    }
}
