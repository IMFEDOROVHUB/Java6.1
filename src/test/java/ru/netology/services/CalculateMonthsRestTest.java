package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculateMonthsRestTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/moneyMonth.csv")
    public void testFirst(int income, int expenses, int threshold) {
        CalculateMonthsRest service = new CalculateMonthsRest();

        //int income = 10_000;
        //int expenses = 3000;
        //int threshold = 20_000;
        int month = service.calculate(income, expenses, threshold);
        System.out.println("Месяцев отдыха " + month);
    }

    //@Test
    //public void testSecond() {
    // CalculateMonthsRest service = new CalculateMonthsRest();

    //int income = 100_000;
    //int expenses = 60_000;
    //int threshold = 150_000;
    //int month = service.calculate(income, expenses, threshold);
    //System.out.println("Месяцев отдыха " + month);
    //}
}
