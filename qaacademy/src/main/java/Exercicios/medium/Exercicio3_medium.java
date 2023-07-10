package Exercicios.medium;

import java.text.BreakIterator;

public class Exercicio3_medium {
    public static void main(String[] args) {

        int i=0, soma=0;

        while (i<=1000){
            soma = soma + i;
            System.out.println(soma);
            i++;

            if(soma>=1500){
                break;
            }

        }
    }
}
