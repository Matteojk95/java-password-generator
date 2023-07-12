package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args)
    {

        Scanner scanner= new Scanner(System.in);

        System.out.println ("your name?");
        String name= scanner.nextLine();

        System.out.println("your surname?");
         String surname= scanner.nextLine();

        System.out.println("day of birth?");
        int day= scanner.nextInt();

        System.out.println ("month of birth?");
        int month = scanner.nextInt();

        System.out.println( "year of birth?");
        int year= scanner.nextInt();

        scanner.nextLine();
        System.out.println("your prefer color?");
        String prefercolor = scanner.nextLine();
        

        //somma valori data di nascita
        int somma= day+month+year;

        //calcolo della password
        String password = name+"-"+surname+"-"+prefercolor+"-"+somma;

        //stampo a video
        System.out.println(password);
    }
}
