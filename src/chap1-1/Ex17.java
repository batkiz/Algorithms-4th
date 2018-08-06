/*
 * @Author: batkiz 
 * @Date: 2018-08-06 10:21:38 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-06 10:24:05
 */

/**
 * Ex17
 */
public class Ex17 {

    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0)
            return "";
        return s;
    }

    public static void main(String[] args) {
        System.out.println(exR2(3));
    }
}