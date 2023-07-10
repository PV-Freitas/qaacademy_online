package Exercicios.easy;

import javax.swing.*;

public class Exercicio08_easy {
    public static void main(String[] args) {

        double salarioBruto, salarioLiquido=0.00, irpf=0.00;

        String salarioStg = JOptionPane.showInputDialog("Digite o valor do seu salário");

        salarioBruto = Double.parseDouble(salarioStg);

        if(salarioBruto<=1903.98){
            irpf=0.00;
            salarioLiquido = salarioBruto - irpf;

        }

        if(salarioBruto>=1903.99 && salarioBruto<=2826.65){
            irpf= (salarioBruto *0.075) - 142.8;
            salarioLiquido = salarioBruto - irpf;

        }

        if(salarioBruto>=2826.66 && salarioBruto<=3751.05){
            irpf= (salarioBruto *0.15) - 354.8;
            salarioLiquido = salarioBruto - irpf;
        }

        if(salarioBruto>=3751.06 && salarioBruto<=4664.68){
            irpf= (salarioBruto *0.225) - 636.13;
            salarioLiquido = salarioBruto - irpf;
        }

        if(salarioBruto>=4664.69){
            irpf= (salarioBruto *0.275) - 869.36;
            salarioLiquido = salarioBruto - irpf;
        }

        System.out.println("Seu salário bruto é de R$ "+salarioBruto);
        System.out.println("Seu salário líquido é de R$ "+salarioLiquido);
        System.out.println("O valor pago de Imposto de Renda é de R$ "+irpf);
    }
}
