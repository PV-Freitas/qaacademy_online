package Exercicios.easy;

import javax.swing.*;

public class Exercicio06_easy {
    public static void main(String[] args) {

        double notaUm, notaDois, media;

        String notaUmUsuario = JOptionPane.showInputDialog("Primeira nota");
        String notaDoisUsuario = JOptionPane.showInputDialog("Segunda nota");

        notaUm = Integer.parseInt(notaUmUsuario);
        notaDois = Integer.parseInt(notaDoisUsuario);

        media = (notaUm+notaDois)/2;

        if(media>5) {
            System.out.println("Parabéns, você foi aprovado!");
        }

        if(media<5) {
            System.out.println("Que pena, você foi reprovado.");
        }

        if(media==5) {
            System.out.println("Você precisará passar por um segundo exame. Prepare-se e boa prova!");
        }


    }
}
