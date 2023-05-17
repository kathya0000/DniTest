package com.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculoDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "23456789, D",
            "34567890, V",
            "45678901, G"
    })
    public void testCalcularLetra(int dni, char expected) {
        char actual = CalculoDni.calcularLetra(dni);
        Assertions.assertEquals(expected, actual);
    }
}

