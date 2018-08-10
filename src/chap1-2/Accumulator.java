/*
 * @Author: batkiz 
 * @Date: 2018-08-10 21:08:16 
 * @Last Modified by: batkiz
 * @Last Modified time: 2018-08-10 21:12:28
 */

/**
 * Accumulator
 */
public class Accumulator {

    private double total;
    private int N;

    public void addDataValue(double val) {
        N++;
        total += val;
    }

    public double mean() {
        return total / N;
    }

    public String toString() {
        return "Mean (" + N + " values): "
                    + String.format("%7.5f", mean());
    }
}