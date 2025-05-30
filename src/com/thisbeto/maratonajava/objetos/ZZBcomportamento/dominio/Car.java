package com.thisbeto.maratonajava.objetos.ZZBcomportamento.dominio;

public class Car {
    private String name = "Audi";
    private String color;
    private int year;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
