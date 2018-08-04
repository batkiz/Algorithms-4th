import edu.princeton.cs.algs4.StdIn;

/*
 * @Author: batkiz 
 * @Date: 2018-08-04 16:47:01 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-04 17:41:27
 */

/**
 * Ex09
 */
public class Ex09 {

    public static String toBinaryString(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        return s;
    }

    public static void main(String[] args) {
        int val = StdIn.readInt();
        System.out.println(toBinaryString(val));
    }
}