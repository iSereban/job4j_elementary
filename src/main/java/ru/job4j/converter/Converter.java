package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float dollar = Converter.rubleToDollar(89);
        System.out.println("89 rubles are " + dollar + " dollar.");
        in = 89;
        expected = (float) 1.4833333;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("89 rubles are 1.4833333. Test result : " + passed);
    }
}