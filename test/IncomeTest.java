package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Income;

public class IncomeTest {
    @ParameterizedTest
    @CsvSource({
        "2000, 400, 1000, 52000.0",
        "2000, 400, 300, -1.0",
        "2000, 400, 4000, -1.0",
        "2000, 100, 1000, -1.0",
        "2000, 100, 200, -1.0",
        "2000, 100, 4000, -1.0",
        "2000, 900, 1000, -1.0",
        "2000, 900, 200, -1.0",
        "2000, 900, 4000, -1.0",
        "900, 400, 1000, -1.0",
        "900, 400, 200, -1.0",
        "900, 400, 4000, -1.0",
        "900, 100, 1000, -1.0",
        "900, 100, 200, -1.0",
        "900, 100, 4000, -1.0",
        "900, 900, 1000, -1.0",
        "900, 900, 200, -1.0",
        "900, 900, 4000, -1.0",
        "6000, 400, 1000, -1.0",
        "6000, 400, 200, -1.0",
        "6000, 400, 4000, -1.0",
        "6000, 100, 1000, -1.0",
        "6000, 100, 200, -1.0",
        "6000, 100, 4000, -1.0",
        "6000, 900, 1000, -1.0",
        "6000, 900, 200, -1.0",
        "6000, 900, 4000, -1.0"
    })
    void testNormal(int Fan, int Motor, int Guard, Double expectedIncome) {
        Income income = new Income();
        Double actualIncome = income.calculateIncome(Fan, Motor, Guard);
        assertEquals(expectedIncome, actualIncome);
    }
}
