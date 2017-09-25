package com.example.demo.dal;


public class Word {

    private int id;
    private String value;

    Word(Integer id, String value){
        super();

        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }



    public String getValue() {
        return value;
    }

}
