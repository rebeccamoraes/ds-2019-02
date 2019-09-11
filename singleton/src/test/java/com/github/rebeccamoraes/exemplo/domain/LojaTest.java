package com.github.rebeccamoraes.exemplo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LojaTest {

    @Test
    void recuperaNomeFantasia() {
        Loja loja = Loja.getInstance();
        assertEquals("Artesanatos da Maria", loja.getNomeFantasia());
    }

    @Test
    void recuperaCNPJ() {
        Loja loja = Loja.getInstance();
        assertEquals("12.345.678/0001-99", loja.getCnpj());
    }

    @Test
    void recuperaRazaoSocial() {
        Loja loja = Loja.getInstance();
        assertEquals("Maria Clara da Silva", loja.getRazaoSocial());
    }
}
