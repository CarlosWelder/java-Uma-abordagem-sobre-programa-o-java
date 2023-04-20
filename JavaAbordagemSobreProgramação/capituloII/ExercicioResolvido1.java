package capituloII;

public class ExercicioResolvido1 {

    public static void main(String[] args) {

        int soma = 0;
        int contador = 0;
        int media = 0;

        while (contador<10) {
            contador = contador +1;
            soma = soma + contador;
            System.out.println("Laço: " + contador + " soma="+soma);
        }

        media = soma / contador;
        System.out.println("A Soma dos 10 primeiro números: " + soma);
        System.out.println("A Média dos 10 primeiro números: " + media);
    }

}