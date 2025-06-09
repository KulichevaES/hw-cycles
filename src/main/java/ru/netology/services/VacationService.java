package ru.netology.services;

public class VacationService {

    public int countVacation(int income, int expenses, int threshold) {
        int balance = 0;
        int holiday = 0;
        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                balance = (balance - expenses) / 3;
                holiday++;
            } else {
                balance = balance + income - expenses;
            }
        }
        return holiday;
    }
}
