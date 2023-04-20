package capituloII;

public class ExemploEstrutura02 {
    
    public static void main(String[] args) {
    
        String nome = "João";
        int idade = 18; // supondo que o usuário digite 18

        if (idade <10) {

            System.out.println(nome + " é menor e criança");
        }
        else if (idade < 18 ){
            System.out.println(nome + " é menor e adolescente");

        }
        else if (idade < 21 ){
            System.out.println(nome + " é maior e Jovem adulto");

        }
        else {
            System.out.println(nome + " é maior e adulto");

        }

        
        


    }
}
