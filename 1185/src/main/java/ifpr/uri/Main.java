/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpr.uri;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dyogo
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        DecimalFormat formata = new DecimalFormat("0.0");
        
        char o;
        double m[][] = new double [12][12];
        ArrayList<Double> valores = new ArrayList<>();
        double resultado = 0;
        
        o = teclado.next().toCharArray()[0];
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = teclado.nextDouble();
                if(i + j < 11){
                    valores.add(m[i][j]);
                }
            }
        }
        for (int i = 0; i < valores.size(); i++) {
                resultado += valores.get(i);
            }
        if(o == 'M'){
            resultado /= valores.size();
        }
        
        System.out.println(formata.format(resultado));
        
        
    }
}
