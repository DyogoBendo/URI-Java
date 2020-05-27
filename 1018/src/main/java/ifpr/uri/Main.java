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
        
        int reais;
        int cem, cinquenta, vinte, dez, cinco, dois, um;
        
        reais = teclado.nextInt();
        cem = reais / 100;
        cinquenta = (reais % 100) / 50;
        vinte = ((reais % 100) % 50) / 20;
        dez = (((reais % 100) % 50) % 20) / 10;
        cinco  = ((((reais % 100) % 50) % 20) % 10) / 5;
        dois = (((((reais % 100) % 50) % 20) % 10) % 5) / 2;
        um = ((((((reais % 100) % 50) % 20) % 10) % 5)% 2);
        
        System.out.println(reais);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");
        
    }
}