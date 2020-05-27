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
        
        double real, valor1;
        int cem, cinquenta, vinte, dez, cinco, dois, um, o50, o25, o10, o5, o1, reais, valor;
        int resto1, resto2, resto3, resto4, resto5, restor1, restor2, restor3, restor4;
        real = teclado.nextDouble();
        reais = (int) real;
        valor1 = (real - reais) * 100; 
        valor = (int)valor1;
    
        cem = reais / 100;
        resto1 = (reais % 100);
        
        cinquenta = resto1 / 50;
        resto2 = resto1 % 50;
        
        vinte =  resto2 / 20;
        resto3 = resto2 % 20;
        
        dez = resto3 / 10;
        resto4 = resto3 % 10; 
        
        cinco  = resto4 / 5;
        resto5 = resto4 % 5;
        
        dois = resto5 / 2;
        um = resto5 % 2;
        
        o50  = valor / 50;
        restor1 = valor % 50;
        
        o25 = restor1 / 25;
        restor2 = restor1 %25;
        
        o10 =  restor2 / 10;
        restor3 = restor2 % 10;
        
        o5  = restor3 / 5;
        restor4 = restor3 % 5;
        
        o1 = restor4;
        
        
        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinquenta + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println(dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(um + " moeda(s) de R$ 1.00");
        System.out.println(o50 + " moeda(s) de R$ 0.50");
        System.out.println(o25 + " moeda(s) de R$ 0.25");
        System.out.println(o10 + " moeda(s) de R$ 0.10");
        System.out.println(o5 + " moeda(s) de R$ 0.05");
        System.out.println(o1 + " moeda(s) de R$ 0.01");
        
    }
}   