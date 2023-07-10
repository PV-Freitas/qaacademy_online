package Exercicios.medium;

import javax.swing.*;

public class Exercicio9_medium {
    public static void main(String[] args) {
        String[] alunos=new String[6];
        int[] numeroAlunos=new int[6];
        int i=0;

        while (i<6){
            alunos[i] = JOptionPane.showInputDialog("Digite o nome do aluno");
            numeroAlunos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do aluno"));
            i++;
        }
        i=0;

        while(i<6){
            System.out.println("Nome do aluno: " +alunos[i] + " - " + "número do aluno: " + numeroAlunos[i]);
            i++;
        }
    }
}
