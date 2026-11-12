/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionsraulabad;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author r.abad
 */
public class ExcepcionsRaulAbad {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcio = 0;
        do {
            try {

                System.out.println("""
                                                
        Elige una opción. (Solo el número).
                                             
        === MENÚ PRINCIPAL ===
        1. Adivinación
        2. División
        3. Creación de String              
        4. Filas y columnas. 
        5. Salir                                    
         
        Escoge una opción:                        
         """);
                opcio = s.nextInt();
                s.nextLine();
                switch (opcio) {
                    case 1 -> {
                        System.out.println("======ADIVINACIÓN======");
                        Random r = new Random();
                        int numeroAleatori = r.nextInt(1, 21);//Generamos número aleatorio para la adivinación del usuario.
                        boolean acertado = false; //Booleano para definir el bucle, definimos primero un valor inicial.
                        int intentos = 0;//Contador intentos usuario.

                        do {
                            try {
                                System.out.print("\nIntroduce un valor para adivinar el número (1-20): ");
                                int numUsuari = s.nextInt();
                                s.nextLine();
                                intentos++;//Sumamos cada intento dentro del bucle

                                if (numUsuari > numeroAleatori) {
                                    System.out.println("El valor que has introducido es mayor que el número.");

                                } else if (numUsuari < numeroAleatori) {
                                    System.out.println("El valor que has introducido es menor que el número.");
                                } else {
                                    System.out.println("¡Correcto! Has adivinado el número. ");
                                    acertado = true;//Definimos el valor del booleano una vez se acierta el número.
                                    System.out.println("Has hecho " + intentos + " intentos.");

                                }
                            } catch (InputMismatchException ime) {
                                System.err.println("Error: No puedes introducir una letra.");
                                s.nextLine();
                                break;//De esta manera volvemos al menú principal.
                            }
                        } while (!acertado);

                    }
                    case 2 -> {
                        System.out.println("======DIVISIÓN======");
                        try {
                            System.out.println("Te pediré dos numeros enteros (entre 0 y 100) para hacer tu división.");
                            System.out.print("Dime un número: ");
                            int numUsuari1 = s.nextInt();
                            s.nextLine();
                            System.out.print("Ahora dime el otro número: ");
                            int numUsuari2 = s.nextInt();
                            s.nextLine();

                            if ((numUsuari1 < 0 || numUsuari1 > 100) || (numUsuari2 < 0 || numUsuari2 > 100)) {//definimos los rangos para forzar la excepción
                                throw new IllegalArgumentException("Error: número fuera de rango.");//forzamos excepción
                            } else {
                                int division = numUsuari1 / numUsuari2;
                                System.out.println("El resultado de la división es: " + division);
                            }

                        } catch (ArithmeticException ae) {//excepción para la división de un número entre 0.
                            System.err.println("Error: No puedes dividir un número entre 0.");

                        } catch (InputMismatchException ime) {//excepción al introducir una letra en vez de un número
                            System.err.println("Error: No puedes introducir una letra.");
                            s.nextLine();
                        } catch (IllegalArgumentException e) {//forzado de excepción
                            System.err.println(e.getMessage());

                        }

                    }
                    case 3 -> {
                        try {
                            System.out.println("======CREACIÓN DE STRING======");
                            System.out.println("Creando string...");

                            Thread.sleep(3000);//función que nos permite parar el programa en el tiempo deseado, en este caso, 3 segundos (3000 milisegundos).

                            String palabra = "";//preparamos el string para añadirle las letras
                            for (int i = 0; i < 5; i++) {
                                Random r = new Random();
                                int numeroAleatori = r.nextInt(97, 123);//elegimos estos números ya que corresponden a los carácteres ASCII.
                                char letra = (char) numeroAleatori;//transformamos esos carácteres ASCII (números enteros realmente)  a letras oficialmente.
                                palabra += letra;//sumamos las letras de manera que se crea nuestra palabra.
                            }
                            System.out.println(palabra);

                            System.out.print("Dime una posición del 0 al 4 para mostrar la letra: ");
                            int posicioUsuari = s.nextInt();
                            s.nextLine();
                            System.out.println("La letra que escogiste es: " + palabra.charAt(posicioUsuari));

                        } catch (InterruptedException ex) {
                            System.getLogger(ExcepcionsRaulAbad.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);//excepción derivada de la función que nos permite parar el programa.    
                        } catch (StringIndexOutOfBoundsException sioobe) {//excepción derivada de elegir una posición que no corresponde a ninguna letra en la palabra generada.
                            System.err.println("Error: Has introducido una posición fuera de rango.");
                        }catch (InputMismatchException ime) {
                                System.err.println("Error: No puedes introducir una letra.");
                                s.nextLine();
                        }

                    }
                    case 4 -> {
                        try {
                            System.out.println("======FILAS Y COLUMNAS======");
                            System.out.println("Ahora te pediré dos valores enteros, donde cada uno corresponde a las filas y las columnas de un tablero de ajedrez.");
                            System.out.print("Dime el valor entero para las filas: ");
                            String filasUsuari = s.nextLine();
                            System.out.print("\nDime el valor entero para las columnas: ");
                            String columnasUsuari = s.nextLine();
                            int filas = Integer.parseInt(filasUsuari);//Hacemos parseo para transformar String a int y poder operar.
                            int columnas = Integer.parseInt(columnasUsuari);
                            int fichas = filas * columnas;//Una vez transformados, operamos.
                            if (fichas % 2 == 0) {
                                System.out.println("El número de fichas totales es: " + fichas);
                            } else {
                                throw new IllegalArgumentException("Error: el numero total de fichas del tablero no es par.");

                            }
                        } catch (NumberFormatException nfe) {
                            System.err.println("Error: No puedes introducir una letra.");
                        } catch (IllegalArgumentException e) {
                            System.err.println(e.getMessage());

                        }

                    }
                    case 5 -> {
                        System.out.println("Saliendo del menú...");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException ex) {
                            System.getLogger(ExcepcionsRaulAbad.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                        }
                    }

                    default -> {
                        System.out.println("Opción no contemplada.");

                    }

                }
            } catch (InputMismatchException ime) {
                System.err.println("Error: No puedes introducir una letra.");
                s.nextLine();
            }

        } while (opcio != 5);

    }

}
