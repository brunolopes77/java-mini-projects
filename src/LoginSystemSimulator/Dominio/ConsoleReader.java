package LoginSystemSimulator.Dominio;

import java.util.Scanner;

public class ConsoleReader {
    Scanner scanner = new Scanner(System.in);

    public String userInput() {
        System.out.println("LOGIN");
        System.out.print("Digite o usuário: ");
        String user = scanner.next();

        return user;
    }

    public String passwordInput() {
        System.out.print("Digite a senha: ");
        String  password = scanner.next();

        return password;
    }
}
