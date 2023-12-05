package com.xmzedu.codeblock_;

public class CodeBlock01 {
}

class Movie {
    private String name;
    private double price;
    private String director;

    public Movie(String name) {
        System.out.println(" ");
        this.name = name;
    }

    public Movie(double price, String director) {
        this.price = price;
        this.director = director;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
