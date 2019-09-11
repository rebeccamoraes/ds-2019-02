package com.github.rebeccamoraes.exemplo.domain;

/**
 * Contém dados de uma loja.
 */
public class Loja {

    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;

    private Loja() {
        razaoSocial = "Maria Clara da Silva ";
        nomeFantasia = "Artesanatos da Maria";
        cnpj = "12.345.678/0001-99";
    }

    /**
     * Referência para a única instância da classe.
     */
    private static final Loja INSTANCIA = criarInstancia();

    /**
     * Unico método que cria uma instancia da presente classe.
     *
     * @return Instância da presente classe ou o valor {@code null} caso
     * ocorra uma falha durante a construção da instância.
     */
    private static Loja criarInstancia() {
        try {
            return new Loja();
        } catch (Exception e) {
            return null;
        }
    }

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
