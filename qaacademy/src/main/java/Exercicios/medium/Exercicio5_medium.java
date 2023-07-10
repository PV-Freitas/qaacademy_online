package Exercicios.medium;

import javax.swing.*;

public class Exercicio5_medium {
    public static void main(String[] args) {

        int numeroDigitado, menorNumero=0, i=1;
        String numeroStg;

        while(i<=5){

            numeroStg = JOptionPane.showInputDialog("Digite um número");
            numeroDigitado = Integer.parseInt(numeroStg);

            if (numeroDigitado<menorNumero || i==1){
                menorNumero = numeroDigitado;
            }
            i++;
        }
        System.out.println("O número " + menorNumero + " é o menor");
    }
}
