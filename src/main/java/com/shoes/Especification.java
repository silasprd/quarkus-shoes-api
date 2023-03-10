package com.shoes;

public class Especification {

    private String brand;
    private Integer number;
    private String color;

    public Especification(String brand, Integer number, String color){
        this.brand = brand;
        this.number = number;
        this.color = color;
    }

    public String getBrand(){
        return brand;
    }
    public Integer getNumber(){
        return number;
    }
    public String getColor(){
        return color;
    }

    public boolean compare(Especification especification){
        if(brand.equals(especification.brand) && number.equals(especification.number) && color.equals(especification.color)){
            return true;
        } else {
            return false;
        }
    }
}
