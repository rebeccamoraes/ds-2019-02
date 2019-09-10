/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.rebeccamoraes.exemplo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SanduicheTest {

    @Test
    public void builderCasoTrivial() {
        Sanduiche.Builder builder = new Sanduiche.Builder("Pão integral",
                "Filé de Frango");
        assertEquals("Pão integral, Filé de Frango", builder.build()
                .toString());
    }
}


