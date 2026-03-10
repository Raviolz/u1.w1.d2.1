package es2;

import java.util.Scanner;

public class es2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao dammi un numero da 0 a 3");
        int n1 = Integer.parseInt(scanner.nextLine());

        switch (n1) {
            case 0: {
                System.out.println("zero");
            }
            break;
            case 1: {
                System.out.println("uno");
            }
            break;
            case 2: {
                System.out.println("due");
            }
            break;
            case 3: {
                System.out.println("tre");
            }
            break;

            default: {
                System.out.println("non tra quelli indicati");
            }
        }
    }
}
