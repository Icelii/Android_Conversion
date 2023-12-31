package com.example.android_conversion.models;

public class Kelvin extends Grado{
    public Kelvin(Double valor) {
        this.setValor(valor);
        this.setUnidad("K");
    }

    public Kelvin parse(Celcius C){
        Double valor = (C.getValor() -  273.15 );
        return new Kelvin(valor);
    }

    public Kelvin parse(Farenheit F){
        Double valor = ((F.getValor() - 273.15) * 9/5 + 32);
        return new Kelvin(valor);
    }
}
