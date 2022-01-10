package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот";
        String result = DummyBot.answer(in);
        String expected = "Привет, умник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока";
        String result = DummyBot.answer(in);
        String expeted = "До скорой встречи";
        Assert.assertEquals(expeted, result);
    }

    @Test
    public void whenUnknowBot() {
        String in = "Сколько будт 2 + 2?";
        String result = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(expected, result);
    }
}