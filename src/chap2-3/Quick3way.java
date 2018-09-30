/**
 * Quick3way
 */
public class Quick3way {

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a); // 消除对输入的依赖
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt) {
            int cmp = a[i].compareTo(v);
            if (cmp < 0)
                exch(a, lt++, i++);
            else if (cmp > 0)
                exch(a, i, gt--);
            else
                i++;
        } // 现在 a[lo..lt-1] < v =a[lt..gt] < a[gt+1..hi] 成立
        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        // 将数组切分为 a[lo..i-1], a[i], a[i+1..hi]
        int i = lo, j = hi + 1; // 左右扫描指针
        Comparable v = a[lo]; // 切分元素
        while (true) {
            // 扫描左右，检查扫描是否结束并交换元素
            while (less(a[++i], v))
                if (i == hi)
                    break;
            while (less(v, a[--j]))
                if (j == lo)
                    break;
            if (i >= j)
                break;
            exch(a, i, j);
        }
        exch(a, lo, j); // 将 v = a[j] 放到正确的位置
        return j; // a[lo..j-1] <= a[j] <= a[j+1..hi] 达成
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}