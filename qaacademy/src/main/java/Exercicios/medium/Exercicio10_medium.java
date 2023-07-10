package Exercicios.medium;

import javax.swing.*;

public class Exercicio10_medium {
    public static void main(String[] args) {

        int elemento=10, i=2;
        int [] fibonacci = new int[elemento];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        while (i<elemento){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            i++;
        }
        i=0;

        while (i<elemento){
            System.out.println(fibonacci[i]);
            i++;
        }

    }
}
