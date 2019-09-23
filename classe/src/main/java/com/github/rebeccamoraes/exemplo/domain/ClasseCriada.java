package com.github.rebeccamoraes.exemplo.domain;

import java.io.FileInputStream;
import java.io.IOException;

public class ClasseCriada extends FileInputStream implements AutoCloseable {

    public ClasseCriada(String name) throws IOException {
        super(name);
    }

    @Override
    public void close() {
        throw new RuntimeException("método close chamado");
    }
}