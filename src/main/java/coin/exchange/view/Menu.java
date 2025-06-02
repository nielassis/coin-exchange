package coin.exchange.view;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("===== CURRENCY CONVERTER =====");
        System.out.println("1. BRL para USD");
        System.out.println("2. USD para BRL");
        System.out.println("3. BRL para EUR");
        System.out.println("4. EUR para BRL");
        System.out.println("5. Encerrar");
        System.out.print("Escolha uma opção: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Opção ínvalida, tente um número:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public double readAmount() {
        System.out.print("Insira uma quantidade para converter: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Quantidade ínvalida. Por favor tente um número (e.x., 100.00):");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public void closeScanner() {
        scanner.close();
    }
}
