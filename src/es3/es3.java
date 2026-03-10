package es3;

import java.util.Scanner;

public class es3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Inserisci una stringa da separare con virgole, inserisci:  :q  per interrompere");
            String inputString = scanner.nextLine();

            if (inputString.equals(":q")) break;


//            String[] caratteri = inputString.split("");
//            String risultato = String.join(",", caratteri);
//
//            System.out.println(risultato);

            System.out.println(String.join(",", inputString.split("")));
        }


    }
}
