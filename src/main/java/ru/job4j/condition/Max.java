package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean ab = left > right;
        return ab ? left : right;
    }

    public static int max(int left, int right, int top) {
        return max(max(left, right), top);
    }

    public static int max(int left, int right, int top, int bottom) {
        return max(max(left, right, top), bottom);
    }

    public static void main(String[] args) {
        int max = Max.max(5, 6);
        System.out.println(max);
        max = Max.max(5, 6, 7);
        System.out.println(max);
        max = Max.max(5, 6, 7, 8);
        System.out.println(max);
    }
}
