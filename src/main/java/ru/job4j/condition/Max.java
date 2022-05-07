package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean ab = left > right;
        int result = ab ? left : right;
        return result;

    }

    public static void main(String[] args) {
        int max = Max.max(5, 6);
        System.out.println(max);
    }
}
