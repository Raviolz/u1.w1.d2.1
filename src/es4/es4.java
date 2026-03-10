package es4;

import java.util.Scanner;

public class es4 {
    static String countdown(int secondi) {

        secondi = Math.abs(secondi); // per numero assoluto no segno

        if (secondi > 20) {
            secondi = 20;
        } // per forzare massimo

        String report = "";

        for (int i = secondi; i >= 1; i--) {

            if (i % 2 == 0) {
                report += "[OK] " + i + "\n";
            } else {
                report += "[CHECK] " + i + "\n";
            }

            if (i == 10) {
                report += "--- SEPARAZIONE STADIO ---\n";
            }
        }

        report += "--- 🚀 IGNITION ---";

        return report;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci i secondi per il countdown:");
        int secondi = Integer.parseInt(scanner.nextLine());


        System.out.println(countdown(secondi));


    }
}
