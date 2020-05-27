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
        int num, horas;
        double sal_hora, salario;
        num = teclado.nextInt();
        horas = teclado.nextInt();
        sal_hora = teclado.nextDouble();
        
        salario = horas * sal_hora;
        
        System.out.println("NUMBER = " + num);
        System.out.println("SALARY = U$ " + formata.format(salario));
    }
 
}