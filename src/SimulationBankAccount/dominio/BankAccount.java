package SimulationBankAccount.dominio;

import java.util.Scanner;

public class BankAccount {
    Scanner scanner = new Scanner(System.in);

    public float deposit(){
        System.out.print("Qual valor deseja depositar? ");
        float deposited = scanner.nextFloat();
        System.out.println("Valor: "+deposited+" depositado com sucesso!");

        return deposited;
    }
    public float withDraw(){
        System.out.println("Qual valor deseja sacar? ");
        float withDrawn = scanner.nextFloat();
        System.out.println("Valor: "+withDrawn+" foi sacado com sucesso!");

        return withDrawn;
    }
}
