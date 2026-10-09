package condicionales;

import java.io.PrintStream;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author r.abad
 */
public class ExpressionsTernaries {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {
        /*
        Ternàries 1: Escriu una expressió ternària que determini dintre d’un String si un
número és parell o senar.
         */
 /*Scanner s = new Scanner(System.in);
        int expressio = s.nextInt();
        s.nextLine();
        String resultat = (expressio%2==0) ? "Par": "Impar";
        System.out.println("El resultado es: "+resultat);
         */

 /*
        Ternàries 2: Escriu una expressió ternària on, dintre d’un int, guardi el número
més gran entre dos valors que introdueix l’usuari.
         */
 /*Scanner s = new Scanner(System.in);
        System.out.println("Dime un número:");
        int numUsuari1 = s.nextInt();
        s.nextLine();
        System.out.println("Dime otro número:");
        int numUsuari2 = s.nextInt();
        s.nextLine();
        int resultado = (numUsuari1>numUsuari2)?numUsuari1:numUsuari2;
        System.out.println("El número más grande entre los dos es: "+resultado);
/*
        /*
        Ternàries 3: Demana a l’usuari unpreu d’un producte. Si el preu és superior a
50 €, aplica-li un 10% de descompte (multiplicant per 0.9). Si no ho és, mantén el
preu original.
         */
 /*Scanner s = new Scanner(System.in);
        System.out.println("Dime el precio de un producto:");
        double preu = s.nextDouble();
        s.nextLine();
        double resultado = (preu>50) ? preu*0.9 : preu;
        System.out.println("El precio es: "+resultado);
         */
 /*
        Ternàries 4: Donada una variable edat que introdueix el valor l’usuari, assigna
"Nen" si és menor de 12 anys, "Adolescent" si té entre 12 i 17 anys (inclosos), i
"Adult" si té 18 anys o més
         */
        /*Scanner s = new Scanner(System.in);
        System.out.println("Dime la edad de tu hijo:");
        int edadUsuari = s.nextInt();
        s.nextLine();
        String resultado = edadUsuari < 12 ? "Nen" : (edadUsuari < 17 ? "Adolescent" : "Adult");
        System.out.println("Tu hijo es: "+resultado);
*/
        /*
        Ternàries 5: A partir d'una temperatura en °C que introdueix l’usuari,
determina si l'aigua es troba en estat "Sòlid" (temperatura inferior o igual a 0),
"Gasós" (temperatura superior o igual a 100) o "Líquid" (qualsevol altre valor
entremig).
        */
        /*Scanner s = new Scanner(System.in);
        System.out.println("Digueu-me una temperatura:");
        double temper = s.nextDouble();
        s.nextLine();
        String resultado = temper<=0?"Sòlid":(temper>=100?"Gasós":"Líquid");
        System.out.println("La temperatura està en estat: "+resultado);
*/
        

    }

}
