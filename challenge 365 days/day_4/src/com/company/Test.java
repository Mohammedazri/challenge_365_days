package com.company;

public class Test {
    public static void main(String[] args) {

        Animal a1 = new Animal();

        Animal a2 = new Chien();

        Animal a3 = new Pigeon();


        a1.deplacer();

        a2.deplacer();

        a3.deplacer();

    }

}
class Animal {
    void deplacer() {
        System.out.println("Je me déplace");
    }

    }



