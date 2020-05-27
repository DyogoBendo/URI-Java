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
        int a, b, teste, maior = 1, melhor, resto;
        teste = teclado.nextInt();
        for (int i = 0; i < teste; i++) {
            a = teclado.nextInt();
            b = teclado.nextInt();
            if (a > b) {
                do{
                    resto = a % b;
                    a = b;
                    b = resto;
                }  while(resto != 0);
                maior = a;
            }
            else{
                do{
                    resto = b % a;
                    b = a;
                    a = resto;
                }  while(resto != 0);
                maior = b;
            }
            System.out.println(maior);
        }
        
    }
}