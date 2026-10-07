package variables;


import java.io.PrintStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author r.abad
 */
public class Ejercicios {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }
    public static void main(String[] args) {
        //ALT+MAYUS+F Tabula todo. 
        /*
        Variables1: Feu un programa on crearàs dues variables senceres.
 Després crea una tercera variable per guardar el resultat de la
multiplicació de les anteriors. Imprimeix el valor del resultat per
pantalla.
         */
       /* int num1 = 4;
        int num2 = 6;
        int resultado = 24;
        System.out.println(resultado);
        
        /*
        Variables2: Canvieu la sortida perquè es mostri de la següent manera:
“El resultat de X per Y és Z”.
Exemple de sortida: “El resultat de 3 per 2 és 6”
        */
        /*int num1 = 4;
        int num2 = 6;
        int resultado = 24;
        System.out.println("El resultado de 4 por 6 es: "+resultado);

/*
       Variables 3: Feu un programa que donats dos números sencers, mostri
el resultat de la suma, resta, multiplicació i divisió de tots dos.

       */
        /*int num1 = 4;
        int num2 = 6;
        int suma = 10;
        int resta = -2;
        int multi = 24;
        double div = 1.5;
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicación es: "+multi);
        System.out.println("El resultado de la división es: "+div);

/*
        Variables 4: Crea tantes variables com amb les lletres del teu nom i
mostra-les totes juntes. Si tens la mateixa lletra dues vegades, reutilitza
la variable
        */
        /*char R = 'R';
        char A = 'A';
        char U = 'U';
        char L = 'L';
        System.out.println(""+R+A+U+L);
        
/*
        Variables 5: Feu un programa que guardi a una variable booleana si un
número enter guardat a una altra variable és positiu o no i mostra-ho
per pantalla.
        */
        /*int numBoolean = 2;
        boolean positiu = numBoolean>=0;
        System.out.println("Mi número es positivo?: "+positiu);

/*
        Variables 6: Donades 3 variables reals, calcula la mitjana de les 3.
        */
        /*int num1 = 2;
        int num2 = 4;
        int num3 = 6;
        int mitjna =(num1+num2+num3)/3;
        System.out.println(mitjna);
/*
        Variables 7: Creeu un programa que tenint a una variable un número de
segons, mostri per pantalla el número d'hores, minuts i segons.
        */
        /*int segundos = 3600;
        int minutos = 60;
        int segundosAportados = 15660;
        int horasC = segundosAportados/segundos;
        System.out.println("Horas: "+horasC);
        int restante = segundosAportados%segundos;
        int minutosC = restante/minutos;
        System.out.println("Minutos: "+minutosC);
        int segundosC = restante%minutos;
        System.out.println("Segundos: "+segundosC);
        
        /*
        Variables 8: Inicia dues variables amb dos valors sencers. Intercanvia el
valor que tenen dues variables utilitzant una tercera variable.
        */
        /*int num1 = 2;
        int num2 = 5;
        int temp = num1;
        num1 = num2;
        num2=temp;
        System.out.println("El número 1 vale: "+num1);
        System.out.println("El número 2 vale: "+num2);
        
        /*
        VariablesExtra: Amplia l’exercici anterior, fent l’intercanvia de valors
de dues variables utilitzant només dues variables.
        */
        /*int num1 = 2;
        int num2 = 5;
        int temp = num1;
        num1 = num2;
        num2=temp;
        
        
        
        


        
       


        

*/
    }
    
    

}
