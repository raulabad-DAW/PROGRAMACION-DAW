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
public class Constantes {

    static { //Esto son los carácteres especiales de manera que podemos escribir acentos y ñs. y se pone ce y TAB.
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    //public static final double TAXA_IVA = 0.21; //La constante se pone antes del método MAIN. 
    //public static final double gravedad = 9.8;
    //public static final double PI = 3.1416;
    public static final int BILLETE500 = 500;
    public static final int BILLETE200 = 200;
    public static final int BILLETE100 = 100;
    public static final int BILLETE50= 50;
    public static final int BILLETE20 = 20;
    public static final int BILLETE10 = 10;
    public static final int BILLETE5 = 5;
    public static void main(String[] args) {
        /*
        Constants1: Calculeu el pes (P) d’un cos a partir de la seva massa.
Sabent que la gravetat (g) és sempre 9,8 m/s² i que la fórmula és:

        Mostreu el resultat de calcular el pes de les següents masses (m): 75 kg,
162 kg i 20000 kg.

        
        //75kg
        double masa = 75;
        double peso = masa*gravedad;
        System.out.println("El peso de la masa de 75kg es: "+peso);
        
 
        //162kg
        /*double masa = 162;
        double peso = masa*gravedad;
        System.out.println("El peso de la masa de 162 kg es: "+peso);
*/
        //20000kg
        /*double masa = 20000;
        double peso = masa*gravedad;
        System.out.println("El peso de la masa de 20.000 kg es: "+peso);
*/
        /*
        Constants 2: Crea una constant de nom PI amb el valor 3.1416.

        Calcula les àrees dels cercles de radi 10, 7 i 43.
        */
        //RADI 10
        /*double radio = 10;
        double area = Math.pow(radio, 2)*PI; //ESTA MANERA ES DE PONER EL ELEVADO
        System.out.println("El área del circulo del radio 10 es: "+area);
*/

        //RADI 7
        /*double radio = 7;
        double area = PI*(radio*radio);
        System.out.println("El área del circulo del radio 7 es: "+area);
*/
        //RADI 43
        /*double radio = 43;
        double area = PI*(radio*radio);
        System.out.println("El área del circulo del radio 43 es: "+area);
*/
        /*
        ConstantsExtra: Fes un programa que, donat un import en euros, ens
indiqui el mínim número de bitllets i la quantitat sobrant que es pot
obtenir amb aquesta quantitat. Les constants seran el valor del bitllets
existents.
● Exemple: 232 € → 0 bitllets de 500, 1 bitllet de 200, 0 bitllets de 100, 0
bitllets de 50, 1 bitllet de 20; 1 bitllet de 10, 0 bitllets de 5 . Sobren 2 €
        */
       /* int eurosAportados = 232;
        int billete500C = eurosAportados/billete500;
        System.out.println("billetes de 500: "+billete500C);
        int sobrante = 
*/
        
        
    }
    
}
