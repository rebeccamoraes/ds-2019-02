package com.github.rebeccamoraes.exemplo.domain;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArquivoJSONTest {

    @Test
    void conversaoComSucesso() throws IOException{
        ArquivoJSON json = new ArquivoJSON("/exemplo.json");

        assertTrue(json.converte());
    }

}
