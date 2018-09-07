import java.util.Arrays;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * ThreeSumFast
 */
public class ThreeSumFast {

    public static int count(int[] a) {
        // 计算和为 0 的三元组的数目
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (BinarySearch.rank(-a[i] - a[j], a) > j)
                    cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = new In(args[0]).readAllInts();
        StdOut.println(count(a));
    }
}