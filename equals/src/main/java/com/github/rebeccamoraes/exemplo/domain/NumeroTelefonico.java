package com.github.rebeccamoraes.exemplo.domain;

public class NumeroTelefonico {

    private String codigoPais;
    private String codigoEstado;
    private String numero;

    public NumeroTelefonico(String codigoPais, String codigoEstado, 
        String numero) {

        // FIXME desta forma, jamais será false o retorno do equals (falata atribuir valores às propriedades)
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
            if(outroNumeroTel.codigoPais == this.codigoPais
                && outroNumeroTel.codigoEstado == this.codigoEstado
                && outroNumeroTel.numero == this.numero) {
                    return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
