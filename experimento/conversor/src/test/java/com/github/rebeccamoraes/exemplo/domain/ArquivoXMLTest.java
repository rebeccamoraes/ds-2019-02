package com.github.rebeccamoraes.exemplo.domain;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArquivoXMLTest {

    @Test
    void leituraArquivo() throws IOException {
        //new ArquivoXML(this.getClass().getResourceAsStream("/exemplo.xml"));
        ArquivoXML xml = new ArquivoXML("/exemplo.xml");

       assertTrue(xml.converte());
    }
}
