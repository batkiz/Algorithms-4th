/**
 * Merge
 */
public class Merge {

    private static Comparable[] aux; // 归并所需的辅助数组

    public static void sort(Comparable[] a) {
        // 进行 lgN 次两两归并
        int N = a.length;
        aux = new Comparable[N];
        for (int sz = 1; sz < N; sz = sz + sz) // sz 子数组大小
            for (int lo = 0; lo < N - sz; lo += sz + sz) // lo: 子数组索引
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        // 将数组 a[lo..hi] 排序
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid); // 将左半边排序
        sort(a, mid + 1, hi); // 将右半边排序
        merge(a, lo, mid, hi); // 归并结果
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        // 将 a[lo..mid] 和 a[mid+1..hi] 归并
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) // 将 a[lo..hi] 复制到 aux[lo..hi]
            aux[k] = a[k];
        for (int k = lo; k <= hi; k++) // 归并回到 a[lo..hi]
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
}