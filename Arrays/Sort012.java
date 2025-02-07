public class Sort012 {
    public void sort012(int[] arr) {
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < arr.length; ++i) {
            int t = arr[i];
            if (t == 0) c0++;
            if (t == 1) c1++;
            if (t == 2) c2++;
        }
        for (int i = 0; i < arr.length; ++i) {
            if (c0-- > 0) arr[i] = 0;
            else if (c1-- > 0) arr[i] = 1;
            else arr[i] = 2;
        }
    }
}
