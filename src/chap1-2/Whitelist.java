import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/*
 * @Author: batkiz 
 * @Date: 2018-08-11 22:21:04 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-11 22:22:24
 */

/**
 * Whitelist
 */
public class Whitelist {

    public static void main(String[] args) {
        int[] w = new In(args[0]).readAllInts();
        StaticSETofInts set = new StaticSETofInts(w);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (!set.contains(key)) {
                StdOut.println(key);
            }
        }
    }
}