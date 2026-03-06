package Calculadora.test;

import Calculadora.dominio.MathOperation;
import Calculadora.dominio.ShowMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperation operation = new MathOperation();
        ShowMenu menu = new ShowMenu();
        String again = "S";
        while (again.equalsIgnoreCase("S")) {
            menu.menu1();

            int option = scanner.nextInt();
            if (option < 1 || option > 4){
                System.out.println("Opcao invalida");
                continue;
            }

            double num1;
            double num2;

            System.out.println("Qual o primeiro número? ");
            num1 = scanner.nextDouble();
            System.out.println("Qual o segundo número? ");
            num2 = scanner.nextDouble();

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
                    if (num2 == 0){
                        System.out.println("Nao existe divisao por zero!");
                    }else {
                        System.out.println("O resultado é: " + operation.divisionNumbers(num1, num2));
                    }
                    break;

            }
            System.out.println("Deseja fazer outra operação?[S/N]");
            again = scanner.next();
            if (again.equalsIgnoreCase("N")){
                System.out.println("Calculadora encerrada.");
            }
        }
        scanner.close();
    }
}

