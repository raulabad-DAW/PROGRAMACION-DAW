/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ParcelesRaulAbad;

import static ParcelesRaulAbad.Activitat1.PARCELA1;
import static ParcelesRaulAbad.Activitat1.PARCELA2;
import java.io.PrintStream;
import java.util.Scanner;


public class Activitat2 {

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
        System.out.println("Introdueix el llarg de la parcel·la 1:");
        double llargParcela1 = s.nextDouble();
        s.nextLine();
        System.out.println("Introdueix l'ample de la parcel·la 1:");
        double ampleParcela1 = s.nextDouble();
        s.nextLine();
        System.out.println("Introdueix el llarg de la parcel·la 2:");
        double llargParcela2 = s.nextDouble();
        s.nextLine();
        System.out.println("Introdueix l'ample de la parcel·la 2:");
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
        
         System.out.println("L'àrea de la parcel·la 1 és de: "+areaParcela1 +"m\u00B2");
        System.out.println("L'àrea de la parcel·la 2 és de: "+areaParcela2 +"m\u00B2");
        System.out.println("El perímetre de la parcel·la 1 és de: "+perimetreParcela1 +"m");
        System.out.println("El perímetre de la parcel·la 2 és de: "+perimetreParcela2 +"m");
        System.out.println("El cost total del mur de la parcel·la 1 és de: "+costTotalParcela1 +"€");
        System.out.println("El cost total del mur de la parcel·la 2 és de: "+costTotalParcela2 +"€");
        System.out.println("Es poden cubrir "+metresPerMur+"metres amb el pressupost de:"+FONSAJUDA+"€");
        System.out.println("Corresponen "+eurosAjudaMetre+"€/m\u00B2 del fons d'ajuda per cada metre quadrat de les parceles.");
        
        
        
        
        
        
        
    }
    
}
