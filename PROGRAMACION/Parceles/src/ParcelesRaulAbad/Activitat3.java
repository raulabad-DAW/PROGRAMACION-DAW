/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ParcelesRaulAbad;

import static ParcelesRaulAbad.Activitat2.FONSAJUDA;
import static ParcelesRaulAbad.Activitat2.PARCELA1;
import static ParcelesRaulAbad.Activitat2.PARCELA2;
import static ParcelesRaulAbad.Activitat2.PRESCLIENT;
import java.io.PrintStream;
import java.util.Scanner;


public class Activitat3 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    public static final int PARCELA1 = 29;
    public static final int PARCELA2 = 21;
    public static final int PRESCLIENT = 3500;
    public static final int FONSAJUDA = 3000;
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        System.out.println("Introdueix el teu nom:");
        String nomUsuari = s.nextLine();
        System.out.println("Benvingut/da,"+nomUsuari+"! Comencem amb el càlcul de la teva parcel·la.");
        System.out.println("Dona-li un nom a tu primera parcel·a (només el nom):");
        String nomParcela1 = s.nextLine();
        System.out.println("Introdueix el llarg de la parcel·a"+nomParcela1+":");
        double llargParcela1 = s.nextDouble();
        s.nextLine();
        System.out.println("Introdueix l'ample de la parcel·a"+nomParcela1+":");
        double ampleParcela1 = s.nextDouble();
        s.nextLine();
        System.out.println("Dona-li un nom a tu segona parcel·a (només el nom):");
        String nomParcela2 = s.nextLine();
        System.out.println("Alguna de les parceles conté aquest nom? "+nomParcela2.equalsIgnoreCase(nomParcela2));
        System.out.println("Introdueix el llarg de la parcel·a"+nomParcela2+":");
        double llargParcela2 = s.nextDouble();
        s.nextLine();
        System.out.println("Introdueix l'ample de la parcel·a"+nomParcela2+":");
        double ampleParcela2 = s.nextDouble();
        s.nextLine();
        double areaParcela1 = ampleParcela1*llargParcela1;
        double areaParcela2 = ampleParcela2*llargParcela2;
        double perimetreParcela1 = 2*(llargParcela1+ampleParcela1);
        double perimetreParcela2 = 2*(llargParcela2+ampleParcela2);
        double costTotalParcela1 = perimetreParcela1*PARCELA1;
        double costTotalParcela2 = perimetreParcela2*PARCELA2;
        double metresPerMur = (double)PRESCLIENT/PARCELA1;
        double areaTotal = areaParcela1+areaParcela2;
        double eurosAjudaMetre = FONSAJUDA/areaTotal;
        String nomEncriptat1 = nomParcela1.replace('a', '!').replace('e', '@').replace('i', '#').replace('o', '$').replace('u', '%').replace('A', '!').replace('E', '@').replace('I', '#').replace('O', '$').replace('U', '%').replace('à', '$').replace('á', '$').replace('è', '$').replace('é', '$').replace('í','$').replace('ï','$').replace('ò','$').replace('ó','$').replace('ú','$').replace('ü','$').replace('À','$').replace('Á','$').replace('È','$').replace('É','$').replace('Í','$').replace('Ï','$').replace('Ò','$').replace('Ó','$').replace('Ú','$').replace('Ü','$');
        String nomEncriptat2 = nomParcela2.replace('a', '!').replace('e', '@').replace('i', '#').replace('o', '$').replace('u', '%').replace('A', '!').replace('E', '@').replace('I', '#').replace('O', '$').replace('U', '%').replace('à', '$').replace('á', '$').replace('è', '$').replace('é', '$').replace('í','$').replace('ï','$').replace('ò','$').replace('ó','$').replace('ú','$').replace('ü','$').replace('À','$').replace('Á','$').replace('È','$').replace('É','$').replace('Í','$').replace('Ï','$').replace('Ò','$').replace('Ó','$').replace('Ú','$').replace('Ü','$');

         System.out.println("L'àrea de la parcel·la"+nomParcela1+" és de: "+areaParcela1 +"m\u00B2");
        System.out.println("L'àrea de la parcel·la"+nomParcela2+"és de: "+areaParcela2 +"m\u00B2");
        System.out.println("El perímetre de la parcel·la"+nomParcela1+" és de: "+perimetreParcela1 +"m");
        System.out.println("El perímetre de la parcel·la"+nomParcela2+" és de: "+perimetreParcela2 +"m");
        System.out.println("El cost total del mur de la parcel·la"+nomParcela1+" és de: "+costTotalParcela1 +"€");
        System.out.println("El cost total del mur de la parcel·la"+nomParcela2+"és de: "+costTotalParcela2 +"€");
        System.out.println("Es poden cubrir "+metresPerMur+"metres amb el pressupost de 3500€");
        System.out.println("Corresponen "+eurosAjudaMetre+"€/m\u00B2 del fons d'ajuda per cada metre quadrat de les parceles.");
        System.out.println("El nom encriptat de la primera parcel·la és: "+nomEncriptat1+","+nomEncriptat2+".");
         System.out.println("Introdueix un nom per cercar una parcel·la");
         String recerParcela = s.nextLine();
         System.out.println("Alguna de les parceles conté aquest nom? "+nomParcela2.contains(nomParcela2));
         System.out.println("Alguna de les parceles conté aquest nom? "+nomParcela2.contains(nomParcela2));
         
         
        

        
    }
    
}
