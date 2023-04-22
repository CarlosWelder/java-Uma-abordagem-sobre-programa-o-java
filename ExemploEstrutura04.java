package capituloII;

public class ExemploEstrutura04 {
    
    public static void main(String[] args) {

        char letra = 'x';
        switch(letra) {
            case 'c': System.out.println("Letra c");
            break;

            case 'p': System.out.println("Letra p");
            break;

            case 'u': System.out.println("Letra u");
            break;
            
            default:  System.out.println("Opção não disponível");
            System.out.println("Não foram escolhidas 'c' , 'p' nem 'u'");
        }

    }
}
