import java.util.*;

class Matrix_Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5, 6, 7 },
                { 1, 2, 3, 4, 5, 6, 7 },
                { 1, 2, 3, 4, 5, 6, 7 }
        };
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int count = 0;
        int rstart = 0;
        int rend = m;
        int cstart = 0;
        int cend = n;
        int f = 0;
        for (count = 0; count < m * n;) {
            for (int a = cstart; a < cend && f == 0; ++a) {
                System.out.print(arr[rstart][a] + " ");
                count++;
                ans.add(arr[rstart][a]);
                if (count == (m * n))
                    f = 1;
            }
            for (int b = rstart + 1; b < rend && f == 0; ++b) {
                System.out.print(arr[b][cend - 1] + " ");
                count++;
                ans.add(arr[b][cend - 1]);
                if (count == (m * n))
                    f = 1;
            }
            for (int c = cend - 2; c >= cstart && f == 0; c--) {
                System.out.print(arr[rend - 1][c] + " ");
                count++;
                ans.add(arr[rend - 1][c]);
                if (count == (m * n))
                    f = 1;
            }
            for (int d = rend - 2; d >= rstart + 1 && f == 0; d--) {
                System.out.print(arr[d][rstart] + " ");
                ans.add(arr[d][rstart]);
                count++;
                if (count == (m * n))
                    f = 1;
            }
            rstart++;
            cend--;
            rend--;
            cstart++;
        }
        System.out.println(ans);
        // return ans;
    }
}
