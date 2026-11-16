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
public class Arrays {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    public static void main(String[] args) {
        //ARRAYS
        //Si sé los datos que voy a meter en el array:
        int [] arr1 = {2, 5, 3, 6, 9}; //La parte izquierda siempre es igual en ambos casos. 
        System.out.println(arr1[0]);
        System.out.println("Longitud: "+arr1.length); //Ai sabemos la longitud del array sin contarlo a mano. 
        
        //Si no sé los datos que voy a meter en el array, solo la longitud de datos que tendremos:
        int[] arr2 = new int[3];
        arr2[0] = 4; //Asi rellenamos el array.
        
        int[] arr3 = {2, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr3.length; i++) {//Todas las posiciones dentro del array y en programación empiezan en 0, por tanto en este caso tenemos del 0 al 5 en posiciones y por tanto ponemos el menor que (<) ya que no nos interesa la 6 posición ya que ya están incluidos todos mis números hasta la 5.
            System.out.println(arr3[i]);
        }
    }
    
}
