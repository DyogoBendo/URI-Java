/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpr.uri;

import java.util.Scanner;

/**
 *
 * @author Dyogo
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, menor = Integer.MAX_VALUE, posicao = 0;
        n = teclado.nextInt();
        int x[] = new int [n];
        
        for (int i = 0; i < n; i++) {
            x[i] = teclado.nextInt();
            if(x[i] < menor ){
                menor = x[i];
                posicao = i;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
    }
    
}
