package com.example.android_conversion.models;

public class Celcius extends Grado{

    public Celcius(Double valor) {
        this.setValor(valor);
        this.setUnidad("C");
    }

    public Celcius parse(Farenheit F){
        Double valor = (F.getValor() * 9/5) + 32;

        return new Celcius(valor);
    }

    public Celcius parse(Kelvin K){
        Double valor = (K.getValor() + 273.15);
        return new Celcius(valor);
    }
}
