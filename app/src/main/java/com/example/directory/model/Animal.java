package com.example.directory.model;

public class Animal {private String name;
    private int animalResource;

    public Animal(String name, int animalResource){
        this. name = name;
        this. animalResource = animalResource;

    }
    public String getName(){return name;}

    public void setName(String name){this.name = name; }

    public int getAnimalResource(){return animalResource;}

    public void setAnimalResource(int animalResource){this.animalResource = animalResource;}


}