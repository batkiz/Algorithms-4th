import java.util.Arrays;

/*
 * @Author: batkiz 
 * @Date: 2018-08-11 22:14:52 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-11 22:20:43
 */

/**
 * StaticSETofInts
 */
public class StaticSETofInts {

    private int[] a;

    public StaticSETofInts(int[] keys) {
        a = new int[keys.length];
        for (int i = 0; i < keys.length; i++) {
            a[i] = keys[i];
        }
        Arrays.sort(a);
    }

    public boolean contains(int key) {
        return rank(key) != -1;
    }

    private int rank(int key) {
        // 二分查找
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}