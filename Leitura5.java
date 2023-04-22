package capituloII;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Leitura5 {
    
    public static void main(String[] args) {

    JOptionPane.showMessageDialog(null, "Calculando parcelas do crediário...");
    
    double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto? "));

    int numParcelas = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas? "));

    double valorParcela = valorTotal / numParcelas;

    NumberFormat formato = new DecimalFormat("R$ #,##0.00");
    
    JOptionPane.showMessageDialog(null, "O valor de cada parcela é: " + formato.format(valorParcela));
}
}