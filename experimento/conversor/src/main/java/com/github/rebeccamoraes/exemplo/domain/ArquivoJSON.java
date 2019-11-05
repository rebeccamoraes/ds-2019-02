package com.github.rebeccamoraes.exemplo.domain;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ArquivoJSON {
    private InputStream arquivo;

    /**
     * Carrega o arquivo JSON, dado o caminho
     *
     * @param path caminho do arquivo.
     */
    ArquivoJSON(String path) {
        InputStream resourceAsStream = this.getClass().getResourceAsStream(path);
        this.arquivo = resourceAsStream;
    }

    /**
     * Converte arquivo JSON em XML
     *
     * @return {@code true} caso não tenha ocorrido exceção,
     * ou {@code false} caso tenha ocorrido exceção.
     *
     * @throws IOException caso
     */
    boolean converte() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(arquivo);
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(node);
        System.out.println(xml);
        return true;
    }
}
