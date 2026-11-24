/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysraulabad;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.abad
 */
public class Exercici1 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] lletra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        System.out.print("DNI o NIE?: ");
        String DNIoNIE = s.nextLine();
        if (DNIoNIE.equalsIgnoreCase("DNI")) {
            System.out.print("Introdueix el teu DNI (sense lletra): ");
        int identifDNI = s.nextInt();
        s.nextLine();
        
          for (int i = 0; i < lletra.length; i++) {
            
            
            
        }
        
        int calculDNI = identifDNI%23;
        }else if (DNIoNIE.equalsIgnoreCase("NIE")){
            System.out.print("Introdueix el teu NIE (sense la lletra del final): ");
            int identifNIE = s.nextInt();
            s.nextLine();
        }
        
        
        
      
        
        
        
    
    }
}
