package com.stack.thread;

public class IntegralCalculator implements Runnable {
    private double a;
    private double b;
    private int n;
    private int index;
    private int size;
    private double[] result;

    public IntegralCalculator(double a, double b, int n, int index, int size, double[] result) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.index = index;
        this.size = size;
        this.result = result;
    }

    @Override
    public void run() {
        double h = (b - a) / n;
        int end = (index == size - 1)
                  ? n : (index + 1) * (n / size);

        double sum = 0;
        for (int i = index * (n / size); i < end; i++) {
            double x = a + i * h;
            sum += f(x);
        }
        result[index] = h * sum;
    }

    private double f(double x) {
        return x * x;
    }
}
