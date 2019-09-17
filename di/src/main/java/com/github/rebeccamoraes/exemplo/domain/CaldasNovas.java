package com.github.rebeccamoraes.exemplo.domain;

import java.util.function.Supplier;

public class CaldasNovas implements Supplier<Leite> {
    
    public Leite get() {
        return new Leite("Caldas Novas");
    }
}