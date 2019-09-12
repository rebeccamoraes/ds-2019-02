package com.github.rebeccamoraes.exemplo.domain;

/**
 * Contém dados de uma loja.
 */
public class Loja {

    private String razaoSocial = "Maria Clara da Silva";
    private String nomeFantasia = "Artesanatos da Maria";
    private String cnpj = "12.345.678/0001-99";

    /**
     * Singleton
     */
    private Loja() {
    }

    /**
     * Referência para a única instância da classe.
     */
    private static final Loja INSTANCIA = new Loja();

    /**
     * Recupera instância da classe Loja.
     *
     * @return  A unica instancia da classe Loja. Se houve situação
     * excepcional durante a construção da instância, então
     * retorna {@code null}.
     */
    public static Loja getInstance() {
        return INSTANCIA;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
}
