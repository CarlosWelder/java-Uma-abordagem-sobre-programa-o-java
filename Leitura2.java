package capituloII;

import java.util.Scanner;

public class Leitura2 {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
   
        System.out.println("Digita seu nome");
        String nome = ler.next();
   
        System.out.println("Digita um número inteiro (tipo float)");
        float num1 = ler.nextFloat();
   
        System.out.println("Digita um número inteiro (tipo short)");
        double num2 = ler.nextDouble();

        System.out.println(nome + "\n" + num1 + "\n" + num2);

   
}
}
