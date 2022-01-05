package ru.job4j.calculator.ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rls = value / 60;
        return rls;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float an = 140;
        float expected1 = 2;
        float aut = Converter.rubleToEuro(an);
        boolean passed1 = expected1 == aut;
        System.out.println("140 rubels are 2 euro. Test result " + passed1);
        float dollar = Converter.rubleToDollar(180);
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("180 rubels are 3 dollar. Test result " + passed);
    }
}
