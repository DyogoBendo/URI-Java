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
    public static void comparar(int n, int d){
        if (n >= 0 && d > 0) {
            if (n > d) {
                    for (int j = 1; j <= d; j++) { 
                        if (n%j == 0 && d % j == 0) {
                            n /= j;
                            d /= j;
                            j = 1;
                        }
                    }
                    System.out.println(n + "/" + d);
                }
                else{
                    for (int j = 1; j <= n; j++) {
                        if (n%j == 0 && d % j == 0) {
                            n /= j;
                            d /= j;
                            j = 1;
                        }
                    }
                    System.out.println(n + "/" + d);
                }
        }
        else if (n < 0 && d > 0) {
            for (int j = 1; j <= d; j++) {
                        if (n%j == 0 && d % j == 0) {
                            n /= j;
                            d /= j;
                            j = 1;
                        }
                    }
                    System.out.println(n + "/" + d);
        }
        else if(n > 0 && d < 0){
            for (int j = 1; j <= n; j++) {
                        if (n%j == 0 && d % j == 0) {
                            n /= j;
                            d /= j;
                            j = 1;
                        }
                    }
                    System.out.println(n + "/" + d);
        }
        else {
            if (n > d) { // 
                    for (int j = d; j <= -1; j++) {
                        if (n%j == 0 && d % j == 0) {
                            n /= j;
                            d /= j;
                            j = d;
                        }
                    }
                    System.out.println(n + "/" + d);
                }
                else{
                    for (int j = n; j <= -1; j++) {
                        if (n%j == 0 && d % j == 0) {
                            n /= j;
                            d /= j;
                            j = n;
                        }
                    }
                    System.out.println(n + "/" + d);
                }
        }

         
        
}
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formata = new DecimalFormat("0.000");
        
        int n1, n2, d1, d2, teste, nf, df;
        String sinal, barra;
        teste = teclado.nextInt();
        for (int i = 0; i < teste; i++) {
            n1 = teclado.nextInt();
            barra = teclado.next();
            d1 = teclado.nextInt();
            sinal = teclado.next();
            n2 = teclado.nextInt();
            barra = teclado.next();
            d2 = teclado.nextInt();
            
            if (sinal.equals("+")) {
                nf = n1 * d2 + n2 * d1;
                df = d1 * d2;
                System.out.print(nf + "/" + df + " = ");
                comparar(nf, df);
            }
            else if(sinal.equals("-")){
                nf = n1 * d2 - n2 * d1;
                df = d1 * d2;
                System.out.print(nf + "/" + df + " = ");
                comparar(nf, df);
            }
            else if(sinal.equals("*")){ 
                nf = n1 * n2;
                df = d1 * d2;
                System.out.print(nf + "/" + df + " = ");
                comparar(nf, df);
            }
            else{
                nf = n1 * d2;
                df = d1 * n2;
                System.out.print(nf + "/" + df + " = ");
                comparar(nf, df);
            }
        }
        
    }
}