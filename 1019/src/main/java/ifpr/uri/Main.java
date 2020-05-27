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
        
        int segundos, horas, minutos;
        segundos = teclado.nextInt();
        
        horas = segundos / 3600;
        minutos = (segundos % 3600) / 60;
        segundos = ((segundos % 3600) % 60); 
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
    }
}