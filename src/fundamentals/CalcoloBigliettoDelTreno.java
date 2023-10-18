package fundamentals;

import java.util.Scanner;

public class CalcoloBigliettoDelTreno {
    public static void main(String[] args) {

        // inizializzazione scanner
        Scanner inputUtente = new Scanner(System.in);

        // richiesta dati all'utente
        System.out.println("How far will you go?");
        System.out.print("Km ");
        int distance = inputUtente.nextInt();


        System.out.println("How old are you?");
        int userAge = inputUtente.nextInt();

        // variabili per i prezzi
        double priceAtKm = 0.21;
        double discountMinor = 0.2;
        double discountSenior = 0.4;

        // calcolo costo biglietto

        double price = distance * priceAtKm;

        double finalPrice = price;

        if (userAge < 18){
            finalPrice = price * discountMinor;
        } else if (userAge > 65) {
            finalPrice = price * discountSenior;
        }


        System.out.print("ticket price: ");
        System.out.println(finalPrice + " euro");


        // chiusura scanner
        inputUtente.close();
    }
}
