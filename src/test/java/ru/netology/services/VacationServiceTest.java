package ru.netology.services;

import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    
    @Test
    public void testThreshold20000() {
        
        VacationService service = new VacationService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int count = service.countVacation(income, expenses, threshold);
        System.out.println(count);
    }

    @Test
    public void testThreshold150000() {
        VacationService service = new VacationService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int count = service.countVacation(income, expenses, threshold);
        System.out.println(count);
    }
}