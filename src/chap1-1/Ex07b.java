import edu.princeton.cs.algs4.StdOut;

/*
 * @Author: batkiz 
 * @Date: 2018-08-04 13:58:18 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-04 13:59:35
 */

/**
 * Ex07b
 */
public class Ex07b {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);
    }
}