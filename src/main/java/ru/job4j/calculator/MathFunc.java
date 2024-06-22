package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        return x * x + 1;
    }

    public static Integer func2(int x) {
        if (x == 0) {
            System.out.println("Error: Division by zero");
            return null;
        }
        return 1 / x;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        Integer result2 = MathFunc.func2(5);
        int result3 = MathFunc.func1(100);

        if (result2 != null) {
            int total = result1 + result2;
            System.out.println("Total: " + total);
        } else {
            System.out.println("Failed to compute total due to division by zero.");
        }

        System.out.println("Result of func1(100): " + result3);
    }
}