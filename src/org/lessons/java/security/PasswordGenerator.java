package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        // inizializzazione scanner
        Scanner inputUtente = new Scanner(System.in);

        // raccolta dati utente
        System.out.println("what is your name?");
        String userName = inputUtente.nextLine();

        System.out.println("what is your surname?");
        String userSurname = inputUtente.nextLine();

        System.out.println("what is your preferred colour?");
        String userColour = inputUtente.nextLine();

        System.out.println("when where you born?");
        System.out.print("day: ");
        int userBirthDateDay = inputUtente.nextInt();

        System.out.println("when where you born?");
        System.out.print("month: ");
        int userBirthDateMonth = inputUtente.nextInt();

        System.out.println("when where you born?");
        System.out.print("year: ");
        int userBirthDateYear = inputUtente.nextInt();


        // generazione password
        int numberPassword = userBirthDateDay + userBirthDateMonth + userBirthDateYear;
        System.out.println("this is your password");
        System.out.println(userName + "-" + userSurname + "-" + userColour + "-" + numberPassword);


        // chiusura scanner
        inputUtente.close();
    }
}
