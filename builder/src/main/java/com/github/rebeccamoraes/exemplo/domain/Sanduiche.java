package com.github.rebeccamoraes.exemplo.domain;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Sanduiche formado pela composição de no mínimo um pão e uma recheio.
 */
public class Sanduiche {

    /**
     * Pães do sanduiche. Observe que uma lista admite duplicatas, o que não
     * é desejável aqui, ou é?
     */
    private Set<Pao> paes;

    /**
     * Recheios do sanduiche.
     */
    private List<String> recheios;

    /**
     * Queijos do sanduiche.
     */
    private List<String> queijos;

    /**
     * Vegetais do sanduiche.
     */
    private List<String> vegetais;

    /**
     * Molhos do sanduiche.
     */
    private List<String> molhos;

    /**
     * Tempeiros do sanduiche
     */
    private List<String> tempeiros;

    /**
     * Indica se o sanduiche deve ser embalado para viagem, ou não.
     */
    private boolean embaladoParaViagem = false;

    public static class Builder {
        private Set<Pao> paes = new HashSet<>();
        private List<String> recheios = new ArrayList<>();
        private List<String> queijos = new ArrayList<>();
        private List<String> vegetais = new ArrayList<>();
        private List<String> molhos = new ArrayList<>();
        private List<String> tempeiros = new ArrayList<>();
        private boolean embaladoParaViagem = false;

        /**
         * Ter um pão e um recheio é obrigatório.
         *
         * @param pao O primeiro pão adicionado.
         * @param recheio O primeiro recheio adicionado.
         */
        public Builder(final Pao pao, final String recheio) {
            paes.add(pao);
            recheios.add(recheio);
        }

        public Builder addPao(final Pao pao) {
            paes.add(pao);
            return this;
        }

        public Builder addRecheio(final String recheio) {
            recheios.add(recheio);
            return this;
        }

        public Builder addQueijo(final String queijo) {
            queijos.add(queijo);
            return this;
        }

        public Builder addVegeral(final String vegeral) {
            vegetais.add(vegeral);
            return this;
        }

        public Builder addMolho(final String molho) {
            molhos.add(molho);
            return this;
        }

        public Builder addTempeiro(final String tempeiro) {
            tempeiros.add(tempeiro);
            return this;
        }

        public Builder embaladoParaViagem(final boolean embaladoParaViagem) {
            this.embaladoParaViagem = embaladoParaViagem;
            return this;
        }

        /**
         * Cria uma instância da classe {@link Sanduiche} conforme os
         * parâmetros fornecidos.
         *
         * @return Uma instância da classe {@link Sanduiche} conforme os
         * parâmetros fornecidos.
         */
        public Sanduiche build() {
            return new Sanduiche(this);
        }
    }

    /**
     * Construtor PRIVADO que faz uso de objeto da classe {@link Builder}.
     *
     * @param builder Objeto contendo os valores a partir dos quais a instância
     *                da classe {@link Sanduiche} será criada.
     */
    private Sanduiche(Builder builder) {
        paes = Collections.unmodifiableSet(builder.paes);
        recheios = Collections.unmodifiableList(builder.recheios);
        queijos = Collections.unmodifiableList(builder.queijos);
        vegetais = Collections.unmodifiableList(builder.queijos);
        molhos = Collections.unmodifiableList(builder.molhos);
        tempeiros = Collections.unmodifiableList(builder.tempeiros);
        embaladoParaViagem = builder.embaladoParaViagem;
    }

    @Override
    public String toString() {
        final String sanduiche = String.join(", ", une(paes), une(recheios),
                une(queijos), une(vegetais), une(molhos), une(tempeiros));

        // Remove espaços com vírgulas caso não haja queijos, vegetais,
        // molhos e/ou tempeiros.
        return sanduiche.trim().replaceAll(" ,+", "");
    }

    /**
     * Concatena as sequências fornecidas na lista.
     *
     * @param lista A lista de sequências a serem concatenadas.
     *
     * @return A sequência de caracteres formada pela união das sequências
     * contidas na lista separadas por espaço em branco e vírgula.
     */
    private String une(List<String> lista) {
        return String.join(", ", lista);
    }

    static String une(Set<?> conjunto) {
        return conjunto.stream().map(Object::toString)
                .collect(Collectors.joining(", "));

    }
}
