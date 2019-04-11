package com.example.dagger2;

public class Americano {
    private Espresso espresso;
    private Water water;

    private String coffeBrand = "MoonBucksCoffee";

    public Americano(Espresso espresso, Water water) {
        this.espresso = espresso;
        this.water = water;
    }

    public String getCoffeBrand() {
        return coffeBrand;
    }
}
