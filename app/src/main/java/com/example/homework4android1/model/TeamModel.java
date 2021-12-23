package com.example.homework4android1.model;

public class TeamModel {
    private String name;
    private String description;

    public TeamModel(String name , String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
