package Exercicios.easy;

import javax.swing.*;

public class Exercicio09_easy {
    public static void main(String[] args) {
        int numero, i=0, resultado;

        String numeroDigitado = JOptionPane.showInputDialog("Digite um número de 1 a 10");

        numero = Integer.parseInt(numeroDigitado);

        while (i<=9) {
            i++;
            resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}
