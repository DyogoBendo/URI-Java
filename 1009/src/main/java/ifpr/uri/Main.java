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
        String nome;
        double salario, bonus, total;
        nome = teclado.next();
        salario = teclado.nextDouble();
        bonus = teclado.nextDouble();
        
        total = salario + (bonus * 15/100);
        System.out.println("TOTAL = R$ " + formata.format(total));
    }
 
}