package exemploInstanciaDeClasse;

public class ExecucaoExercicio01 {
    public static void main(String[] args) {
        Exercicio01 exercicio01 = new Exercicio01();
        System.out.println(exercicio01.variavelUm);
        System.out.println(exercicio01.variavelDois);

        exercicio01.primeiroMetodo();
        exercicio01.segundoMetodo();
        exercicio01.terceiroMetodo();
    }
}
