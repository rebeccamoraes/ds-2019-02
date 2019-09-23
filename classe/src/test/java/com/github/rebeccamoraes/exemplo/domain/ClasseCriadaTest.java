package com.github.rebeccamoraes.exemplo.domain;

import org.junit.jupiter.api.Test;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ClasseCriadaTest {

    ClasseCriadaTest() throws IOException{
        try(FileOutputStream f = new FileOutputStream("teste")) {

        }
    }


    @Test
    void verificaCloseChamado() {
        assertThrows(RuntimeException.class, () -> {
            try(ClasseCriada obj = new ClasseCriada("teste")) {
            }
        });
    }

}