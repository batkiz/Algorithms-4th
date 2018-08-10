import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/*
 * @Author: batkiz 
 * @Date: 2018-08-10 22:09:29 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-10 22:11:28
 */

/**
 * TestVisualAccumulator
 */
public class TestVisualAccumulator {

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int t = 0; t < T; t++)
            a.addDataValue(StdRandom.random());
        StdOut.println(a);
    }
}