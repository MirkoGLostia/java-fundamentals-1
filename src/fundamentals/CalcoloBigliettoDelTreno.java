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


        // calcolo costo biglietto
        double price = distance * 0.21;

        double finalPrice = price;

        if (userAge < 18){
            finalPrice = price - (price/100*20);
        } else if (userAge > 65) {
            finalPrice = price - (price/100*40);
        }


        System.out.print("ticket price: ");
        System.out.println(finalPrice + " euro");


        // chiusura scanner
        inputUtente.close();
    }
}
