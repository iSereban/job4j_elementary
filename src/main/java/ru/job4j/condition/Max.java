package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean ab = left > right;
        return ab ? left : right;
    }

    public static void main(String[] args) {
        int max = Max.max(5, 6);
        System.out.println(max);
    }
}
