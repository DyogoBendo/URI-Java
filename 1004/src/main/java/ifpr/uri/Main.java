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
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int a, b, prod;
        a = teclado.nextInt();
        b = teclado.nextInt();
        prod = a * b;
        System.out.println("PROD = " + prod);
    }
 
}