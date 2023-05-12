package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.services.VacationCalculate;

public class VacationCalculateTest {
    @Test
    public void testMonthVacation() {
        VacationCalculate service = new VacationCalculate();
        int actual = VacationCalculate.calculate(10000, 3000, 20000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testMonthVacation2() {
        VacationCalculate service = new VacationCalculate();
        int actual = VacationCalculate.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
