package com.github.rebeccamoraes.exemplo.domain;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AlunoOrdenacaoTest {

    @Test
    void ordenados() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Pedro"));
        alunos.add(new Aluno("Amarildo"));
        assertEquals("Pedro", alunos.get(0).getNome());
        assertEquals("Amarildo", alunos.get(1).getNome());

        Collections.sort(alunos);
        assertEquals("Amarildo", alunos.get(0).getNome());
        assertEquals("Pedro", alunos.get(1).getNome());
    }

    @Test
    void ordenacaoPeloTamanhoDoNome() {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Aparecida"));
        alunos.add(new Aluno("Carla"));
        alunos.add(new Aluno("Xuxa"));

        //Collections.sort(alunos, /* Comparator para tamanho do nome aqui */);
        assertEquals("Xuxa", alunos.get(0));
        assertEquals("Carla", alunos.get(1));
        assertEquals("Aparecida", alunos.get(2));
    }
}
