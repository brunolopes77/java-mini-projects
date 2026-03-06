package Calculadora.test;

import Calculadora.dominio.MathOperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < ; i++) {
         //talvez um while do
        }
        System.out.println("ESCOLHA A OPCAO QUE DESEJA FAZER");
        System.out.println("[1] Somar");
        System.out.println("[2] Subtrair");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        System.out.println("[5] Sair");
        System.out.println("--------------------------------------");
        Scanner userOption = new Scanner(System.in);
        int option = userOption.nextInt();
        if (option == 5 ){
            System.out.println("Programa encerrado!");
        }else {
            double num1;
            double num2;

            Scanner userSelectedNumbers = new Scanner(System.in);
            System.out.println("Qual o primeiro número? ");
            num1 = userSelectedNumbers.nextDouble();
            System.out.println("Qual o segundo número? ");
            num2 = userSelectedNumbers.nextDouble();


            MathOperation operation = new MathOperation();
            switch (option) {
                case 1:
                    System.out.println("O resultado é: " + operation.addNumbers(num1, num2));
                    break;
                case 2:
                    System.out.println("O resultado é: " + operation.subtractNumbers(num1, num2));
                    break;
                case 3:
                    System.out.println("O resultado é: " + operation.multiplicationNumbers(num1, num2));
                    break;
                case 4:
                    System.out.println("O resultado é: " + operation.divisionNumbers(num1, num2));
                    break;
            }
            System.out.println("Deseja fazer outra operação?[S/N]");
            Scanner otherOperation = new Scanner(System.in);
            String again = otherOperation.nextLine();


            userSelectedNumbers.close();
        }
    }
}
