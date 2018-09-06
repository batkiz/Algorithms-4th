import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * DoublingTest
 */
public class DoublingTest {

    public static double timeTrail(int N) {
        // 为处理 N 个随机的六位正数的 ThreeSum.count() 计时
        int MAX = 1000000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        // 打印运行时间的表格
        for (int N = 250; true; N += N) {
            // 打印规模为 N 时程序的用时
            double time = timeTrail(N);
            StdOut.printf("%7d %5.1f\n", N, time);
        }
    }
}