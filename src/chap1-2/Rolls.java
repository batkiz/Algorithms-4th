import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/*
 * @Author: batkiz 
 * @Date: 2018-08-07 15:16:25 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-07 15:20:45
 */

/**
 * Rolls
 */
public class Rolls {

    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int SIDES = 6;
        Counter[] rolls = new Counter[SIDES + 1];
        for (int i = 1; i <= SIDES; i++)
            rolls[i] = new Counter(i + "'s");
        for (int t = 0; t < T; t++) {
            int result = StdRandom.uniform(1, SIDES + 1);
            rolls[result].increment();
        }
        for (int i = 0; i <= SIDES; i++) {
            StdOut.println(rolls[i]);
        }
    }
}