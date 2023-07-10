package Exercicios.easy;

import javax.swing.*;

public class Exercicio10_easy {
    public static void main(String[] args) {

        Double valorInvestido, valorJuros=0.00, valorTotal, taxaJuros=0.05;
        int ano=0;

        String valorDigitado = JOptionPane.showInputDialog("Digite o valor que será investido");

        valorInvestido = Double.parseDouble(valorDigitado);

        while (ano<=9) {
            ano++;
            valorJuros = valorJuros + (valorInvestido*taxaJuros);
        }

        valorTotal = valorInvestido + valorJuros;

        System.out.println("O valor investido foi de R$ " + valorInvestido);
        System.out.println("O valor dos juros foi de R$ " + valorJuros);
        System.out.println("O valor total no final do período foi de R$ " + valorTotal);
    }
}
