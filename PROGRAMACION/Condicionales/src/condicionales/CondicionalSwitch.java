/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.abad
 */
public class CondicionalSwitch {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {

        //SWITCH 1
        /*  Scanner s = new Scanner(System.in);
        System.out.println("Dime un día de la semana (1-7)");
        int diaSem = s.nextInt();
        s.nextLine();
        switch (diaSem) {
            case 1, 2, 3, 4, 5 -> System.out.println("Dia laborable");
            case 6, 7 -> System.out.println("Dia no laborable");      
            default -> {
                System.out.println("Selección incorrecta");
            }
                
 }    
         */
        //SWITCH 2
        /*Scanner s = new Scanner(System.in);
        System.out.println("Dime un número del 1 al 12:");
        int numMes = s.nextInt();
        s.nextLine();
        switch (numMes) {
            case 1 -> {
                System.out.println("Enero");
            }
            case 2 -> {
                System.out.println("Febrero");
            }
            case 3 -> {
                System.out.println("Marzo");
            }
            case 4 -> {
                System.out.println("Abril");
            }
            case 5 -> {
                System.out.println("Mayo");
            }
            case 6 -> {
                System.out.println("Junio");
            }
            case 7 -> {
                System.out.println("Julio");
            }
            case 8 -> {
                System.out.println("Agosto");
            }
            case 9 -> {
                System.out.println("Septiembre");
            }
            case 10 -> {
                System.out.println("Octubre");
            }
            case 11 -> {
                System.out.println("Noviembre");
            }
            case 12 -> {
                System.out.println("Diciembre");
            }
            default -> {
                System.out.println("Selección incorrecta.");

            }

        }
         */
        //SWITCH 3
        /*Scanner s = new Scanner(System.in);
        System.out.println("Escoge una opción:");
        System.out.println("Infantil: de 3 a 5 anys");
        System.out.println("Primària: de 6 a 11 anys");
        System.out.println("Secundària: de 12 a 16 anys");
        int opcio = s.nextInt();
        s.nextLine();
        switch (opcio) {
            case 3, 4, 5 ->
                System.out.println("Infantil.");
            case 6, 7, 8, 9, 10, 11 ->
                System.out.println("Primària.");
            case 12, 13, 14, 15, 16 ->
                System.out.println("Secundària.");

            default -> {
                System.out.println("Opció no contemplada.");

            }

        }
*/
        //SWITCH EXTRA
        /*Scanner s = new Scanner(System.in);
        System.out.println("Introduce una opción:");
        System.out.println("1. Passar de metres a peus ");
        System.out.println("2. Passar de peus a metres ");
        System.out.println("3. Passar de metres a polzades");
        System.out.println("4. Passar de polzades a metres");
        System.out.println("5. Sortir");
        int opcio = s.nextInt();
        s.nextLine();
        
        switch (opcio) {
            case 1 -> {
                System.out.println("Dime un dato en metros:");
                double metros = s.nextDouble();
                s.nextLine();
                
                double pies = metros/0.3048;
                System.out.println("El resultado es: "+pies+" ft");
                  
            }
            case 2 ->{
                System.out.println("Dime un dato en pies:");
                double pies = s.nextDouble();
                s.nextLine();
                
                double metros = pies*0.3048;
                System.out.println("El resultado es: "+metros+" m");
                  
                
            }
            case 3-> {
                System.out.println("Dime un dato en metros:");
                double metros = s.nextDouble();
                s.nextLine();
                
                double pulgadas = metros/0.0254;
                System.out.println("El resultado es: "+pulgadas+" in");
            }
            case 4 -> {
                System.out.println("Dime un dato en pulgadas:");
                double pulgadas = s.nextDouble();
                s.nextLine();
                
                double metros = pulgadas*0.0254;
                System.out.println("El resultado es: "+metros+" m");
            }
            case 5-> {
                System.out.println("Saliendo del sistema...");
            }
                
           
            default->{
                System.out.println("Opción no contemplada.");
                
            }
                
        }
*/
        
        

    }
}
