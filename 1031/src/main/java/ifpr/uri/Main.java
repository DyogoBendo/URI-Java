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
    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {

        public static void main(String args[]) throws IOException {
            Scanner teclado = new Scanner(System.in);
            ArrayList <Integer> antigos = new ArrayList<>();
            int teste;
            do {
                int salto = 0, valor = 1;
                teste = teclado.nextInt();
                if (teste <= 0) {
                    break;
                }
                ArrayList <Integer> valores = new ArrayList<>();
                for (int i = 1; i <= teste; i++) {
                    valores.add(i);
                }
                antigos.clear();
                antigos.add(1);
               while(antigos.get(antigos.size() - 1) != 13){
                    salto ++;
                    valor = 1;
                    do {
                    for (int k = 0, j = 1; k < salto; k++) {
                        valor += j;
                        if (valor > valores.size()) {
                            valor -= valores.size();
                        }
                        while(antigos.contains(valor)){
                            valor ++;
                            if (valor > valores.size()) {
                            valor -= valores.size();
                        }
                        }     
                    }
                    antigos.add(valor);
                } while (antigos.size() < valores.size());
                    if (antigos.get(antigos.size() - 1) == 13) {
                       break;
                   }
                    antigos.clear();
                    antigos.add(1);
                }
               System.out.println(salto);
            } while (teste != 0);
            
        }
    }