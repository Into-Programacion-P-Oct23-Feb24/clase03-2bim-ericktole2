/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
        // Creación de arreglo bidimensionales
        int v;
        // forma 1
        int[][] arreglo1 = new int[3][4]; //
        System.out.printf("Uso de la opción length: %d\n", arreglo1.length);

        System.out.printf("Valor en la posición [0][2]\n", arreglo1[0][2]);

        //arreglo1[0][2] = 1000;
        for (int f= 0; f < arreglo1.length; f++) {
            for (int c = 0; c < arreglo1[f].length; c++) {
                System.out.printf("Ingrese el valor del areglo en la fila "
                        + "%s en la columna %s\n",f,c);
                v = entrada.nextInt();
           if( v >= 10  && v % 2==0){    
               v = 0;
            }
                arreglo1[f][c] = v;
                
                
               
            }
        }

        // .length es el limite de las filas del arreglo        
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                System.out.printf("fila[%d] columna[%d] = %d\n",
                        fila, col, arreglo1[fila][col]);
            }
        }

    }

}
//cuando es par mayor = 10 es 0