package LoginSystemSimulator.Test;

import LoginSystemSimulator.Dominio.ConsoleReader;

public class Main {
    //Crie um programa que peça usuário e senha.
    //O usuário correto é: `admin`
    //A senha correta é: `1234`
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();

        String correctUser = "admin";
        String correctPassword = "1234";

        consoleReader.userInput();
        consoleReader.passwordInput();

        if (consoleReader.userInput() == correctUser.equals("admin") && consoleReader.passwordInput() == correctPassword){
            System.out.println("Login realizado com sucesso!");
        }else {
            System.out.println("Usuário ou senha incorretos. ");
        }
    }
}
