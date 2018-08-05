/*
 * @Author: batkiz 
 * @Date: 2018-08-05 21:36:51 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-05 21:38:44
 */

/**
 * Ex16
 */
public class Ex16 {

    public static String exR1(int n) {
        if (n <= 0)
            return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static void main(String[] args) {
        System.out.println(exR1(6));
    }
}