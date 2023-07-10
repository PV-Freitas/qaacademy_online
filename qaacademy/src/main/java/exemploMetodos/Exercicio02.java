package exemploMetodos;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println(metodoComRetorno());
        System.out.println(metodoComRetornoDois());
        System.out.println(metodoComRetornoTres());
        System.out.println(metodoComRetornoQuatro());
        System.out.println(metodoComRetornoCinco());
    }
    public static String metodoComRetorno() {
        String mensagem = "Primeiro método";
        return mensagem;

    }
   public static int metodoComRetornoDois() {
        return 2;
   }

  public static double metodoComRetornoTres() {
        return 3.0;
  }

  public static boolean metodoComRetornoQuatro() {
        return true;
  }

  public static String metodoComRetornoCinco() {
        return "metodoCinco";

  }
}
