package com.devix.company;

public class Main {

    public static void main(String[] args) {

        String[] values = {"Cat", "Bear", "Dog", "Bird"};

        for (String value : values) {
            if (value.startsWith("B")) {
                continue;
            }
            //Evitar mostrar array con valores iniciados en "B"
            System.out.println(value);
        }
    }
}
