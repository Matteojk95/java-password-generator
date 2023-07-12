package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {


        String name= "Pinco";
        String surname= "Pallo";
        int day= 12;
        int month= 5;
        int year= 1994;
        String prefercolor ="magenta";

        //somma valori data di nascita
        int somma= day+month+year;

        //calcolo della password
        String password = name+"-"+surname+"-"+prefercolor+"-"+somma;

        //stampo a video
        System.out.println("password");

    }
}
