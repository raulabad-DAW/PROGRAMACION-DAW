/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuresraulabad;

import java.io.PrintStream;
import java.util.Scanner;

public class FiguresRaulAbad {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    public static final double PI = 3.1416; //constante PI definida manualmente

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("""                                                 
        === MENÚ PRINCIPAL ===
        1. Quadrat
        2. Rectangle
        3. Cercle                   
        4. Polígon regular
        5. Triangle                   
         
        Tria una opció:                                    
         """);
        int opcio = s.nextInt();
        s.nextLine();

        switch (opcio) {
            case 1 -> { //calculamos datos para el cuadrado.
                System.out.println("""                        
                 =====QUADRAT=====                                                      
                                   """);
                System.out.println("Introdueix el costat del quadrat:");
                double costatQuadrat = s.nextDouble();
                s.nextLine();
                double areaQuadrat = costatQuadrat * costatQuadrat;
                String missatgeQuadrat = (costatQuadrat >= 0) ? "L'àrea del quadrat és: " + areaQuadrat : "La mesura no és vàlida."; //mensaje de error con expresión ternaria. 
                System.out.println(missatgeQuadrat);

            }
            case 2 -> { //calculamos datos para el rectangulo.
                System.out.println("""                        
                 =====RECTANGLE=====                                                      
                                   """);
                System.out.println("Introdueix la base del rectangle:");
                double baseRectangle = s.nextDouble();
                s.nextLine();
                System.out.println("Introdueix l'altura del rectangle:");
                double alturaRectangle = s.nextDouble();
                s.nextLine();
                double areaRectangle = baseRectangle * alturaRectangle;
                String missatgeRectangle = (baseRectangle >= 0 && alturaRectangle >= 0) ? "L'àrea del rectangle és: " + areaRectangle : "Les mesures no són vàlides.";//mensaje de error con expresión ternaria. 

                System.out.println(missatgeRectangle);
            }
            case 3 -> {//calculamos datos para el circulo.
                System.out.println("""                        
                 =====CERCLE=====                                                      
                                   """);
                System.out.println("Introdueix el radi del cercle:");
                double radiCercle = s.nextDouble();
                s.nextLine();
                double areaCercle = PI * (radiCercle * radiCercle);
                String missatgeCercle = (radiCercle >= 0) ? "L'àrea del cercle és: " + areaCercle : "No és una mesura vàlida."; //mensaje de error con expresión ternaria. 

                System.out.println(missatgeCercle);

            }
            case 4 -> {//calculamos datos para el polígono. 
                System.out.println("""                        
                 =====POLÍGON REGULAR=====                                                      
                                   """);
                System.out.println("Introdueix el nombre de costats del polígon:");
                int nombreCostats = s.nextInt();
                s.nextLine();
                System.out.println("Introdueix la longitud del costat del polígon:");
                double longitudCostats = s.nextDouble();
                s.nextLine();
                System.out.println("Introdueix l'Apotema del polígon:");
                double apotema = s.nextDouble();
                s.nextLine();
                double areaPoligon = (nombreCostats * longitudCostats * apotema) / 2;
                String missatgePoligon = (nombreCostats >= 0 && longitudCostats >= 0 && apotema >= 0) ? "L'àrea del polígon regular es: " + areaPoligon : "No són mesures vàlides.";//mensaje de error con expresión ternaria.

                System.out.println(missatgePoligon);
            }
            case 5 -> {//calculamos datos para el triangulo. 
                System.out.println("""                        
                 =====TRIANGLE=====                                                      
                                   """);
                System.out.println("Introdueix la base del triangle:");
                double baseTriangle = s.nextDouble();
                s.nextLine();
                System.out.println("Introdueix l'altura del triangle:");
                double alturaTriangle = s.nextDouble();
                s.nextLine();
                double areaTriangle = (baseTriangle * alturaTriangle) / 2;
                String missatgeTriangle = (baseTriangle >= 0 && alturaTriangle >= 0) ? "L'àrea del triangle és: " + areaTriangle : "No són mesures vàlides.";
                System.out.println(missatgeTriangle);
                //Ahora pedimos la longitud de los triángulos. 
                System.out.println("Ara introdueix la longitud dels tres costats:");
                System.out.print("Costat 1: ");
                double costat = s.nextDouble();
                s.nextLine();
                System.out.print("Costat 2: ");
                double costat2 = s.nextDouble();
                s.nextLine();
                System.out.print("Costat 3: ");
                double costat3 = s.nextDouble();
                s.nextLine();
                //Sistema de errores para comprobar válidez del triangulo
                if (costat < costat2 + costat3 && costat2 < costat + costat3 && costat3 < costat + costat2) {//IF PRINCIPAL
                    System.out.println("És possible formar un triangle vàlid.");
                    if (costat == costat2 && costat2 == costat3) {//IF TIPO TRIANGULOS
                        System.out.println("És un triangle equilàter.");

                    } else if (costat == costat2 || costat == costat3 || costat2 == costat3) {
                        System.out.println("És un triangle Isòsceles.");

                    } else {
                        System.out.println("És un triangle Escalè.");
                    }

                } else {
                    System.out.println("No és possible formar un triangle vàlid.");//CIERRE IF PRINCIPAL
                }

            }

            default -> {
                System.out.println("No és una opció correcta.");//CIERRE SWITCH

            }

        }
    }

}
