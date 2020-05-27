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
        
        int horas, velocidade, distancia;
        double litros;
        
        horas = teclado.nextInt();
        velocidade = teclado.nextInt();
        
        distancia = horas * velocidade;
        litros = distancia / 12.0;
        
        System.out.println(formata.format(litros));
    }
}