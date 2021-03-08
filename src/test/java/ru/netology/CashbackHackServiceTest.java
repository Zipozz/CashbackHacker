package ru.netology;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CashbackHackServiceTest {
    public CashbackHackService cashbackHack = new CashbackHackService();

    @Test
    void shouldCashBack900() {
        int actual = cashbackHack.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    void shouldCashBack100() {
        int actual = cashbackHack.remain(100);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    void shouldCashBack1000() {
        int actual = cashbackHack.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void shouldCashBack1100() {
        int actual = cashbackHack.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);
    }
}