package com.example.retrofit.QUERY;

import java.util.List;

public class Adress {
    private List<Country> country;

    private String name;

    public List<Country> getCountry() {
        return country;
    }

    public void setCountry(List<Country> country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
