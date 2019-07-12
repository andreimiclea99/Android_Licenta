package com.example.timisoara;

public class MoldelOpera {
    private int image;
    private String pret;
    private String name,data;

    public MoldelOpera(int image, String name, String data, String pret){
        this.image=image;
        this.name=name;
        this.pret=pret;
        this.data=data;

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

    public String getData(){
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPret(){
        return pret;
    }

    public void setPret(String pret) {
        this.pret = pret;
    }
}

