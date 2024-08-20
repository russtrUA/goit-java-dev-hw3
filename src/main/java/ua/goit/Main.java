package ua.goit;

public class Main {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        System.out.println("calculator.sum(1) = " + calculator.sum(1));
        System.out.println("calculator.sum(3) = " + calculator.sum(3));
        System.out.println("calculator.sum(0) = " + calculator.sum(0));
    }
}