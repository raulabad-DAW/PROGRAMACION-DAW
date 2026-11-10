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
                        int numeroAleatori = r.nextInt(1, 21);
                        boolean acertado = false;

                        do {
                            System.out.print("\nIntroduce un valor para adivinar el número (1-20): ");
                            int numUsuari = s.nextInt();
                            s.nextLine();

                            if (numUsuari > numeroAleatori) {
                                System.out.println("El valor que has introducido es mayor que el número.");

                            } else if (numUsuari < numeroAleatori) {
                                System.out.println("El valor que has introducido es menor que el número.");
                            } else {
                                System.out.println("¡Correcto! Has adivinado el número. ");
                                acertado = true;

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

                            if ((numUsuari1 < 0 || numUsuari1 > 100) || (numUsuari2 < 0 || numUsuari2 > 100)) {
                                throw new IllegalArgumentException("Error: número fuera de rango.");
                            } else {
                                int division = numUsuari1 / numUsuari2;
                                System.out.println("El resultado de la división es: " + division);
                            }

                        } catch (ArithmeticException ae) {
                            System.err.println("Error: No puedes dividir un número entre 0.");

                        } catch (InputMismatchException ime) {
                            System.err.println("Error: No puedes introducir una letra.");
                            s.nextLine();
                        } catch (IllegalArgumentException e) {
                            System.err.println(e.getMessage());

                        }

                    }
                    case 3 -> {
                        try {
                            System.out.println("======CREACIÓN DE STRING======");
                            System.out.println("Creando string...");

                            Thread.sleep(3000);

                            String palabra = "";
                            for (int i = 0; i < 5; i++) {
                             Random r = new Random();
                            int numeroAleatori = r.nextInt(97, 123);
                            char letra = (char)numeroAleatori;
                            palabra+=letra;
                            }
                            System.out.println(palabra);
                            
                            System.out.print("Dime una posición del 0 al 4 para mostrar la letra: ");
                            int posicioUsuari = s.nextInt();
                            s.nextLine();

                        } catch (InterruptedException ex) {
                            System.getLogger(ExcepcionsRaulAbad.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                        }

                    }
                    case 4 -> {

                    }
                    case 5 -> {
                        System.out.println("Saliendo del menú...");
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
