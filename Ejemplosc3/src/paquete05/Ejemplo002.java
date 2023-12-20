/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        int suma = 0;
       
        int[][] arreglo = {{10, 41, 40},
        {1, 2, 3},
        {1, 12, 4}};
        // iniciamos el arreglo 
        for (int f = 0; f < arreglo.length; f++) {
            for (int c = 0; c < arreglo[f].length; c++) {
                if (f == c) {
                    // si la fila y la columna son iguales estos se suman, 
                    //eso hacer que se sumen todos los numeros de la diagonal 
                 
                    suma = suma + arreglo[f][c];
                    
                }
            }
        }
        System.out.printf("%d",suma);
    }
}
