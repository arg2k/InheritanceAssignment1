package Calculator;

public class Calculator {
    public double findAverage(double a, double b, double c) {
        return (double) (a + b + c) / 3;
    }

    public double findAverage(double a, double b, double c, double d) {
        return (double) (a + b + c + d) / 4;
    }

    public double findAverage(double a, double b, double c, double d, double e) {
        return (double) (a + b + c + d + e) / 5;
    }

    public double roundOff(double num) {
        return (double) Math.round(num * 100) / 100;
    }
}