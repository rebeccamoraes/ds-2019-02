package com.github.rebeccamoraes.exemplo.domain;

public class NumeroTelefonico {

    private String codigoPais;
    private String codigoEstado;
    private String numero;

    public NumeroTelefonico(String codigoPais, String codigoEstado, 
        String numero) {
        this.codigoPais = codigoPais;
        this.codigoEstado = codigoEstado;
        this.numero = numero;
    }

    @Override
    public boolean equals(final Object outroNumero) {
        if(outroNumero == null) {
            return false;
        }
        
        if(this == outroNumero) {
            return true;
        }
        
        if(outroNumero instanceof NumeroTelefonico) {
            NumeroTelefonico outroNumeroTel = (NumeroTelefonico) outroNumero;

            return outroNumeroTel.codigoPais.equals(this.codigoPais)
                    && outroNumeroTel.codigoEstado.equals(this.codigoEstado)
                    && outroNumeroTel.numero.equals(this.numero);
        } else {
            return false;
        }
    }
}
