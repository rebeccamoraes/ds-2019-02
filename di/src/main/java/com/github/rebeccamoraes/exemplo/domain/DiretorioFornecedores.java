package com.github.rebeccamoraes.exemplo.domain;

import java.util.function.Supplier;
import java.util.*;

public class DiretorioFornecedores {
    private List<Supplier<Leite>> listaFornecedores = new ArrayList<Supplier<Leite>>();

    public void acrescenta(Supplier<Leite> fornecedor) {
        this.listaFornecedores.add(fornecedor);
    }

    public List<String> fornecedores() {
        List<String> nomes = new ArrayList();

        for(Supplier<Leite> fornecedor : this.listaFornecedores) {
            nomes.add(fornecedor.get().getFornecedor());
        }

        return nomes;
    }
}