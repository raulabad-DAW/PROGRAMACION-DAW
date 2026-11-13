/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenraulabad;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author r.abad
 */
public class ExamenRaulAbad {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    public static final char E = 'E';

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println();
                System.out.println("===== MENU =====");
                System.out.println("1. Tipos de comida");
                System.out.println("2. Múltiplos");
                System.out.println("3. Vocales");
                System.out.println("4. Salir");
                System.out.print("Elige una opcion: ");

                opcion = s.nextInt();
                s.nextLine();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("===== TIPOS DE COMIDA =====");

                        try {
                            char opcio = 0;

                            System.out.println("""
                                               
        Elige una opción. (Solo la letra).
                                             
        === MENÚ PRINCIPAL ===
        x. Pizza
        y. Ensalada
        z. Sushi              
        
                                           
         
        Escoge una opción:                        
         """);
                            opcio = Character.toLowerCase(s.next().charAt(0));

                            switch (opcio) {

                                case 'x' -> {
                                    System.out.println("PIZZA");
                                    System.out.print("Has encargado pizza.");

                                }
                                case 'y' -> {
                                    System.out.println("ENSALADA");
                                    System.out.print("Has encargado ensalada. ");

                                }
                                case 'z' -> {
                                    System.out.println("SUSHI");
                                    System.out.print("Has encargado Sushi. ");

                                }

                                default -> {
                                    throw new IllegalArgumentException("Error: Opción no válida.");

                                }

                            }
                        } catch (IllegalArgumentException e) {
                            System.err.println(e.getMessage());

                        }

                    }
                    case 2 -> {
                        System.out.println("===== MULTIPLOS=====");
                        int multiplos = 0;
                        boolean esMultiplo = false;
                        try {
                            do {

                                System.out.print("Introduce un número: ");
                                int numUsuario = s.nextInt();
                                s.nextLine();

                                if (numUsuario > 0) {
                                    for (int i = 1; i <= numUsuario; i++) {
                                        if (i % 4 == 0) {
                                            System.out.println(i + " ");
                                            multiplos++;
                                            esMultiplo = true;
                                        }

                                    }
                                    System.out.println("Hay " + multiplos + " multiplos de " + numUsuario);

                                } else {
                                    throw new IllegalArgumentException("Error: No puedes introducir números negativos.");

                                }

                            } while (esMultiplo == false);
                        } catch (InputMismatchException e) {
                            System.err.println("Error: no puedes introducir letras.");
                            s.nextLine();
                        } catch (IllegalArgumentException e) {
                            System.err.println(e.getMessage());

                        }

                    }
                    case 3 -> {
                        try {
                            System.out.println("===== VOCALES=====");
                            int intentos = 4;
                            boolean acertado = false;

                            while (intentos > 0 && !acertado) {
                                System.out.println("Introduce letras para adivinar: ");
                                System.out.print(" (intentos: " + intentos + "): ");
                                char letra = Character.toUpperCase(s.next().charAt(0));
                                s.nextLine();
                                if (Character.isLetter(letra)) {

                                    if (letra == E) {
                                        acertado = true;
                                        System.out.println("Correcto!");
                                    } else {
                                        intentos--;
                                        if (intentos > 0) {
                                            System.out.println("Incorrecto. Te quedan " + intentos + " intentos");
                                        }
                                    }
                                } else {
                                    throw new IllegalArgumentException("Error: Solo puedes introducir letras.");
                                }
                            }

                            if (!acertado) {
                                System.out.println("Has agotado los intentos. La letra és " + E);
                            }
                        } catch (IllegalArgumentException e) {
                            System.err.println(e.getMessage());

                        }
                    }

                    case 4 -> {
                        System.out.println("Saliendo del programa...");
                    }
                    default ->
                        System.out.println("Error: opcion no valida (elige de 1 a 4)");
                }

            } catch (InputMismatchException e) {
                System.err.println("Error: no puedes introducir letras.");
                s.nextLine();
                opcion = 0;
            }

        } while (opcion != 4);

        s.close();

    }

}
