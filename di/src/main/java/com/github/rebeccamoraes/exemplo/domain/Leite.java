package com.github.rebeccamoraes.exemplo.domain;

public class Leite {
    
    private String fornecedor;

    public Leite(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getFornecedor() {
        return this.fornecedor;
    }
}