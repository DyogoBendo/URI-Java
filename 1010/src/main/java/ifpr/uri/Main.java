/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpr.uri;

/**
 *
 * @author Dyogo
 */
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formata = new DecimalFormat("0.00");
        
        int cod1, cod2, num1, num2;
        double valor1, valor2, total;
        cod1 = teclado.nextInt();
        num1 = teclado.nextInt();
        valor1 = teclado.nextDouble();
        cod2 = teclado.nextInt();
        num2 = teclado.nextInt();
        valor2 = teclado.nextDouble();
        total = num1 * valor1 + num2 * valor2;
        
        System.out.println("VALOR A PAGAR: R$ " + formata.format(total));
        
    }
 
}