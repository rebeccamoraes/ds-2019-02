/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.rebeccamoraes.exemplo.domain;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SanduicheTest {

    @Test
    void builderCasoTrivial() {
        Sanduiche.Builder builder = new Sanduiche.Builder(Pao.FRANCES,
                "Filé de Frango");
        assertEquals("Pão integral, Filé de Frango", builder.build()
                .toString());
    }

    @Test
    void uneElementosDeConjunto() {
        Set<Pao> paes = new HashSet<>();
        paes.add(Pao.FRANCES);
        paes.add(Pao.BRASILEIRO);

        assertTrue(Sanduiche.une(paes).contains("BRASILEIRO"));
        assertTrue(Sanduiche.une(paes).contains("FRANCES"));
    }
}


