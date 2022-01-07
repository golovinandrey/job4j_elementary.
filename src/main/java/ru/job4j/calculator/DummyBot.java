package ru.job4j.calculator;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if (question.equals("Привет, Бот")) {
            System.out.println("Привет, умник");
        } else if (question.equals("Пока")) {
            System.out.println("До скорой встречи");
        } else {
            System.out.println(rsl);
        }
        return rsl;
    }

    public static void main(String[] args) {
        DummyBot.answer("Привет, Бот");
        DummyBot.answer("Пока");
        DummyBot.answer("Как дела?");
    }
}
