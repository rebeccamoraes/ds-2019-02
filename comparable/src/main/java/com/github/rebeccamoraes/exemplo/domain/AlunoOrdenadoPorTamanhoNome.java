package com.github.rebeccamoraes.exemplo.domain;

import java.util.Comparator;

/**
 * Comparador de Alunos por ordem crescente de tamanho de nome.
 */
public class AlunoOrdenadoPorTamanhoNome implements Comparator<Aluno> {

    /**
     * Compara numericamente os tamanhos dos nomes de dois alunos.
     *
     * @param aluno1 Primeiro aluno a ser comparado.
     * @param aluno2 Segundo aluno a ser comparado.
     * @return 0 se o tamanho dos nomes de aluno1 e aluno2 forem iguais;
     * um valor maior que 0 se o tamanho do nome de aluno1 seja maior
     * que o de aluno2; ou um valor menor que 0 se o tamanho do nome de
     * aluno1 for menor que o de aluno2.
     */
    public int compare(final Aluno aluno1, final Aluno aluno2) {
        int tamanhoNome1 = aluno1.getNome().length();
        int tamanhoNome2 = aluno2.getNome().length();

        return Integer.compare(tamanhoNome1, tamanhoNome2);
    }
}
