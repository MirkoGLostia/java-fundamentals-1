package fundamentals;

import java.util.Scanner;

public class FestaACasaFerragnezBonus {
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
        int i = 0;

        while (i < listaInvitati.length){
            if (nomeUtente.equalsIgnoreCase(listaInvitati[i])){
                checkList = true;
                break;
            }
            i++;
        }

        if (checkList){
            System.out.println("you're welcome, have a great time");
        }else {
            System.out.println("you are not in the list");
        }



        // chiusura scanner
        inputUtente.close();
    }
}
