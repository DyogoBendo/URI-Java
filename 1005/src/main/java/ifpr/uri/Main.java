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
        DecimalFormat formata = new DecimalFormat("0.00000");
        double a, b, media;
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        media = (a * 3.5 +  7.5 * b) / 11;
        System.out.println("MEDIA = " + formata.format(media));
    }
 
}