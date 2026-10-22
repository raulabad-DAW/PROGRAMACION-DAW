/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author r.abad
 */
public class While {
    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //WHILE 4
      /*System.out.println("Introduce números enteros (0 para terminar):");
      int sumaTotal = 0;
      int numUsuari = -1;
      
      while(numUsuari!=0){
          numUsuari = sc.nextInt();
          sumaTotal +=numUsuari;
          
      }
        
        System.out.println("La suma total es: "+sumaTotal);
  */
      
      //WHILE 5
      /*System.out.println("Adivina el valor secreto:");
      int valorSecret = 3434;
      int intent = 0;              

     while (intent != valorSecret) {
     intent = sc.nextInt();    
   
}

         System.out.println("¡Correcto! Has adivinado el valor.");
 */
       
        //WHILE 6
        /*System.out.println("Adivina el valor secreto:");
         int valorSecret = 3434;
         int intent = 0;              

         while (intent != valorSecret) {
         intent = sc.nextInt();
             if (intent>3 && intent!= valorSecret) {
                 System.out.println("Incorrecto, has agotado el número de intentos.");
             }
       
}

         System.out.println("¡Correcto! Has adivinado el valor.");
*/
        //WHILE EXTRA
        System.out.println("Dime un número real: (0 para terminar)");
        double numUsuari = -1;
        int  contador = 0;
        while (numUsuari!=0){
            numUsuari = sc.nextDouble();
             if (numUsuari!=0) {
                 double numMitad = (int)numUsuari/2;
                 System.out.println("La mitad de " + numUsuari + " es " + numMitad);
                 contador++;
                 
                 
            
       
            
        }
        }System.out.println("El número que has introducido es 0.");
       
       
        
     
        
    }
    
}
