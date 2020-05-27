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
    import java.util.Arrays;
    import java.util.Scanner;

    public class Main {
         public static void sortbyColumn(int[][] arr, int col) 
    {
        Arrays.sort(arr, (final int[] entry1, final int[] entry2) -> {
            if (entry1[col] > entry2[col])
                return 1; 
            else
                return -1; 
        });  
    } 

        public static void main(String args[]) throws IOException {
            Scanner teclado = new Scanner(System.in);
            int x, y;
            while(teclado.hasNext()){
                ArrayList<Integer> t = new ArrayList<>();
                ArrayList<Integer> b = new ArrayList<>();
                int n = teclado.nextInt();
                int xy[][] = new int[n][2];
                
                for (int i = 0; i < n; i ++) {
                    x = teclado.nextInt();
                    y = teclado.nextInt();
                    xy[i][0] = x;
                    xy[i][1] = y;
                }
                sortbyColumn(xy, 0);
                
                t.add(1);
                b.add(1);
                
                for (int i = 1; i < n; i++) {
                    int maxtop = 1;
                    int maxbot = 1;
                    
                    for (int j = 0; j < i; j++) {
                        if (xy[i][0] > xy[j][0] && xy[i][1] == xy[j][1] + 2) {
                            maxtop = Math.max(maxtop, b.get(j) + 1);
                        }
                        if (xy[i][0] > xy[j][0] && xy[i][1] == xy[j][1] - 2) {
                            maxbot = Math.max(maxbot, t.get(j) + 1);
                        }
                    }
                  
                    t.add(maxtop);
                    b.add(maxbot);
                }
                int maximo = 1;
                for (int i = 0; i < n; i++) {
                    maximo = Math.max(maximo, t.get(i));
                    maximo = Math.max(maximo, b.get(i));
                }
                
                System.out.println(maximo);
                
            }
        }
    }