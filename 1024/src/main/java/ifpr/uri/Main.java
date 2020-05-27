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
    
    
    public static void aumentar(char c[]){
        int posicao = 0;
        char d[];
        d = c;
        for (int i = 0; i < c.length; i++) {
                    posicao = c[i] + 3;
                    if (c[i] >= 65 && c[i] <= 122) {
                        c[i] = (char) posicao;
                    }
            }
        inverter(c);
    }
    
    public static void inverter(char c[]){
        String d = "";
        for (int j = c.length - 1; j >= 0; j --) {
                d += c[j];
        }
        
        voltar_metade(d.toCharArray());
    }
    public static void voltar_metade(char c[]){
        int posicao = 0;
         for (int i = 0; i < c.length; i++) {
                posicao = c[i] - 1;
                if (i > c.length/2 - 1) {
                 c[i] = (char) posicao;
             }
            }
         mostrar(c);
    }
    public static void mostrar(char[] c){
        System.out.println(c);
    }
    
    public static void define(String texto){
        
        aumentar (texto.toCharArray());
    }
            
 
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formata = new DecimalFormat("0.000");
        
        String texto; 
        int teste;
        teste = Integer.parseInt(teclado.nextLine());
        
        for (int j = 0; j < teste; j++) {
            texto = teclado.nextLine();
            define(texto);
        } 
        
    }
}