package com.github.rebeccamoraes.exemplo.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Set;
import java.util.HashSet;

class NumeroTelefonicoTest {

    @Test
    void numeroEhIgualAEleMesmo() {
        NumeroTelefonico numero = new NumeroTelefonico("55", "62", "98765-4321");
        assertTrue(numero.equals(numero));
    }

    @Test
    void comparaDoisNumerosIguais() {
        NumeroTelefonico numero = new NumeroTelefonico("55", "62", "98765-4321");
        
        NumeroTelefonico numero2 = new NumeroTelefonico("55", "62", "98765-4321");

        assertTrue(numero.equals(numero2));
        assertTrue(numero2.equals(numero));
    }

    @Test
    void verificaNumeroContidoEmSet() {
        Set<NumeroTelefonico> telefones = new HashSet<>();
        
        NumeroTelefonico numero = new NumeroTelefonico("55", "62", "98765-4321");
        telefones.add(numero);
        
        NumeroTelefonico numero2 = new NumeroTelefonico("51", "61", "98765-4322");
        telefones.add(numero2);

        assertTrue(telefones.contains(numero));
        assertTrue(telefones.contains(numero2));
    }
}