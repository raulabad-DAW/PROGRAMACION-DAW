/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author r.abad
 */
public class EjerciciosArrays {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
        Uni1: Crea un array de 5 posicions amb les següents temperatures: 10.5, 12.3,
18.4, 22.3, 17.5. Mostra les posicions 1 i 4. Després, demana a l'usuari una
posició i mostra el valor que hi ha en aquella posició determinada
         */
 /*double[] arr = {10.5, 12.3, 18.4, 22.3, 17.5};
        System.out.println("Posición 1: " + arr[1]);
        System.out.println("Posición 2: " + arr[4]);
        System.out.print("Dime una posición (del 0 al 4): ");
        int posicio = s.nextInt();
        s.nextLine();
        
       for (int i = 0; i < arr.length; i++) {
            if (posicio==i) {
                System.out.println(arr[i]);
            }
        }
         */

 /*
        Uni2: Donat aquest array, segueix els següents passos: Primer, mostra l’array,
Després demana un número a l’usuari per teclat. Compta quants números com
el que t’ha dit l’usuari hi ha a l’array
         */
 /* int[] valors = {45, 23, 67, 12, 89, 72, 39, 19, 89, 23, 13, 89};
        for (int i = 0; i < valors.length; i++) {
            System.out.println(valors[i]);
        }
        
        System.out.print("Dime un número: ");
        int numUsuario = s.nextInt();
        s.nextLine();
        int contador = 0;
        for (int i = 0; i < valors.length; i++) {
            if (numUsuario==valors[i]) {
                contador++;
            }
            
        }
        System.out.println("Hay "+contador+" números como el tuyo dentro del array.");
         */
 /*
       Uni3: Declara el següent array que seran les notes de 12 alumnes. El programa
mostrarà la mitjana aritmètica de les qualificacions. 
         */
 /*double[] arrayNotes = {3, 5.5, 2, 10, 4.9, 8, 8.5, 7, 6.6, 0.25, 9, 7};
        double suma = 0;
        for (int i = 0; i < arrayNotes.length; i++) {
            suma += arrayNotes[i];
        }
        double mitjana = suma / arrayNotes.length;
        System.out.println("La media aritmetica es: "+mitjana);
         */
 /*
        Uni4: Modifiqueu el programa anterior perquè mostri la nota màxima i mínima
         */
 /*double[] arrayNotes = {3, 5.5, 2, 10, 4.9, 8, 8.5, 7, 6.6, 0.25, 9, 7};
        double suma = 0;
        double max = arrayNotes[0];
        double min = arrayNotes[0];
        for (int i = 0; i < arrayNotes.length; i++) {
            suma += arrayNotes[i];

            if (arrayNotes[i] > max) {
                max = arrayNotes[i];
            }
            if (arrayNotes[i] < min) {
                min = arrayNotes[i];
            }
        }
        double mitjana = suma / arrayNotes.length;

        System.out.println("La media aritmetica es: " + mitjana);
        System.out.println("Nota máxima: " + max);
        System.out.println("Nota mínima: " + min);
         */
 /*
        Uni5: Fer un programa amb el següent algorisme:
1. Crea un array de 20 posicions.
2. Posa en la primera posició un 1.
3. Omple la resta de posicions amb el doble de l’anterior posició. Necessitaràs
un for.
4. Mostra l’array
         */
 /*int[] numeros = new int[20];
        numeros[0] = 1;

        for (int i = 1; i < numeros.length; i++) {
            numeros[i] = numeros[i - 1] * 2;
        }

        for (int i = 0; i < numeros.length; i++) {
            if (i==numeros.length-1) {
                System.out.println(numeros[i]);
            }else{
                System.out.print(numeros[i] +", ");
            }
            
            
        }
        System.out.println();
         */
 /*
        Uni6: Modifiqueu el programa de les notes (Uni3) per a què permeti saber si
algú ha tret una nota concreta. Haurà de preguntar notes a l’usuari fins que
aquest introdueixi un -1.
Nota a cercar: 5
> Hi és
Nota a cercar: 8,1
> No hi és
         */
 /* double[] arrayNotes = {3, 5.5, 2, 10, 4.9, 8, 8.5, 7, 6.6, 0.25, 9, 7};

// La suma se calcula una sola vez, antes de preguntar
        double suma = 0;
        for (int i = 0; i < arrayNotes.length; i++) {
            suma += arrayNotes[i];
        }

        double cerca;
        do {
            System.out.print("Nota a cercar (-1 per acabar): ");
            cerca = s.nextDouble();
            s.nextLine();

            if (cerca != -1) {
                boolean trobada = false;

                for (int i = 0; i < arrayNotes.length; i++) {
                    if (cerca == arrayNotes[i]) {
                        trobada = true;
                    }
                }

                if (trobada) {
                    System.out.println("Hi és");
                } else {
                    System.out.println("No hi és");
                }
            }
        } while (cerca != -1);

        double mitjana = suma / arrayNotes.length;
        System.out.println("La media aritmetica es: " + mitjana);
         */
        //ORDENAR ARRAYS
        /*
       Uni7: En la següent llista tenim les marques del 100m llisos dels últims jocs
olímpics, ordenats pel carril on sortia el corredor.
       
10.01, 9.95, 9.93, 9.80, 9.89, 9.84, 9.98
       
Crea un array amb les dades anteriors sense canviar l’ordre que hi ha a dalt,
després ordena’l amb la funció sort i mostra les marques de més baixa a més alta.
Torna’l a mostrar, però ara de més alta a més baixa.
         */
        /*double[] marcas = {10.01, 9.95, 9.93, 9.80, 9.89, 9.84, 9.98};
        Arrays.sort(marcas);
        for (int i = 0; i < marcas.length; i++) {
            System.out.print(marcas[i] + " ");

        }
        System.out.println();

        for (int i = marcas.length - 1; i >= 0; i--) {
            System.out.print(marcas[i] + " ");
        }
        System.out.println();
        */
        
        /*
        Uni8: Crea un array següent amb les puntuacions de 6 jugadors: 120, 450, 80,
920, 310, 600. Ordena'ls amb Arrays.sort() i mostra el rànquing de major a
menor puntuació .
        */
        
        //int[][] bidi = {{9,4,9,5}, //Por ejemplo este array es 3x4. Pero sus valores en filas realmente donde hay número es de 2 (0, 1, 2) y columnas hay 4 pero son (0, 1, 2, 3).
             //             {7,2,4,2},
               //           {3,8,0,6}};
        
        /*
        Multi1: mostra l'element situat en última posició. Posa les posicions a mà
        */
       // System.out.println(bidi[2][3]);
       
       /*
        Multi2: mostra tots els elements de la segona fila.
       */
       
           /* for (int j = 0; j < bidi[1].length; j++) {//aqui si ponemos solo bidi.length nos dice las filas que hay en todo el array. Es decir, 3. No nos dice la longitud de una fila especifica, por eso tenemos que ponersela. 
                System.out.print(bidi[1][j]+ " ");//igual aqui abajo, tenemos que especificar la fila primero y luego la j la recorre gracias mismo for ya que j son columnas. 
            }
*/
           
           /*
            Multi3: suma tots els elements del array.
           */
          /* int suma = 0;
           for (int i = 0; i < bidi.length; i++) {
               for (int j = 0; j < bidi[i].length; j++) {
                   suma+=bidi[i][j];
                   System.out.print(bidi[i][j]+" ");
               }
               System.out.println("");
        }
           System.out.println("La suma de todos es: "+suma);
*/
          /*
          Multi4: mostra la mitjana dels valors.
          */
          /* int suma = 0;
           int contador = 0;
           for (int i = 0; i < bidi.length; i++) {
               for (int j = 0; j < bidi[i].length; j++) {
                   suma+=bidi[i][j];
                   contador++;
                   System.out.print(bidi[i][j]+" ");
               }
               System.out.println("");
        }
           double media = (double)suma/contador;
           System.out.println("La media de todos es: "+media);
*/
          
          char[][] lletres = {{'a','c','e'},
                                     {'a','z','a'},
                                     {'l','c','z'},
                                     {'p','s','a'}};
          
          /*
          Multi5: Fes que, donada una posició concreta introduïda per l’usuari (hauràs de
demanar dos valors: la fila i la columna), es pugui canviar la lletra d’aquella
posició. Mostra l’array abans i després del canvi.
          */
          System.out.println("Te pediré dos valores; uno para filas y otro para columnas.");
          System.out.print("Dime el valor para la fila (entre 0 y 3)");
          int filaUsuario = s.nextInt();
          s.nextLine();
          System.out.print("Dime el valor para la columna (entre 0 y 2)");
          int columnaUsuario = s.nextInt();
          s.nextLine();
          
          System.out.println("Asi se ve antes del cambio:");
          for (int i = 0; i < lletres.length; i++) {
              for (int j = 0; j < lletres[i].length; j++) {
                  System.out.print(lletres[i][j]+ " ");
              }
              System.out.println("");
        }
          System.out.print("Ahora dime por qué letra quieres cambiar la posición que has escogido: ");
          char letraUsuario = s.next().charAt(0);
          s.nextLine();
          
           System.out.println("Así se ve después del cambio:");
          
            for (int i = 0; i < lletres.length; i++) {
              for (int j = 0; j < lletres[i].length; j++) {
                  letraUsuario = lletres[filaUsuario][columnaUsuario];
                  System.out.print(lletres[i][j]+ " ");
              }
              System.out.println("");
        }
         
            
        
        

    }

}
