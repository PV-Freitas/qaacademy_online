package exemploMetodos;

public class ExercicioMetodosComParametro {
    public static void main(String[] args) {
        System.out.println(exibirNomeEIdade(37,"Paulo Vitor"));
        System.out.println(retornarPalavra("Teste"));
        System.out.println(retornarDobro(10));
        System.out.println(retornarNomeESobrenome("Paulo Vitor","Freitas"));
        System.out.println(retornarSalario("Paulo Vitor"));

        //metodos sem retorno

        exibirNomeEIdadeSemRetorno(37,"Paulo Vitor");
        retornarPalavraSemRetorno("Teste");
        retornarDobroSemRetorno(10);
        retornarNomeESobrenomeSemRetorno("Paulo Vitor","Freitas");
        retornarSalarioSemRetorno("Paulo Vitor");

    }
    public static String exibirNomeEIdade(int idade, String nome) {
        return "Nome: " + nome + " - Idade: " + idade;
    }

    public static String retornarPalavra(String palavra){
        return palavra;
    }

    public static int retornarDobro(int numero){
        return numero * 2;
    }

    public static String retornarNomeESobrenome(String nome, String sobrenome){
        return nome + " " + sobrenome;
    }

    public static double retornarSalario(String nome){
        return 2000.00;
    }

    public static void exibirNomeEIdadeSemRetorno(int idade, String nome) {
        System.out.println("Nome: " + nome + " - Idade: " + idade);
    }

    public static void retornarPalavraSemRetorno(String palavra){
        System.out.println(palavra);
    }

    public static void retornarDobroSemRetorno(int numero){
        System.out.println(numero * 2);
    }

    public static void retornarNomeESobrenomeSemRetorno(String nome, String sobrenome){
        System.out.println(nome + " " + sobrenome);
    }

    public static void retornarSalarioSemRetorno(String nome){
        System.out.println(2000.00);
    }
}
