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
public class Condicionales {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    public static void main(String[] args) {
        //ESTRUCTURA IF 
        //IF 1
        /*Scanner s = new Scanner(System.in);
        System.out.println("Dime un número:");
        int num1 = s.nextInt();
        s.nextLine();
        System.out.println("Dime otro número:");
        int num2 = s.nextInt();
        s.nextLine();
        if (num1==num2) {
            System.out.println("Son iguales.");
            
        }System.out.println("No son iguales.");
*/
        //IF 2
        /*Scanner s = new Scanner(System.in);
        System.out.println("Dime un número:");
        int num1 = s.nextInt();
        s.nextLine();
        if (num1 % 10 ==0) {
            System.out.println("Es múltiplo de 10;");
            
        }else  {
            System.out.println("No es múltiplo de 10.");
            
 }
 /*
        
        */
        //if 3 
        /*Scanner s = new Scanner(System.in);
        System.out.println("Dime un número:");
        int num1 = s.nextInt();
        s.nextLine();
        if (num1 >= 50 && num1 <= 100) {
            System.out.println("El número está dentro del rango");
            
        }else{
            System.out.println("No está. ");
       
        }
*/
        //IF 4
        Scanner s = new Scanner(System.in);
        System.out.println("Dime un número:");
        int num1 = s.nextInt();
        s.nextLine();
        System.out.println("Dime otro número:");
        int num2 = s.nextInt();
        s.nextLine();
        if (num1==num2) {
            System.out.println("Son iguales");
            
        }else   {
            
        }
        
    }

        
    
}
