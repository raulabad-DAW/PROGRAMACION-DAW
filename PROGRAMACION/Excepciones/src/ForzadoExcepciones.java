
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author r.abad
 */
public class ForzadoExcepciones {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //EJERCICIOS 
        /*
        Excepcions 3: Escriu un programa que demani l'edat a l'usuari. Si l'edat és
menor que 18, força una excepció amb el missatge "Accés denegat: Has de
ser major d'edat". Si l'edat és 18 o més, mostra el missatge "Accés permès".
        */
        /*System.out.print("Dime tu edad: ");
        int edadUsuario = s.nextInt();
        s.nextLine();
        try {
            if (edadUsuario < 18) {
                throw new IllegalArgumentException("Acceso denegado, has de ser mayor de edad.");
            }else{
                     System.out.println("Acceso permitido.");
                    }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            
        }
*/
        /*
        Excepcions 4: Crea un programa que demani a l'usuari quin percentatge de
descompte vol aplicar a una compra (de 0 a 50%). Si l'usuari introdueix un
descompte negatiu o superior a 50, força una excepció indicant
"Percentatge de descompte no permès". Si és correcte, calcula i mostra el
preu final d'un producte de 100€.
        */
        /*System.out.print("Que porcentaje de descuento quieres aplicar a una compra? (0 a 50%)");
        int descuento = s.nextInt();
        s.nextLine();
        try {
            if (descuento < 0 || descuento > 50) {
                throw new IllegalArgumentException("Porcentaje de descuento no permitido");
            }
           double precioFinal = 100 * (1 - descuento / 100.0);
            System.out.println("Tu compra por un producto de 100€ segun el descuento es de: " + precioFinal+" €");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
*/
        /*
        Excepcions 5: Crea un programa demani un número sencer entre 1 i 10 i el
mostri en lletres. Si el número introduït és menor a 1 o major a 10, força el
llançament d’una excepció que mostri: “El número no és correcte”. Fes que
els missatges siguin diferents: un missatge si el número és menor que 1 o
un altre missatge si és major que 10.

        */
        /*System.out.print("Dime un número entero entre 1 y 10: ");
        int numUsuario = s.nextInt();
        s.nextLine();
        try {
            if (numUsuario < 1 ) {
                throw new IllegalArgumentException("El número no es correcto, es menor que 1.");
            }
            if (numUsuario > 10) {
                throw new IllegalArgumentException("El número no es correcto, es mayor que 10.");

            }
            String letras = switch (numUsuario) {
                case 1 ->
                    "uno";
                case 2 ->
                    "dos";
                case 3 ->
                    "tres";
                case 4 ->
                    "cuatro";
                case 5 ->
                    "cinco";
                case 6 ->
                    "seis";
                case 7 ->
                    "siete";
                case 8 ->
                    "ocho";
                case 9 ->
                    "nueve";
                default ->
                    "diez";
            };
    System.out.println("El número es: " + letras);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
*/
        /*
        Excepcions 6: Afegeix que hi hagi una excepció en cas que ens introdueixin
una lletra. 
        */
        try {
        System.out.print("Dime un número entero entre 1 y 10: ");
        int numUsuario = s.nextInt();
        s.nextLine();
            if (numUsuario < 1 ) {
                throw new IllegalArgumentException("El número no es correcto, es menor que 1.");
            }
            if (numUsuario > 10) {
                throw new IllegalArgumentException("El número no es correcto, es mayor que 10.");

            }
            String letras = switch (numUsuario) {
                case 1 ->
                    "uno";
                case 2 ->
                    "dos";
                case 3 ->
                    "tres";
                case 4 ->
                    "cuatro";
                case 5 ->
                    "cinco";
                case 6 ->
                    "seis";
                case 7 ->
                    "siete";
                case 8 ->
                    "ocho";
                case 9 ->
                    "nueve";
                default ->
                    "diez";
            };
    System.out.println("El número es: " + letras);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException ime){
            System.err.println("Error: No puedes introducir una letra.");
        }
        

    }

}
