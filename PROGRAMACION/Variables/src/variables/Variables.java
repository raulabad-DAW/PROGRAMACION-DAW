/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package variables;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Scanner;


/**
 *
 * @author r.abad
 */
public class Variables {
    Scanner s = new Scanner(System.in);
    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    public static void main(String[] args) {
        /*int edad = 18;
        System.out.println("La edad es: " + edad + " years");
        int edadActual = edad + 1;
        System.out.println("Es tu cumple, tienes: "+edadActual);
        double precio = 19.99;
        System.out.println("El precio es: "+precio);
        boolean madrugar = false;
        System.out.println("Madrugar es bueno? "+madrugar);
        char letra = 'A';
        System.out.println(letra);
        int num1 = 2;
        int num2 = 7;
        System.out.println(num1==num2);
        System.out.println(num2 / num1);
*/
        
        //VARIABLES COMPLEJAS: STRING. 
        
        /* 1. String frase1 = "I'm learning Java!";
        System.out.println(frase1.length());
*/
        /*String frase2 = "Java";
        System.out.println(frase2.charAt(0)+" "+frase2.charAt(1)+" "+frase2.charAt(2)+" "+frase2.charAt(3));
*/
        /*String frase3 = "James Gosling created Java";
        System.out.println(frase3.replace(" ", ""));
*/
        /*String frase4 = "www.ceroca.cat";
        System.out.println(frase4.substring(0,6));
        System.out.println(frase4.substring(6,14));
        System.out.println(frase4.substring(0,6)+""+frase4.substring(6,14));
*/
        /*String frase5 = "Estic treballant amb Strings";
        frase5=frase5.toUpperCase();
        System.out.println(frase5.trim());
*/
        /*String frase6 = "Java";
        String ffrase6 = "JavaScript";
        boolean equal = frase6.equals(ffrase6);
        System.out.println(equal);
*/
        /*char letra = 'a';
        char mayuscula = Character.toUpperCase(letra);
        System.out.println(mayuscula); 
*/
        /*String frase8 = "POKEMON";
        System.out.println(frase8);
        System.out.println(frase8.charAt(0)+frase8.charAt(1)+frase8.charAt(2)+frase8.charAt(3)+frase8.charAt(4)+frase8.charAt(5)+frase8.charAt(6));
*/

        /*String princep = "princep"; 
        String principal = "principal";
        String principi = "principi";
        String primer = "primer";
        String pre = "prin";
        System.out.println(princep);
        System.out.println("Contiene prin? "+  princep.contains(pre));
         System.out.println(principal);
        System.out.println("Contiene prin? "+principal.contains(pre));
         System.out.println(principi);
        System.out.println("Contiene prin? "+principi.contains(pre));
         System.out.println(primer);
        System.out.println("Contiene prin? "+primer.contains(pre));
*/
        /*String frase10 = "perixd qtñlk lxd nut+-*xd rw+-*nxd dtñlkrmen t21rwnd21se de lxd rwn21s?";
        System.out.println("Frase cifrada: "+frase10);
        frase10 = frase10.replace("xd", "as");
        frase10 = frase10.replace("+-*", "ri");
        frase10 = frase10.replace("rw", "ma");
        frase10 = frase10.replace("per", "¿Sab");
        frase10 = frase10.replace("tñlk", "ue");
        frase10 = frase10.replace("21", "o");
        System.out.println("Frase descifrada: "+frase10);
*/
        
        //SCANNER 
        
        //ENTRADA 1: 
        /*Scanner s = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = s.nextLine();
        System.out.println("Mi nombre es: "+nombre);
*/
        //ENTRADA 2:
        /*Scanner s = new Scanner(System.in);
        System.out.println("Introduce 5 números enteros:");
        int num1 = s.nextInt();
        s.nextLine();
        int num2 = s.nextInt();
        s.nextLine();
        int num3 = s.nextInt();
        s.nextLine();
        int num4 = s.nextInt();
        s.nextLine();
        int num5 = s.nextInt();
        s.nextLine();
        int suma = num1+num2+num3+num4+num5;
       int mitjana =(double)suma) / (double)5;
       System.out.println("Tus números son: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
       System.out.println("Y la suma de ellos es: "+suma);
        System.out.println("Y la mitjana es: "+mitjana);
*/
      
        //ENTRADA 3:
        /*Scanner s = new Scanner(System.in);
        System.out.println("Dime la base de un triangulo:");
        double base = s.nextDouble();
        s,nextLine();
        System.out.println("Dime la altura de un triangulo:");
        double altura = s.nextDouble();
        s,nextLine();
        double area = (base*altura)/2;
        System.out.println("La base de tu triangulo es: "+base);
        System.out.println("La altura de tu triangulo es: "+altura);
        System.out.println("Y el area es: "+area);
*/
        //ENTRADA 4:
        /*Scanner s = new Scanner(System.in);
        System.out.println("Dime una palabra:");
        String palabra = s.nextLine();
        System.out.println("Tu palabra es: "+palabra);
        System.out.println("Y tiene: " + palabra.length() + " letras");
*/
        //ENTRADA 5:
        /*Scanner s = new Scanner(System.in);
        System.out.println("Dime una palabra:");
        String palabra = s.nextLine();
        String contrasenya = "java123";
        boolean coincide = palabra.equals(contrasenya);
        System.out.println("La contraseña es: "+contrasenya);
        System.out.println("¿La palabra es igual?: "+coincide);
*/
        //ENTRADA 6:
        /*Scanner s = new Scanner(System.in);
        System.out.println("Dime tu edad:");
        int edad = s.nextInt();
        s.nextLine();
        int anyActual = LocalDate.now().getYear();
        int birth = anyActual-edad;
        System.out.println("Tu edad es: "+edad);
        System.out.println("Tu año de nacimiento es: "+birth);
*/
        
        
        
        

        
        
        
        
        
        

        
        
        
        
            
        
       
        
        

    }
    
    
 
}
