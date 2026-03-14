package LoginSystemSimulator.Test;

import LoginSystemSimulator.Dominio.ConsoleReader;

public class Main {
    //Crie um programa que peça usuário e senha.
    //O usuário correto é: `admin`
    //A senha correta é: `1234`
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();

        String correctUser;
        String correctPassword;
        int attempts = 0;

        do {
            correctUser = consoleReader.userInput();
            correctPassword = consoleReader.passwordInput();

            if (correctUser.equals("admin") && correctPassword.equals("1234")) {
                System.out.println("Login realizado com sucesso!");
                break;
            }
            System.out.println("Senha ou usuários inválidos.");
            attempts += 1;
            
            if (attempts == 3) {
                System.out.println("Conta bloqueada!");
            }
        } while (attempts < 3);
    }
}