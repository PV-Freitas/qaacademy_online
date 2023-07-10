package Exercicios.medium;

public class Exercicio4_medium {
    public static void main(String[] args) {

        int i=1, multi=1;

        while (i<=1000){
            multi = multi*i;
            i++;
            System.out.println("O resultado da multiplicação é " +multi);

            if(multi>=1000){
                multi=1;
            }

        }
    }
}
