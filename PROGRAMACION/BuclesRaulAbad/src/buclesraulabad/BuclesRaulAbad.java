/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclesraulabad;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author r.abad
 */
public class BuclesRaulAbad {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    public static final double RENDIMENT = 0.015;
    public static final double ENTRADA = 14.95;
    public static final double DESCUENTOEST = 0.20;
    public static final double DESCUENTOJUB = 0.50;

    public static void main(String[] args) {
        
        /*
        Fes un menú per escollir entre els 5 exercicis següents. Cal tenir un bucle de repetició dels
exercicis i una opció “Sortir” per deixar d’executar-los.
        
1. Un banc ofereix un pla d'estalvi amb rendiment mensual fix. Es demana crear un
simulador que calculi l'evolució del capital d'un client mes a mes durant un any:
1. Demana per teclat el valor inicial que té al compte bancari.
2. El percentatge de rendiment, serà sempre 1,5%.
3. Mitjançant un bucle, calcula i mostra l'evolució de l'estalvi durant exactament
12 mesos.
4. A cada mes, suma l'interès generat al total acumulat i mostra el resultat per
pantalla amb el número de mes corresponent.
5. En acabar el bucle, mostra el benefici total obtingut respecte al dipòsit inicial.
        
2. Volem fer un programa per calcular el preu d'una compra d'entrades per a un museu,
tenint en compte que una persona pot comprar diverses entrades alhora.
L'entrada normal costa 14,95 euros. Els estudiants tenen un descompte del 20% i els
jubilats del 50%. Aquests dos descomptes no són acumulables.
        
El programa ha de permetre introduir quantes entrades es vol comprar en total i,
després, quantes d’aquestes són de cada modalitat. El programa ha d'incloure un petit
resum de la compra al final.
S’ha de controlar que el número d’entrades totals introduïdes sigui major que les
entrades de joves i jubilats, en cas contrari, es mostrarà un error i caldrà tornar a
demanar totes les dades.
        
3. Donat el següent text, utilitza un bucle for per comptar quantes vocals, consonants,
dígits numèrics i símbols conté. Cal ignorar els espais en blanc (no compten per cap
categoria).
        
Cybersecurity is one of the most critical areas in modern network management.
During 2025, Ransomware attacks increased by 37% worldwide, affecting more
than 1200 companies and public institutions. To prevent intrusions,
administrators apply SSL/TLS 1.3 protocols, end-to-end encryption (AES-256),
and multi-factor authentication systems (MFA). Remember: 90% of security
incidents start with a deceptive Phishing email!

Pots utilitzar Character.isDigit() i Character.isLetter() per comprovar si un caràcter és
una lletra o un número.
Mostrar el resum final amb el total de cada tipus.
        
4. Crea un algorisme que demana a l'usuari una edat. Pregunta-li a alguna IA sobre com
aconseguir l’any actual a Java i guardar-ho a un int. En l’entrega que trobaràs a
digitalització, copia i enganxa el prompt que has fet a la IA. L'algorisme escriurà l'edat
que tenia l'usuari en cada any des del seu naixement i s'acomiadarà dient Edat actual:
tens <edat actual>. La sortida ha de ser igual que en l’exemple següent.
Exemple:
Introdueix l'edat: 6
En 2020 va néixer
En 2021 tenia 1 any
En 2022 tenia 2 anys
En 2023 tenia 3 anys
En 2024 tenia 4 anys
En 2025 tenia 5 anys
Edat actual: tens 6 anys
        
5. Escriure un programa que mostri els 4 primers números de la taula de multiplicar d’un
número que introdueix l’usuari. Haurà de mostrar, per cada fila, els 4 primers resultats
de totes les taules des de l’1 fins al número de l’usuari:
        
Exemple:
***MULTIPLICACIONS***
Introdueix un número: 6
1 2 3 4
2 4 6 8
3 6 9 12
4 8 12 16
5 10 15 20
6 12 18 24

        */
        Scanner s = new Scanner(System.in);
        int opcio;
        do {
            System.out.println("""
                                                
        Elige una opción. (Solo el número).
                                             
        === MENÚ PRINCIPAL ===
        1. Plan de ahorro
        2. Entradas del museo
        3. Clasificación de caracteres              
        4. Edad por años
        5. Tablas de multiplicar
        6. Salir                                    
         
        Escoge una opción:                        
         """);
            opcio = s.nextInt();
            s.nextLine();
            switch (opcio) {
                case 1 -> {
                    System.out.println("======PLAN DE AHORRO======");
                    System.out.print("\n Dime el valor inicial de tu cuenta bancaria para empezar el ahorro: ");
                    double valorInicial = s.nextDouble();
                    s.nextLine();
                    double acumulable = valorInicial;
                    double interes;
                    System.out.println("Con esta cantidad, tu plan de ahorro en 12 meses sería:");
                    for (int i = 1; i <= 12; i++) {
                        interes = RENDIMENT * acumulable;
                        acumulable += interes;
                        System.out.println("Mes " + i + ": " + String.format("%.2f", acumulable));

                    }
                    System.out.println("El beneficio total es: " + String.format("%.2f", acumulable - valorInicial) + " €");

                }
                case 2 -> {
                    System.out.println("======ENTRADAS DEL MUSEO======");
                    int entradas = 1;
                    int entradasEstu = 1;
                    int entradasJubi = 1;

                    do {
                        System.out.print("\n Dime cuantas entradas quieres comprar: ");
                        entradas = s.nextInt();
                        s.nextLine();
                        System.out.print("Cuantas son de estudiantes? ");
                        entradasEstu = s.nextInt();
                        s.nextLine();
                        System.out.print("Y de jubilados? ");
                        entradasJubi = s.nextInt();
                        s.nextLine();
                        if (entradas < (entradasEstu + entradasJubi)) {
                            System.out.println("Datos erróneos, vuelve a introducirlos correctamente.");

                        }

                    } while (entradas < (entradasEstu + entradasJubi));

                    int entradasNormales = entradas - (entradasEstu + entradasJubi);
                    double precioEntradas = entradasNormales * ENTRADA;
                    double precioEntradasEstu = entradasEstu * ENTRADA * (1 - DESCUENTOEST);
                    double precioEntradasJubi = entradasJubi * ENTRADA * (1 - DESCUENTOJUB);
                    double precioTotal = precioEntradas + precioEntradasEstu + precioEntradasJubi;

                    System.out.println("=======RESUMEN DE COMPRA======");
                    System.out.println("Entradas totales: " + entradas);
                    System.out.println("Entradas estudiantes: " + entradasEstu);
                    System.out.println("Entradas jubilados: " + entradasJubi);
                    System.out.println("Precio entradas estudiantes: " + String.format("%.2f", precioEntradasEstu) + " €");
                    System.out.println("Precio entradas jubilados: " + String.format("%.2f", precioEntradasJubi) + " €");
                    System.out.println("Precio total: " + String.format("%.2f", precioTotal) + " €");

                }
                case 3 -> {
                    System.out.println("=======CLASIFICACIÓN DE CARACTERES======");
                    String texto = """
                                     Cybersecurity is one of the most critical areas in modern network management.
                                     During 2025, Ransomware attacks increased by 37% worldwide, affecting more
                                     than 1200 companies and public institutions. To prevent intrusions,
                                     administrators apply SSL/TLS 1.3 protocols, end-to-end encryption (AES-256),
                                     and multi-factor authentication systems (MFA). Remember: 90% of security
                                     incidents start with a deceptive Phishing email!
                                     
                                     """;
                    int vocales = 0;
                    int consonantes = 0;
                    int numeros = 0;
                    int simbolos = 0;
                    for (int i = 0; i < texto.length(); i++) {
                        char letra = texto.charAt(i);
                        if (Character.isWhitespace(letra)) {
                            //Lo dejamos vacio ya que no nos interesa hacer nada con estos espacios en blanco. 
                        } else if (Character.isDigit(letra)) {
                            numeros++;

                        } else if (Character.isLetter(letra)) {
                            char minuscula = Character.toLowerCase(letra);

                            if (minuscula == 'a' || minuscula == 'e' || minuscula == 'i'
                                    || minuscula == 'o' || minuscula == 'u') {
                                vocales++;
                            } else {
                                consonantes++;
                            }

                        } else {
                            simbolos++;
                        }

                    }
                    System.out.println("Vocales: " + vocales);
                    System.out.println("Consonantes: " + consonantes);
                    System.out.println("Números: " + numeros);
                    System.out.println("Símbolos: " + simbolos);
                }
                case 4 -> {
                    System.out.println("=======EDAD POR AÑOS=======");
                    System.out.print("Dime tu edad: ");
                    int edadUsuario = s.nextInt();
                    s.nextLine();
                    int anyActual = LocalDate.now().getYear();
                    int anyNacimiento = anyActual - edadUsuario;
                    for (int i = anyNacimiento; i < anyActual; i++) {
                        if (i == anyNacimiento) {
                            System.out.println("En " + i + " naciste.");
                        } else {
                            int edadEnEsteAny = i - anyNacimiento;
                            if (edadEnEsteAny == 1) {
                                System.out.println("En " + i + " tenía 1 año");

                            } else {
                                System.out.println("En " + i + " tenía " + edadEnEsteAny + " años");
                            }
                        }
                    }
                    if (edadUsuario == 1) {
                        System.out.println("Edad actual: tienes 1 año");
                    } else {
                        System.out.println("Edad actual: tienes " + edadUsuario + " años");
                    }

                }
                case 5 -> {
                    System.out.println("=======TABLAS DE MULTIPLICAR=======");
                    System.out.print("\nIntroduce un número: ");
                    int numUsuario = s.nextInt();
                    s.nextLine();
                    for (int i = 1; i <= numUsuario; i++) {
                        for (int j = 1; j <= 4; j++) {
                            System.out.print(i * j);
                            if (j < 4) {
                                System.out.print(" ");

                            }
                        }
                        System.out.print("\n");

                    }
                }
                case 6 -> {
                    System.out.println("Saliendo del programa. ¡Hasta pronto!");
                }
                default -> {
                    System.out.println("Opción no contemplada.");

                }

            }

        } while (opcio != 6);

    }

}
