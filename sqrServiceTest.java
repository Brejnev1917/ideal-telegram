package ru.netology.sqr;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class sqrServiceTest {

    @ParameterizedTest
    @CsvSource (value = {"'1',3","'2',15","'3',200","'4',201","'5',300","'6',301"})
    void shouldCalculateNumberSQRT(String testName,int expected) {
        sqrService  sqrService = new sqrService();

        int actual = sqrService.sqrt(200,300);
        assertEquals(expected,actual);
    }
}