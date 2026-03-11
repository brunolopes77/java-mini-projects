package LoginSystemSimulator.Dominio;

import java.util.Scanner;

public class ConsoleReader {
    Scanner scanner = new Scanner(System.in);

    public String userInput(){

        System.out.println("LOGIN");
        System.out.println("Digite o usuário: ");
        String consoleUserImput = scanner.next();

        return consoleUserImput;
    }
    public String passwordInput(){
        System.out.println("Digite a senha: ");
        String consolePasswordInput = scanner.next();

        return consolePasswordInput;
    }

}
