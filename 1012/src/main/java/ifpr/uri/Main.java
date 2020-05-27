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
        DecimalFormat formata = new DecimalFormat("0.000");
        
        double a, b, c, pi, tri, cir, trap, quadr, ret;
        pi = 3.14159;
        
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        
        tri = a * c / 2;
        cir = pi * c * c;
        trap = (a + b) * c / 2;
        quadr = b * b;
        ret = a * b;
        
        System.out.println("TRIANGULO: " + formata.format(tri));
        System.out.println("CIRCULO: " + formata.format(cir));
        System.out.println("TRAPEZIO: " + formata.format(trap));
        System.out.println("QUADRADO: " + formata.format(quadr));
        System.out.println("RETANGULO: " + formata.format(ret));
        
        
    }
 
}