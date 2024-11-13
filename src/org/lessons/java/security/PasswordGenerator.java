package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome");
        String nameUser = input.nextLine();

        System.out.println("Inserisci il tuo cognome");
        String surnameUser = input.nextLine();

        System.out.println("Inserisci il tuo colore preferito");
        String colorUser = input.nextLine();

        System.out.println("Inserisci il giorno della tua data di nascita");
        int dayDateOfBirthUser = input.nextInt();
        System.out.println("Inserisci il mese della tua data di nascita");
        int monthDateOfBirthUser = input.nextInt();
        System.out.println("Inserisci l'anno della tua data di nascita");
        int ageDateOfBirthUser = input.nextInt();

        System.out.println(nameUser + " " + surnameUser + ", nato il " + dayDateOfBirthUser + "/" + monthDateOfBirthUser
                + "/" + ageDateOfBirthUser + ", il cui colore preferito è il " + colorUser);

        input.close();
    }
}
