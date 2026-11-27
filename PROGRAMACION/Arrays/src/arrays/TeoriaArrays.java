/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.io.PrintStream;

/**
 *
 * @author r.abad
 */
public class TeoriaArrays {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {
        //ARRAYS 1 DIMENSION
        //Si sé los datos que voy a meter en el array:
        int[] arr1 = {2, 5, 3, 6, 9}; //La parte izquierda siempre es igual en ambos casos. 
        System.out.println(arr1[0]);
        System.out.println("Longitud: " + arr1.length); //Ai sabemos la longitud del array sin contarlo a mano. 

        //Si no sé los datos que voy a meter en el array, solo la longitud de datos que tendremos:
        int[] arr2 = new int[3];
        arr2[0] = 4; //Asi rellenamos el array.

        int[] arr3 = {2, 5, 6, 7, 8, 9};
       // for (int i = 0; i < arr3.length; i++) {//Todas las posiciones dentro del array y en programación empiezan en 0, por tanto en este caso tenemos del 0 al 5 en posiciones y por tanto ponemos el menor que (<) ya que no nos interesa la 6 posición ya que ya están incluidos todos mis números hasta la 5.
           // System.out.println(arr3[i]); Lo de arriba. Esto es por qué una cosa es el número del array en sí, y otra el indice. Con el <= cogemos el último número del array, que no coincide con el último número de indice ya que el array empieza en 0 aunque su NÚMERO, LONGITUD, empecemos a contarlo en 1. Por eso un array de 4, tiene 0, 1, 2 y 3 números dentro, no 4.

            //ARRAYS 2 DIMENSIONES
            //Se usan 2 for. Donde el bucle de la j hasta que no acaba no aumenta la i. Por tanto, el primer for mira las filas y el segundo for mira las columnas. 
            int[][] arr4 = {{1, 1}, {4, 4}, {3, 3}};
           // int[][] arr5 = new int[3][2]; //Asi se rellena un array de 2 dimensiones. El primer número el número de filas que queremos, y el segundo el número de columnas. 

            for (int i = 0; i < arr4.length; i++) {
                for (int j = 0; j < arr4[i].length; j++) {
                    System.out.print(arr4[i][j] + " ");// esto para que salgan en la misma linea sin el ln, y además el " ". Par a que no salgan en la mismea linea todos juntos. 
                }
                System.out.println("");//Esto para hacer el salto de línea al acabar cada fila. Como el segundo for es el que mira las columnas, al acabar con una, pasa al for de arriba, y por eso ponemos el salto de linea. 
            }

        }
    }


