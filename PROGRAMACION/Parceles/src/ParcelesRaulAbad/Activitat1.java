/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ParcelesRaulAbad;

import java.io.PrintStream;

/**
 *
 * @author r.abad
 */
public class Activitat1 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    public static final int PARCELA1 = 29;
    public static final int PARCELA2 = 21;
    public static void main(String[] args) {
        
        int llargParcela1 = 55;
        int ampleParcela1 = 30;
        int llargParcela2 = 45;
        int ampleParcela2 = 25;
        int areaParcela1 = ampleParcela1*llargParcela1;
        int areaParcela2 = ampleParcela2*llargParcela2;
        int perimetreParcela1 = 2*(llargParcela1+ampleParcela1);
        int perimetreParcela2 = 2*(llargParcela2+ampleParcela2);
        int costTotalParcela1 = perimetreParcela1*PARCELA1;
        int costTotalParcela2 = perimetreParcela2*PARCELA2;
        
        System.out.println("L'àrea de la parcel·la 1 és de: "+areaParcela1 +"m\u00B2");
        System.out.println("L'àrea de la parcel·la 2 és de: "+areaParcela2 +"m\u00B2");
        System.out.println("El perímetre de la parcel·la 1 és de: "+perimetreParcela1 +"m");
        System.out.println("El perímetre de la parcel·la 2 és de: "+perimetreParcela2 +"m");
        System.out.println("El cost total del mur de la parcel·la 1 és de: "+costTotalParcela1 +"€");
        System.out.println("El cost total del mur de la parcel·la 2 és de: "+costTotalParcela2 +"€");


        
        
        
      
    }
    
}
