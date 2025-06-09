package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    void shouldCalculateHoliday() {
        VacationService service = new VacationService();

        int balance = 0;
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        long actual = service.countVacation(income, expenses, threshold);

        Assertions.assertEquals(balance, threshold);
    }
}