package com.testing;

public class CalculoDni {

    private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calcularLetra(int dni) {
        int index = dni % 23;
        return LETRAS_DNI.charAt(index);
    }
}

