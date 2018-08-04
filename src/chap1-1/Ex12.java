/*
 * @Author: batkiz 
 * @Date: 2018-08-04 19:06:39 
 * @Last Modified by:   batkiz 
 * @Last Modified time: 2018-08-04 19:06:39 
 */

/**
 * Ex12
 */
public class Ex12 {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }
}