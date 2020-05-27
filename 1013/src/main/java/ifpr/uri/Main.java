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
        
        int a, b, c, maior;
        maior = -1;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        if (a > maior) {
            maior = a;
        }
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        System.out.println(maior + " eh o maior");
        
        
    }
 
}