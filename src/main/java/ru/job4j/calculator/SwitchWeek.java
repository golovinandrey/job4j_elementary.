package ru.job4j.calculator;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1 :
                name = "Понедельник";
                break;
            case 2 :
                name = "Вторник";
                break;
            case 3 :
                name = "Среда";
                break;
            case 4 :
                name = "Четверг";
                break;
            case 5 :
                name = "Пятница";
                break;
            case 6 :
                name = "Суббота";
                break;
            case 7 :
                name = "Воскресенье";
                break;
            default:
                name = "Диапазон только от 1 до 7";
        }
        return name;
    }

    public static void main(String[] args) {
        String result = SwitchWeek.nameOfDay(3);
        System.out.println(result);
    }
}
