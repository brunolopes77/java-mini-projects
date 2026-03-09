package SimulationBankAccount.dominio;

import java.util.Scanner;

public class BankAccount {
    Scanner scanner = new Scanner(System.in);

    public float deposit() {
        System.out.print("Qual valor deseja depositar? ");
        float deposited = scanner.nextFloat();
        System.out.println("Valor: " + deposited + " depositado com sucesso!");

        return deposited;
    }

    public float withDraw(float balance1) {
        System.out.println("Qual valor deseja sacar? ");
        float withDrawn = scanner.nextFloat();
        if (balance1 < withDrawn) {
            System.out.println("Saldo insuficiente.");
            return 0;
        }
        System.out.println("Valor: " + withDrawn + " foi sacado com sucesso!");
        return withDrawn;
    }
}
