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
    import java.util.Scanner;

    public class Main {
        public static int verSobrevivente(int pessoas, int salto){
            if (pessoas == 1) {
                return 1;
            }
            else{
                return (verSobrevivente(pessoas - 1, salto) + salto-1) % pessoas + 1;
            }
        }
        public static void main(String args[]) throws IOException {
            Scanner teclado = new Scanner(System.in);
            int salto, pessoas, sobrevive, n;
            n = teclado.nextInt();
            for (int j = 1; j <= n; ++j) {
                pessoas = teclado.nextInt();
                salto = teclado.nextInt();
                sobrevive = verSobrevivente(pessoas, salto);
                System.out.println("Case " + j + ": " + sobrevive);
            }
                
        }
    }