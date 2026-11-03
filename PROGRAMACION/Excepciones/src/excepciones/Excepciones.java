/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author r.abad
 */
public class Excepciones {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
   
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        try {
            System.out.println("Introduce un número:");
            int numUsuari = s.nextInt();
            s.nextLine();
            System.out.println("Has introducido el número " + numUsuari);
        }catch(InputMismatchException ime){
            System.out.println("No puedes introducir letras.");
        }
*/
        Scanner s = new Scanner(System.in);
        //EXCEPCION 1
        /*try{
        System.out.print("Introduce un número: ");
        String numUsuario = s.nextLine();
        int n = Integer.parseInt(TextUsuario); 
        System.out.println("El número es "+numUsuario);
        }catch(NumberFormatException nfe){
                    System.out.println("No puedes introducir una letra.");
            }
*/
        //EXCEPCION 2
        /*try{
        System.out.print("Dime la cantidad total de caramelos que tienes: ");
        int caramelosUsuario = s.nextInt();
        s.nextLine();
        System.out.print("Entre cuantos amigos los quieres repartir? ");
        int amigos = s.nextInt();
        s.nextLine();
        int divisionCaramelos = (caramelosUsuario/amigos);
        System.out.println("\nA cada amigo le tocarán "+divisionCaramelos+" caramelos");
        }catch(InputMismatchException |ArithmeticException ime){
            System.err.println("\nError!");
        }
*/
        
        
        
        
       
        
               
    }
    
}
