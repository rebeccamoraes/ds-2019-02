package com.github.rebeccamoraes.exemplo.domain;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

public class ArquivoXML {
    private File arquivo;

    /**
     * Carrega o arquivo XML, dado o caminho
     *
     * @param path caminho do arquivo.
     */
    ArquivoXML(String path) {
        this.arquivo = new File(path);
    }

    /**
     * Converte arquivo XML em JSON
     * @return {@code true}
     */
    boolean converte() {
        XmlMapper mapper = new XmlMapper();
        try {
            JsonNode node = mapper.readTree(arquivo);
            ObjectMapper jsonMapper = new ObjectMapper();
            String json = jsonMapper.writeValueAsString(node);
            System.out.println(json);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
