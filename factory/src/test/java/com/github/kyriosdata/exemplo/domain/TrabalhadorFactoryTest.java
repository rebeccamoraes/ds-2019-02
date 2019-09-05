/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.kyriosdata.exemplo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrabalhadorFactoryTest {

    @Test
    public void atividadeProfessorRetornaEducar() {
        try {
            Professor prof = TrabalhadorFactory.newInstance("Professor");
            assertEquals("Educar", prof.atividade());
        } catch (Exception e) {
            //ignora exceção
        }
    }

    @Test
    public void atividadeAlunoRetornaEstudar() {
        try {
            Aluno aluno = TrabalhadorFactory.newInstance("Aluno");
            assertEquals("Estudar", aluno.atividade());
        } catch (Exception e) {
            //ignora exceção
        }
    }
}


