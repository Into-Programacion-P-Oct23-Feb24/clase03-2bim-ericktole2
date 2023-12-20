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
        int total ;
        int[][] arreglo = {{10, 41, 40},
        {1, 2, 3},
        {1, 12, 4}};
        // iniciamos el arreglo 
        for (int f = 0; f < arreglo.length; f++) {
            for (int c = 0; c < arreglo[f].length; c++)
            //iniciamos un ciclo for para que pueda recorer las lineas y las 
                //columnas una por una 
            {
                if (arreglo[f][c] <= 10 && arreglo[f][c] % 2 == 0) {
                    // en este if lo que hago es regojer todos los numeros
                    //< = a 10 y pares
                    total = suma + arreglo[f][c];
                    // estos se suman, cada ves se
                    //recorre el arreglo se van sumando los numeros < = a 10 y 
                    //pares
                }
            }

        }
        System.out.println( total );
        // presento la variable suma que es el resultado 
    }
}
