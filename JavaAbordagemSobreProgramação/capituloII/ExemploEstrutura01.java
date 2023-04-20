package capituloII;

import java.util.Scanner;

public class ExemploEstrutura01 {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
    int x = 0;
    
    System.out.print("Digite um número: ");
    x = teclado.nextInt();

    if(x <= 10){
        System.out.println("Verdadeiro: " + x + " é menor ou igual a 10");
        System.out.println("Para aparecer essa frase é preciso que" + " a condição retorne true");
    }
    else {
    System.out.println("Falso");
    }
    
}
}