import edu.princeton.cs.algs4.StdIn;

/*
 * @Author: batkiz
 * @Date: 2018-08-05 21:19:38
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-05 21:20:51
 */

/**
 * Ex14
 */
public class Ex14 {

    public static int lg(int N) {
        int product = 1;
        int x = -1;
        while (product <= N) {
            product *= 2;
            x++;
        }
        return x;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        System.out.println(lg(N));
    }
}
