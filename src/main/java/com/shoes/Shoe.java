package com.shoes;

public class Shoe {
    
    private String model;
    private Especification especification;


    public Shoe(String model, Especification especification){
        this.model = model;
        this.especification = especification;
    }

    public String getModel(){
        return model;
    }

    public Especification getEspecification(){
        return especification;
    }

}
