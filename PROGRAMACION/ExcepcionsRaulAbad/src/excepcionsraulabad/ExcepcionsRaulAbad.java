/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionsraulabad;

import java.io.PrintStream;
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
        try{
             int opcio;
        do {
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
                case 1 ->{
                    
                }
                case 2 ->{
                    
                }
                case 3 ->{
                    
                }
                case 4 ->{
                    
                }
            
                
            default -> {
                    System.out.println("Opción no contemplada.");

                }
                
            }
                
        }catch(){
            
        }
    }
    
}
