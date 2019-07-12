package com.example.timisoara;

public class ModelRestaurant {

    private int image;
    private double valoare;
    private String name;

    public ModelRestaurant(int image, String name, double valoare){
        this.image=image;
        this.name=name;
        this.valoare=valoare;


    }

    public int getImage(){
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getValoare(){
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }


}
