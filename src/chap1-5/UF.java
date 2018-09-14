import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * UF
 */
public class UF {

    private int[] id; // 分量 id （以触点作为索引）
    private int count; // 分量数量

    public UF(int N) {
        // 初始化分量 id 数组
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    private int find(int p) {
        // 找出分量的名称
        while (p != id[p])
            p = id[p];
        return p;
    }

    public void union(int p, int q) {
        // 将 p 和 q 的根节点统一
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot)
            return;

        id[pRoot] = qRoot;

        count--;
    }

    public static void main(String[] args) {
        // 解决由 StdIn 得到的动态连通性问题
        int N = StdIn.readInt(); // 读取触点数量
        UF uf = new UF(); // 初始化 N 个分量
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt(); // 读取整数对
            if (uf.connected(p, q))
                continue; // 如果已经连通则忽略
            uf.union(p, q); // 归并分量
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + "components");
    }
}