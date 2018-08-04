import edu.princeton.cs.algs4.StdOut;

/*
 * @Author: batkiz 
 * @Date: 2018-08-04 13:49:43 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-04 13:50:58
 */

/**
 * Ex06
 */
public class Ex06 {

    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}