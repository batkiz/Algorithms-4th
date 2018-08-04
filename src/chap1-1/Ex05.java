import edu.princeton.cs.algs4.StdIn;

/*
 * @Author: batkiz 
 * @Date: 2018-08-04 13:47:03 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-04 13:48:52
 */

/**
 * Ex05
 */
public class Ex05 {

    public static void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}