package capituloII;

import javax.swing.JOptionPane;

public class ExemploConversao {
    
    public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog("Digite um número: ");

        Byte num1 = Byte.parseByte(numero);
        Short num2 = Short.parseShort(numero);
        Integer num3 = Integer.parseInt(numero);
        long num4 = Long.parseLong(numero);
        Float num5 = Float.parseFloat(numero);
        Double num6 = Double.parseDouble(numero);

        JOptionPane.showMessageDialog(null, "Os números convertidos são: \n" + num1 + "\n" + num2 + "\n" + num3 + "\n" + num4 + "\n" + num5 + "\n" + num6);
        

    }
}
