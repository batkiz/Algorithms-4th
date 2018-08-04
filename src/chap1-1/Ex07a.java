import edu.princeton.cs.algs4.StdOut;

/*
 * @Author: batkiz 
 * @Date: 2018-08-04 13:55:53 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-04 13:57:47
 */

/**
 * Ex07a
 */
public class Ex07a {

    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
    }
}