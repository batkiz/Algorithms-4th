import edu.princeton.cs.algs4.StdIn;

/**
 * Ex06
 */
public class Ex06 {

    public static void main(String[] args) {
        System.out.println("s: ");
        String s = StdIn.readLine();
        System.out.println("t: ");
        String t = StdIn.readLine();
        if (s.length() == t.length() && s.concat(s).indexOf(t) >= 0) {
            System.out.println(s + " is the circular rotation of " + t);
        } else {
            System.out.println(s + " is not the circular rotation of " + t);
        }
    }
}