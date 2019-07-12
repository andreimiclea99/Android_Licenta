package com.example.timisoara;

public class MoldelTuristic {
    private int image;
    ;
    private String titlu,descriere;

    public MoldelTuristic(int image, String titlu, String descriere){
        this.image=image;
        this.titlu=titlu;

        this.descriere=descriere;

    }

    public int getImage(){
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitlu(){
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getDescriere(){
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }


}
