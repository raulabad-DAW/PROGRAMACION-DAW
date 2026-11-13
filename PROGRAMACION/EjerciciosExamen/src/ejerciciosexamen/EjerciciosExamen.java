/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosexamen;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class EjerciciosExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        /*
        1. Mostra un menú amb les opcions en String «Arxiu», «Buscar» i «Esborrar». En cas que no
s'introdueixi una opció correcta es notificarà per pantalla. Fes-ho amb un if.
         */
        Scanner s = new Scanner(System.in);
        /*System.out.println("""
                                               
        Elige una opción. 
                                             
        === MENÚ PRINCIPAL ===
        Arxiu
        Buscar
        Esborrar             
                               
         """);
         
         String opcioUsuario = s.nextLine();
         if (opcioUsuario.equalsIgnoreCase("arxiu")) {
             System.out.println("Empezando la creación del archivo...");
             Thread.sleep(3000);    
        }else if (opcioUsuario.equalsIgnoreCase("buscar")){
            System.out.println("Buscando el archivo...");
        }else if (opcioUsuario.equalsIgnoreCase("esborrar")){
            System.out.println("Borrando el archivo...");
        }else{
             System.out.println("No has introducido la opción correcta.");
        }
         */
 /*
         2. Demana una lletra a l’usuari i mostra si és una vocal. Captura l’error si introdueixen una cosa
que no és una lletra i mostra el missatge. Per comprovar si un char és una lletra es pot utilitzar
la funció Character.isLetter(lletra).
         */
 /*try {
            System.out.print("Dime una letra: ");
            char usuarioLetra = s.next().charAt(0);
            char minuscula = Character.toLowerCase(usuarioLetra);
            if (Character.isLetter(usuarioLetra)) {
                if (minuscula == 'a' || minuscula == 'e' || minuscula == 'i'|| minuscula == 'o' || minuscula == 'u') {
                    System.out.println("Tu letra es una vocal.");

                } else {
                    System.out.println("Tu letra no es una vocal.");
                }
            } else {
                throw new IllegalArgumentException("Error: No has introducido una letra.");
            }

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());

        }
         */
 /*
        Realitza un programa que mostri els múltiples de 5 menors de 500. Haurà de fer un salt de línia
cada 100.
         */
 /*for (int i = 1; i < 500; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");

                if (i % 100 == 0) {
                    System.out.println();
                }

            }
        }
         */
 /*
        Mostra un menú on les opcions sigui: a. Equilàter, b. Isòsceles, c. Escalè i z. Sortir, demani una
opció i calculi el perímetre del triangle seleccionat. En cas d’escollir equilàter, només demana el
valor d’un costat. En cas d’escollir Isoscelès demana el costat diferent i el valor dels costats
iguals i en cas Escalè demana els tres costats. Fes el menú amb un switch. El programa s’ha de
repetir fins escollir l’opció sortir.
         */

 /*char opcio =0;
        do {
            System.out.println("""
                                               
        Elige una opción. (Solo la letra).
                                             
        === MENÚ PRINCIPAL ===
        a. Equilàter
        b. Isòsceles
        c. Escalè              
        z. Sortir
                                           
         
        Escoge una opción:                        
         """);
            opcio = Character.toLowerCase(s.next().charAt(0));
            
            switch (opcio) {
                case 'a'->{
                    System.out.println("TRIANGULO EQUILATERO");
                    System.out.print("Dime el valor de un costado del triangulo (solo uno)");
                    double costadoTriangulo = s.nextDouble();
                    s.nextLine();
                    double perimetro = costadoTriangulo*3;
                    System.out.print("\nEl perimetro del triangulo es: "+perimetro);
                    
                }
                case 'b'->{
                    System.out.println("TRIANGULO ISOSCLES");
                    System.out.print("Dime el valor de los costados que sean iguales: ");
                    double costadoIgual = s.nextDouble();
                    s.nextLine();
                    System.out.println("\nDime el valor del costado diferente: ");
                    double costadoDiferente = s.nextDouble();
                    s.nextLine();
                    double perimetro = (costadoIgual*2)+costadoDiferente;
                    System.out.println("\nEl perimetro del triangulo es: "+perimetro);
                            
                }
                case 'c'->{
                    System.out.println("TRIANGULO ESCALENO");
                    System.out.print("Dime el valor del costado 1: ");
                    double costado1 = s.nextDouble();
                    s.nextLine();
                    System.out.print("\nDime el valor del costado 2: ");
                    double costado2 = s.nextDouble();
                    s.nextLine();
                    System.out.print("\nDime el valor del costado 3: ");
                    double costado3 = s.nextDouble();
                    s.nextLine();
                    double perimetro = costado1+costado2+costado3;
                    System.out.print("\nEl perimetro es: "+perimetro);
                }
                case 'z'->{
                    System.out.println("Saliendo del sistema...");
                    Thread.sleep(3000);
                }
                    
                   
                default->{
                    System.out.println("Opción no contemplada.");
                    
                }
                    
            }
            
            
            
        }while(opcio!='z');
         */
 /*
         Fes un programa que mostri tot l’abecedari de la ‘a’ la ‘z’. Utilitza l’estructura for.

         */
 /*
         Fes un programa que mostri tot l’abecedari de la ‘a’ la ‘z’. Utilitza l’estructura for.
         */
 /*for (char i = 'a'; i <= 'z'; i++) {
             System.out.println(i);
        }
         */
 /*
         Feu un programa que vagi demanant lletres, si la lletra és una “p”, una “r”, una “o” o una “g”,
retornarà “Lletra correcta”, si s’introdueix una “s” el bucle s’aturarà. Si la lletra introduïda és una
altra, es mostra lletra incorrecta. Si s’introdueix una cosa que no és una lletra, cal fer una
excepció personalitzada. Podeu comprovar si un char és una lletra amb
Character.isLetter(lletra).

         */
        /*char letraUsuario = 0;
        do {
            try {
                System.out.print("Dime una letra: ");
                letraUsuario = Character.toLowerCase(s.next().charAt(0));
                s.nextLine();

                if (Character.isLetter(letraUsuario)) {
                    if (letraUsuario == 'p' || letraUsuario == 'r' || letraUsuario == 'o' || letraUsuario == 'g') {
                        System.out.println("Lletra correcta.");
                    } else if (letraUsuario == 's') {
                        System.out.println("Saliendo del programa...");
                        Thread.sleep(3000);
                    } else {
                        System.out.println("Lletra incorrecta.");
                    }
                } else {
                    throw new IllegalArgumentException("Error: No has introducido una letra.");
                }

            } catch (IllegalArgumentException iae) {
                System.err.println(iae.getMessage());

            }

        } while (letraUsuario != 's');
*/
        /*
        Demana una paraula a l'usuari. Si la paraula té menys de 3 caràcters, força una excepció.Recorre
la paraula amb un bucle per comprovar si té dues lletres iguals conegudes de manera
consecutiva (per exemple, "correu" o "assegurar"). Imprimeix un missatge indicant si s'han
trobat lletres dobles o no.

        */
        boolean encontrado = false;
        try{
        System.out.print("Dime una palabra: ");
        String palabraUsuario = s.nextLine();
        
        if ((palabraUsuario.length())<3) {
            throw new IllegalArgumentException("Error: La palabra tiene menos de 3 carácteres.");
            
        }
            for (int i = 0; i < palabraUsuario.length(); i++) {
                char letra = palabraUsuario.charAt(i);
                if (letra==(letra-1)) {
                    encontrado = true;
                }
            }
            if (encontrado) {
                System.out.println("Se han encontrado letras dobles.");
            }else{
                System.out.println("No se han encontrado letras dobles. ");
            }
        
        }catch(IllegalArgumentException iae) {
                System.err.println(iae.getMessage());

            }

    }

}
