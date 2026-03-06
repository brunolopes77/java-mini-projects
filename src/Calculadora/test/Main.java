package Calculadora.test;

import Calculadora.dominio.MathOperation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again = "S";
        while (again.equalsIgnoreCase("S")) {

            System.out.println("ESCOLHA A OPCAO QUE DESEJA FAZER");
            System.out.println("[1] Somar");
            System.out.println("[2] Subtrair");
            System.out.println("[3] Multiplicar");
            System.out.println("[4] Dividir");
            System.out.println("--------------------------------------");

            int option = scanner.nextInt();

            double num1;
            double num2;

            System.out.println("Qual o primeiro número? ");
            num1 = scanner.nextDouble();
            System.out.println("Qual o segundo número? ");
            num2 = scanner.nextDouble();

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
            again = scanner.next();

        }
        scanner.close();
    }
}

