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
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formata = new DecimalFormat("0.000");
        
        int n1, q1, teste, pos, contador = 0;
        
        
        do {
            contador ++;
            
            n1 = teclado.nextInt();
            q1 = teclado.nextInt();
            if (q1 == 0 && n1 == 0) {
                break;
            }
            int n[] = new int [n1];
            
            
            for (int i = 0; i < n1; i++) {
                n[i] = teclado.nextInt();
            }
            
            int q[] = new int [q1];
            for (int i = 0; i < q1; i++) {
                teste = teclado.nextInt();
                q[i] = teste;
            }
            Arrays.sort(n);
               System.out.println("CASE# " + contador + ":");
               for (int i = 0; i < q.length; i++) {
                if (Arrays.binarySearch(n, q[i]) >= 0) {
                    for (int j = 0; j < n.length; j++) {
                        if (n[j] == q[i]) {
                            System.out.println(q[i] + " found at " + (j + 1));
                            break;
                        }
                    }
                }
                else{
                    System.out.println(q[i] + " not found");
                }
            } 
               
            
        } while (n1 != 0 && q1 != 0);
        
    }
}