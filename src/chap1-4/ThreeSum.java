import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * ThreeSum
 */
public class ThreeSum {

    public static int count(long[] a) {
        // 统计和为 0 的元组的数量
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                for (int k = j + 1; k < N; k++)
                    if (a[i] + a[j] + a[k] == 0)
                        cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        long[] a = new In(args[0]).readAllLongs();
        StdOut.println(count(a));
    }
}

// Ex02 enhancement:
// int -> long