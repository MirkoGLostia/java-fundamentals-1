package fundamentals;

import java.util.Scanner;

public class FestaACasaFerragnez {
    public static void main(String[] args) {

        // creazione array degli invitati
        String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        // inizializzazione scanenr
        Scanner inputUtente = new Scanner(System.in);

        // richiesta nome utente
        System.out.println("what is your name?");
        String nomeUtente = inputUtente.nextLine();

        boolean checkList = false;

        // confronto nome utente nella lista con un ciclo
        for (int i = 0; i < listaInvitati.length; i++) {
            if (nomeUtente.equals(listaInvitati[i])){
                checkList = true;
                break;
            }
        }

        if (checkList){
            System.out.println("you're welcome, have a great time");
        }else {
            System.out.println("get lost punk");
        }



        // chiusura scanner
        inputUtente.close();
    }
}
