package Exercicios.medium;

import javax.swing.*;


public class Exercicio7_medium {
    public static void main(String[] args) {

        String[] meses=new String[12];
        int i=0;

        while(i<12){

            meses[i] = JOptionPane.showInputDialog("Digite os meses do ano");
            i++;
        }
    }
}
