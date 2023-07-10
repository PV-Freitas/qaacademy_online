package Exercicios.easy;

import javax.swing.*;

public class Exercicio11_easy {
    public static void main(String[] args) {

        int numero, i=0;

        String numeroDigitado = JOptionPane.showInputDialog("Digite um número");

        numero = Integer.parseInt(numeroDigitado);

        while (i<=99) {
            i++;
            numero = numero + 2;
            System.out.println("O total somado é: " + numero);
        }
    }
}
