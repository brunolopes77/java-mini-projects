package ContaBancaria.test;

import Calculadora.dominio.ShowMenu;
import ContaBancaria.dominio.ShowMenuBank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShowMenuBank menuOperation = new ShowMenuBank();
        System.out.print("NOME DO TITULAR: ");
        String accountHolderName = scanner.nextLine();
        float balance = 0;
        System.out.println("SALDO: R$ "+balance);

        menuOperation.menu();

        

    }
}
