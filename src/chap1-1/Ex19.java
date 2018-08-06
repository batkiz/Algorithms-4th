import edu.princeton.cs.algs4.StdOut;

/*
 * @Author: batkiz 
 * @Date: 2018-08-06 14:16:00 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-06 14:18:46
 */

/**
 * Ex19
 */
public class Ex19 {

    public static long F(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        return F(N - 1) + F(N - 2);
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N));
    }
}