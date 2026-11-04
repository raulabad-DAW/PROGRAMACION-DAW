/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticion;

import java.io.PrintStream;
import java.util.Scanner;

public class Repeticion {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    public static final double PI = 3.1416;

    public static void main(String[] args) {
        //FOR 1
        /*for (int i = 100; i >= 1; i--) {
            System.out.println(i);
            
        }
         */
        Scanner s = new Scanner(System.in);
        /* System.out.println("""
          ===EXPLICACIÓN PROGRAMA====         
                               
Este programa te dirá que indicas un número para iniciar, 
y un número final hasta donde quieres que llegue el recorrido. (Será de uno en uno).)
                                                 
                           """);
        System.out.println("Por qué numero quieres empezar?");
        int numUsuari = s.nextInt();
        s.nextLine();
        System.out.println("Por qué numero quieres acabar?");
        int numUsuari2 = s.nextInt();
        s.nextLine();
        for (int i = numUsuari; i <= numUsuari2; i++) {
            System.out.println(i);
            
        }
         */
        //FOR 3
        /*int contador = 0;
        for (int i = 1; i <=100; i+=2) {
            System.out.println(i);
            contador++;
           
         
            }System.out.println("Hay un total de: "+contador+" números.");
         */
        //FOR4
        /*System.out.println("Introduce un número para mostrar la tabla:");
        int numUsuari = s.nextInt();
        s.nextLine();
        for (int i = 1; i <= 10; i++) {
            int resu=numUsuari*i;
            System.out.println(numUsuari+"x"+i+"= "+resu);
            
            
        }
         */
        //FOR 5
        /*System.out.println("Introduce 5 números:");
        int sumaTotal = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Número "+i+": ");
            int num = s.nextInt();
            s.nextLine();
            sumaTotal+=num;
            
        }
        double mitjana = sumaTotal/5;
        System.out.println("La media es: "+mitjana);
         */
        //FOR 6

        /*for (int i = 1; i <=10; i++) {
            System.out.println("Radio " + i + " -> Àrea");
         */
        //WHILE
        //WHILE 1
        /*int contador = 0;
        while(contador<100){
            System.out.print("-");
            contador++;
         */
        //WHILE 2
        /*System.out.println("Cuantos carácteres - quieres escribir?");
       int contadorUsuari = s.nextInt();
       s.nextLine();
       int contador = 0;
        while(contador<contadorUsuari){
            System.out.print("-");
            contador++;
         */
        //WHILE 3
        /*System.out.println("Escribe un número entero:");
        int numUsuari = s.nextInt();
        s.nextLine();
        
        int contador = 0;
        while(contador<=numUsuari){
            if (contador%3==0 && contador!=0) {
                System.out.println(contador + " Es múltiplo de 3.");
            }else{
                System.out.println(contador);
            }
                
            contador++;
        }
         */
        //WHILE 4
        /*System.out.println("Introduce números enteros. (0 para terminar)");
        int sumaTotal = 0;
        int numUsuari = -1;
        while(numUsuari!=0){
            numUsuari = s.nextInt();
            sumaTotal+=numUsuari;
            
        }
            System.out.println("La suma total es: "+sumaTotal);
         */
        //WHILE 5
        /* System.out.println("Adivina el valor secreto:");
        int valorSecret = 3434;
        int intento = 0;
        while(intento!=valorSecret){
            intento = s.nextInt();
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
        /*System.out.println("Introduce un número real:");
        double numUsuari = -1;
        double mitadNum = 0;
        while(numUsuari!=0){
            numUsuari = sc.nextDouble();
            
        }
         */
 /*
       DO WHILE: DIferencia con el While es que el while pregunta condición, y si no se cumple sale.
       En cambio el do While pregunta al menos una vez e imprime en consola lo que pasa o deja de pasar con
       esa única vez.
         */
 /*
       DoWhile 1: Feu un programa que faci un compte enrere fins a 0. El programa ha
       de demanar a l’usuari un nombre enter positiu on començar.
         */
        
        
       /* System.out.println("Dime un número entero positivo para empezar");
        int numUsuari = s.nextInt();
        s.nextLine();
        do {
            System.out.println(numUsuari);
            numUsuari--;


        } while (numUsuari > 0);
*/
       /*
       DoWhile 2: Realitza un programa que demani una lletra. Si es prem qualsevol
altra tecla que no sigui la “C”, diu “lletra incorrecta” i torna a demanar una lletra.
Quan es prem la tecla “C” el programa diu “gràcies” i acaba
       */
        
        /*char lletra;
        System.out.println("Dime una letra:");
        do {
                
                lletra=s.next().charAt(0);
                if (lletra=='c') {
                    System.out.println("gràcies.");
                
            }else{
                    System.out.println("letra incorrecta.");
                }
          
        } while (lletra!='c');
*/
        /*
        DoWhile 3: Feu un programa que demani números a l’usuari i s’aturi quan el
número introduït sigui negatiu. El programa ha de mostrar quin és el número
més gran que s’ha introduït.
        */
        /*System.out.println("Dime un número:");
        int numUsuari;
        int maxim=Integer.MIN_VALUE;
        do {
            numUsuari = s.nextInt();
            
            if (numUsuari>=0 && numUsuari>maxim) {
                maxim=numUsuari;
            }
            
        } while (numUsuari>=0);
        
        System.out.println("El número más grande es: "+maxim);
        */
        
/*DoWhile4: Fes un programa que demana per teclat un nom d'usuari i després li
demana confirmació. Si l'usuari diu que no, el procés es repeteix des del principi
        */
        /*String nomUsuari;
        char confirmacio;
        do {
            System.out.println("Crea el teu nom d'usuari:");
            nomUsuari = s.nextLine();
            System.out.println("El nom " + nomUsuari + " és correcte? (S/N)");
            confirmacio = s.next().charAt(0);
            s.nextLine();
            if (Character.toUpperCase(confirmacio)=='S') {
                System.out.println("Nom d'usuari creat correctament!");
                
            }
        
        
        }while (Character.toUpperCase(confirmacio)=='N');
*/
        
    }

}
