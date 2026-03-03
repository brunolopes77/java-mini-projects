package Calculadora.test;

import Calculadora.dominio.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculradora = new Calculadora();
        double result = calculradora.somarDoisNumeros(10,20);
        System.out.println(result);
    }
}
