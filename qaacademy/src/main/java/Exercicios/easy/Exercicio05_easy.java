package Exercicios.easy;

import javax.swing.*;

public class Exercicio05_easy {
    public static void main(String[] args) {

        int primeiroNumero, segundoNumero, terceiroNumero, soma, subtracao, multi, media;

        String primeiroNumeroUsuario = JOptionPane.showInputDialog("Digite o primeiro número");
        String segundoNumeroUsuario = JOptionPane.showInputDialog("Digite o segundo numero");
        String terceiroNumeroUsuario = JOptionPane.showInputDialog("Digite o terceiro número");

        primeiroNumero = Integer.parseInt(primeiroNumeroUsuario);
        segundoNumero = Integer.parseInt(segundoNumeroUsuario);
        terceiroNumero = Integer.parseInt(terceiroNumeroUsuario);

        soma = primeiroNumero+segundoNumero+terceiroNumero;
        subtracao = primeiroNumero-segundoNumero-terceiroNumero;
        multi = primeiroNumero*segundoNumero*terceiroNumero;
        media = soma/3;

        System.out.println("A soma dos números digitados é: "+soma);
        System.out.println("A subtração dos números digitados é: " +subtracao);
        System.out.println("A multiplicação dos números digitados é: "+multi);
        System.out.println(("A média dos números digitados é: "+media));


    }
}
