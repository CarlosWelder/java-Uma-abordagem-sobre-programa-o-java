package capituloII;

public class ExemploMetodos {
    
    public static void escreverBoasVindas() {
    System.out.println("Olá Pessoal");
    System.out.println("Bem Vindos ao Curso de Java...");
}
    public static void listarChamada() {
    System.out.println("Estão presentes os cursistas:");
    System.out.println("João\nMaria\nPedro\nCarlos\nSilva");
}
    public static void main(String[] args) {
      escreverBoasVindas();
      int i = 10;
      
      listarChamada();
      // se chegarem mais alunos, serão novamento saudados
      escreverBoasVindas();
      // Um método pode ser chamado quantas vezes forem necessárias

    }

}