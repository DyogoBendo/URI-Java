/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpr.uri;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Dyogo
 */
public class Main {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void prever(){
        teclado.useLocale(Locale.ENGLISH);
        int pa, pb, anos = 0;
        double g1, g2;
        
        pa = teclado.nextInt();
        pb = teclado.nextInt();
        
        g1 = teclado.nextDouble();
        g2 = teclado.nextDouble();
        
        while(pa <= pb && anos <= 100){
            double pop1, pop2;
            pop1 = Math.floor(pa + (g1 * pa / 100));
            pop2 = Math.floor(pb + (g2 * pb / 100));
            
            pa = (int) pop1;
            pb = (int) pop2;
            anos ++;
        }
        if(anos > 100){
            System.out.println("Mais de 1 seculo.");
        } else{
            System.out.println(anos + " anos.");
        }
    }
        

    public static void main(String[] args) {
        int t;

        t = teclado.nextInt();
        for (int i = 0; i < t; i++) {
            prever();
        }
    }

}
