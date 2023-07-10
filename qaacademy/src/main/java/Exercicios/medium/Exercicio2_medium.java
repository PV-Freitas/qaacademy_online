package Exercicios.medium;

import javax.swing.*;

public class Exercicio2_medium {
    public static void main(String[] args) {

        Double valorInvestido, totalAtualizadoComJuros, taxaJuros=0.05;
        int ano=1;

        String valor = JOptionPane.showInputDialog("Digite o valor do investimento");
        valorInvestido = Double.parseDouble(valor);

        totalAtualizadoComJuros = valorInvestido;

        while (ano<=10){
            totalAtualizadoComJuros = (totalAtualizadoComJuros*taxaJuros) + totalAtualizadoComJuros;
            ano++;
        }

        System.out.println("O valor investido foi de R$ " + valorInvestido);
        System.out.println("O valor dos juros foi de R$ " + (totalAtualizadoComJuros - valorInvestido));
        System.out.println("O valor total no final do período foi de R$ " + (valorInvestido + totalAtualizadoComJuros));
    }
}
