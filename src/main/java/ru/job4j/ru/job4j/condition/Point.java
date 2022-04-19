package ru.job4j.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 2, 2, 1);
        double result3 = Point.distance(4, 5, 1, 2);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 2) to (2, 1) " + result2);
        System.out.println("result (4, 5) to (1, 2) " + result3);
    }
}