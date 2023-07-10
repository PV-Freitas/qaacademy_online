package Exercicios.medium;

public class Exercicio1_medium {
    public static void main(String[] args) {

        int i=0;

        while (i<=99){
            i++;
            if(i%2==0){
                System.out.println("O número " +i+ " é par!");
            }
            else
                System.out.println("O número " +i+ " é ímpar");
        }
    }
}
