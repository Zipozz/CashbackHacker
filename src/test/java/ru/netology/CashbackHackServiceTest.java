package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    public CashbackHackService cashbackHack = new CashbackHackService();

    @Test
    void shouldCashBack900() {
        int actual = cashbackHack.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCashBack100() {
        int actual = cashbackHack.remain(100);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCashBack1000() {
        int actual = cashbackHack.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldCashBack1100() {
        int actual = cashbackHack.remain(1100);
        int expected = 900;
        assertEquals(expected, actual);
    }
}
