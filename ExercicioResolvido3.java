package capituloII;
 
public class ExercicioResolvido3 {

    public static void main(String[] args) {

        int soma = 0;
        int contador = 0;
        int media = 0;

        for (int i = 1; i<11; i++){
            contador = contador +1;
            soma = soma + 1;
            System.out.println("Laço: " + contador + "  soma =" + soma);
        }
        media = soma / contador;
        System.out.println("A Soma dos 10 primeiro números: " + soma);
        System.out.println("A Média dos 10 primeiro números: " + media);
    }
}

