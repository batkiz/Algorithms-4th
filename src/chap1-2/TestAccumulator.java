import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/*
 * @Author: batkiz 
 * @Date: 2018-08-10 20:59:27 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-10 21:08:10
 */

/**
 * TestAccumulator
 */
public class TestAccumulator {

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Accumulator a = new Accumulator();
        for (int t = 0; t < T; t++)
            a.addDataValue(StdRandom.random());
        StdOut.println(a);
    }
}