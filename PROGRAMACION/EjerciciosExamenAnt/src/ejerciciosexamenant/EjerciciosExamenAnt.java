/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosexamenant;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author r.abad
 */
public class EjerciciosExamenAnt {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {
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
 /* boolean encontrado = false;
        try{
        System.out.print("Dime una palabra: ");
        String palabraUsuario = s.nextLine();
        
        if ((palabraUsuario.length())<3) {
            throw new IllegalArgumentException("Error: La palabra tiene menos de 3 carácteres.");
            
        }
            for (int i = 1; i < palabraUsuario.length(); i++) {
                char letra = palabraUsuario.charAt(i);
                if (letra==palabraUsuario.charAt(i-1)) {
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
         */
 /*
       Crea un programa que demani a l'usuari un codi d'empleat de 5 caràcters. Si la longitud no és
exactament de 5 caràcters, força una excepció. El primer caràcter ha de ser una lletra majúscula
(pots utilitzar Character.isUppercase). Si no és una majúscula, mostra un missatge. Els 4 restants
han de ser dígits (Character.isDigit). Si no es compleix aquesta estructura, torna a demanar el
codi indicant quin requisit falla. Si és correcte, mostra "Codi acceptat".
         */
 /*boolean acceptat = false;
        do {
            try {
                System.out.print("Introdueix un codi d'empleat (5 caràcters): ");
                String codi = s.nextLine();

                if (codi.length() != 5) {
                    throw new IllegalArgumentException("La longitud del codi no és de 5 caràcters.");
                }

                boolean formatCorrecte = true;

                char primera = codi.charAt(0);
                if (!Character.isUpperCase(primera)) {
                    System.out.println("La primera lletra ha de ser majúscula.");
                    formatCorrecte = false;
                }

                for (int i = 1; i < codi.length(); i++) {
                    if (!Character.isDigit(codi.charAt(i))) {
                        System.out.println("El caràcter a la posició " + i  + " no és un dígit.");
                        formatCorrecte = false;
                    }
                }

                if (formatCorrecte == true) {
                    acceptat = true;
                }

            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }

        } while (!acceptat);

        System.out.println("Codi acceptat!");

        s.close();
         */
 /*
        Programa que demana a l'usuari un número positiu. Fes una excepció personalitzada si el
número és negatiu i també captura si no és un número. El programa ha de generar una
seqüència de nombres en forma de piràmide. Per cada fila, el programa ha de mostrar els
nombres consecutius des d'1 fins al nombre de la fila actual. Si l'entrada és 5, La sortida serà:
 1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
         */
        /*try {
            System.out.println("Dime un número positivo");
            int numUsuario = s.nextInt();
            s.nextLine();
            if (numUsuario>0) {
                for (int i = 1; i <= numUsuario; i++) {
                    
                    for (int j = 1; j <=i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            }else{
                    throw new IllegalArgumentException("Error. No es un número positivo.");
            }
        } catch (InputMismatchException ime) {//excepción al introducir una letra en vez de un número
            System.err.println("Error: No puedes introducir una letra.");
            s.nextLine();
        }catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
*/
        
       /* int opcio = 0;
        String Capital = "Oslo";
 
        do {
            System.out.println();
            System.out.println("===== MENÚ =====");
            System.out.println("1. Jugadors de la NBA");
            System.out.println("2. Capital de Noruega");
            System.out.println("3. Classificar caràcters");
            System.out.println("4. Sortir");
            System.out.print("Escull una opció: ");
 
            try {
                opcio = s.nextInt();
                s.nextLine();
 
                switch (opcio) {
 
                    case 1 -> {
                        // ---------------------------------------------
                        // PROBLEMA 1: Escriviu un programa per pantalla que permeti triar
                        //entre mostrar la informació de tres jugadors de la NBA. Si s’introdueix alguna cosa que no
                        //sigui un número, cal capturar l’excepció, i si s’introdueix un número menor que 1 o major que 3,
                        //també ha de donar una excepció. Heu d’utilitzar la instrucció switch)
                        // ---------------------------------------------
                        try {
                            System.out.println("1. Lebron James");
                            System.out.println("2. Stephen Curry");
                            System.out.println("3. Luka Doncic");
                            System.out.print("Escull un jugador (1 a 3): ");
                            int jugador = s.nextInt();
                            s.nextLine();
 
                            // Excepció forçada si el número no és 1, 2 o 3
                            if (jugador < 1 || jugador > 3) {
                                throw new IllegalArgumentException("Error: el número ha d'estar entre 1 i 3");
                            }
 
                            switch (jugador) {
                                case 1 -> {
                                    System.out.println("Nom: Lebron");
                                    System.out.println("Cognom: James");
                                    System.out.println("Alçada: 2,06");
                                }
                                case 2 -> {
                                    System.out.println("Nom: Stephen");
                                    System.out.println("Cognom: Curry");
                                    System.out.println("Alçada: 1,88");
                                }
                                case 3 -> {
                                    System.out.println("Nom: Luka");
                                    System.out.println("Cognom: Doncic");
                                    System.out.println("Alçada: 2,01");
                                }
                            }
                        } catch (InputMismatchException ime) {
                            System.out.println("Error: has d'introduir un número");
                            s.nextLine();
                        } catch (IllegalArgumentException iae) {
                            System.out.println(iae.getMessage());
                        }
                    }
 
                    case 2 -> {
                        // ---------------------------------------------
                        // PROBLEMA 2: Escriu un programa que permeti preguntar a l’usuari la capital de Noruega,
                        //haurà de demanar a l’usuari paraules fins que introdueixi la correcta.
                        //Podrà fer 3 intents i l’informarem de quants intents li queden. Crea una constant amb el valor correcte (“Oslo”)
                        // ---------------------------------------------
                        int intents = 3;
                        boolean encertat = false;
 
                        while (intents > 0 && !encertat) {
                            System.out.print("Quina és la capital de Noruega? (intents: " + intents + "): ");
                            String resposta = s.nextLine();
 
                            if (resposta.equals(Capital)) {
                                encertat = true;
                                System.out.println("Correcte!");
                            } else {
                                intents--;
                                if (intents > 0) {
                                    System.out.println("Incorrecte. Et queden " + intents + " intents");
                                }
                            }
                        }
 
                        if (!encertat) {
                            System.out.println("Has esgotat els intents. La capital és " + Capital);
                        }
                    }
 
                    case 3 -> {
                        // ---------------------------------------------
                        // PROBLEMA 3: Demana a l’usuari quants caràcters vol introduir.
                        //Després demana aquesta quantitat de caràcters i classifica’ls mostrant per pantalla:
                        //És un número, És una lletra majúscula, És una lletra minúscula.
                        //Si introdueix un símbol, caldrà forçar una excepció i mostrar un missatge per pantalla.
                        //Finalment, indica quants caràcters de cada tipus ha introduït.
                        // ---------------------------------------------
                        try {
                            System.out.print("Quants caràcters vols introduir? ");
                            int quantitat = s.nextInt();
                            s.nextLine();
 
                            int numeros = 0;
                            int majuscules = 0;
                            int minuscules = 0;
 
                            for (int i = 1; i <= quantitat; i++) {
                                System.out.print("Introdueix el caràcter " + i + ": ");
                                String text = s.nextLine();
 
                                if (text.length() != 1) {
                                    throw new IllegalArgumentException("Error: has d'introduir un sol caràcter");
                                }
 
                                char c = text.charAt(0);
 
                                if (Character.isDigit(c)) {
                                    System.out.println("És un número");
                                    numeros++;
                                } else if (Character.isUpperCase(c)) {
                                    System.out.println("És una lletra majúscula");
                                    majuscules++;
                                } else if (Character.isLowerCase(c)) {
                                    System.out.println("És una lletra minúscula");
                                    minuscules++;
                                } else {
                                    // És un símbol: forcem l'excepció i el programa s'atura
                                    throw new IllegalArgumentException("Error: has introduït un símbol");
                                }
                            }
 
                            System.out.println("Números: " + numeros);
                            System.out.println("Lletres majúscules: " + majuscules);
                            System.out.println("Lletres minúscules: " + minuscules);
 
                        } catch (InputMismatchException ime) {
                            System.out.println("Error: has d'introduir un número");
                            s.nextLine();
                        } catch (IllegalArgumentException iae) {
                            System.out.println(iae.getMessage());
                        }
                    }
 
                    case 4 -> System.out.println("Adéu!");
 
                    default -> System.out.println("Opció incorrecta");
                }
 
            } catch (InputMismatchException ime) {
                System.out.println("Error: has d'introduir un número del menú");
                s.nextLine();
            }
 
        } while (opcio != 4);
*/
       
    }

}
