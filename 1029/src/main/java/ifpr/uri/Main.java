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
    public static int conta = 0;
    public static void conta(int n){
        int c1 = 0, c2 = 0;
        for (int j = 1; j < n; j++) {
            conta = c1 + c2 + 2;
            c1 = c2;
            c2 = conta;
        }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formata = new DecimalFormat("0.000");
        
        int teste, n, fibo1, fibo2, fim;
        teste = teclado.nextInt();
        fibo1 = 0;
        fibo2 = 1;
        fim = 0;
        
        for (int i = 0; i < teste; i++) {
            n = teclado.nextInt();
            conta(n);
            for (int j = 1; j < n; j++) {
                fim = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = fim;
            }
            System.out.println("fib(" + n + ") = " + conta + " calls = " + fim );
            fim = 0;
            fibo1 = 0;
            fibo2 = 1;
        }
        
    }
}