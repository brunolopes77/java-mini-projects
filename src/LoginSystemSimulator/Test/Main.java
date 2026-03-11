package LoginSystemSimulator.Test;

import LoginSystemSimulator.Dominio.ConsoleReader;

public class Main {
    //Crie um programa que peça usuário e senha.
    //O usuário correto é: `admin`
    //A senha correta é: `1234`
    public static void main(String[] args) {
        ConsoleReader user = new ConsoleReader();
        ConsoleReader password = new ConsoleReader();

        String correctUser = "admin";
        String correctPassword = "1234";

        user.userInput();
        password.passwordInput();

        if (user.userInput() == correctUser.equals("admin") && password.passwordInput() == correctPassword){
            System.out.println("Login realizado com sucesso!");
        }else {
            System.out.println("Usuário ou senha incorretos. ");
        }

    }
}
