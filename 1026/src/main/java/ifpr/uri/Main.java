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
        
        long a, b, c;
        
        while(teclado.hasNext()) {
            a = teclado.nextLong();
            b = teclado.nextLong();
            c = a ^ b;
            System.out.println(c);
            
        } 
    }
}