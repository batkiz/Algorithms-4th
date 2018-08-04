import edu.princeton.cs.algs4.StdIn;

/*
 * @Author: batkiz 
 * @Date: 2018-08-04 13:41:54 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-04 13:43:56
 */

/**
 * Ex03
 */
public class Ex03 {

    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        if (a == b && b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}