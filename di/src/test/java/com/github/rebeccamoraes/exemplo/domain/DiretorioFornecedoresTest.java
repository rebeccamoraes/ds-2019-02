package com.github.rebeccamoraes.exemplo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiretorioFornecedoresTest {

    @Test
    void criaFornecedorCorretamente() {
        DiretorioFornecedores fornecedores = new DiretorioFornecedores();
        fornecedores.acrescenta(new CaldasNovas());
        assertEquals(1, fornecedores.fornecedores().size());
        assertEquals("Caldas Novas", fornecedores.fornecedores().get(0));
    }
}
