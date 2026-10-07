/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

import java.io.PrintStream;

/**
 *
 * @author r.abad
 */
public class Conversiones {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    public static void main(String[] args) {
      /*nt num1 = 4;
      int num2 = 3;
      double res = (double)num1/(double)num2; //se pone el cambio que queremos hacer delante de la variable y lo hace 
        System.out.println("Resultado: "+res);
*/
      int cocheKm = 500;
      int HorasCoche1 = 6;
      int HorasCoche2 = 7;
      double resul1 = (double)cocheKm/(double)HorasCoche1;
      double resul2 = (double)cocheKm/(double)HorasCoche2;

        System.out.println("El coche 1 iba a : "+resul1);
        System.out.println("El coche 2 iba a : "+resul2);

        

      
              
    }
    
}
