package SimulationBankAccount.test;

import SimulationBankAccount.dominio.BankAccount;
import SimulationBankAccount.dominio.ShowMenuBank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ShowMenuBank showMenuBank = new ShowMenuBank();
        BankAccount bankAccount = new BankAccount();

        System.out.print("NOME DO TITULAR: ");
        String accountHolderName = scanner.nextLine();
        System.out.println("SALDO INICIAL R$ 00,0");

        float balance = 0;
        int option;
        do {
            showMenuBank.MenuBank();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    balance += bankAccount.deposit();
                    break;
                case 2:
                    balance -= bankAccount.withDraw();
                    break;
                case 3:
                    System.out.println("Saldo:" + balance);
                    break;
                case 4:
                    System.out.println(accountHolderName + " Saiu da conta bancária.");
                    break;
                default:
                    System.out.println("Opção errada!");
                    break;
            }
        } while (option != 4);
    }
}