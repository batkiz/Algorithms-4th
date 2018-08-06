import edu.princeton.cs.algs4.StdIn;

/*
 * @Author: batkiz 
 * @Date: 2018-08-06 15:03:35 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-06 20:18:13
 */

/**
 * Ex20
 */
public class Ex20 {

    public static double logN(int N) {
        if (0 == N)
            return 0;
        if (1 == N)
            return 1;
        return logN(N - 1) + Math.log(N);
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        System.out.println(logN(N));
    }
}