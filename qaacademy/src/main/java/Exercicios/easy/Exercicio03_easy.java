package Exercicios.easy;

import javax.swing.*;

public class Exercicio03_easy {
    public static void main(String[] args) {
        String primeiroValor;
        String segundoValor;

        primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor");
        segundoValor = JOptionPane.showInputDialog("Digite o segundo valor");

        System.out.println("O primeiro valor digitado foi " +segundoValor);
        System.out.println("O segundo valor digitado foi " +primeiroValor);
    }
}
