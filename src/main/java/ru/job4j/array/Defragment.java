package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {

        int i = 0;
        for (String value : array) {
            if (value != null) {
                array[i++] = value;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}