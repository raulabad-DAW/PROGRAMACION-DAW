/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntescomprimidos;

/**
 *
 * @author r.abad
 */
public class ApuntesComprimidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        ==========================================================
              APUNTES JAVA - EXAMEN
==========================================================

        
INDICE:
1. Scanner: pedir datos
2. If, else if y else
3. Comprobar par o impar
4. Switch
5. Operador ternario
6. Bucle for
7. Bucle while
8. Bucle do while
9. Contadores y acumuladores
10. Strings
11. Char
12. Recorrer un String y contar vocales
13. Excepciones try y catch
14. Forzar excepciones con throw
15. Validar datos
16. Numeros aleatorios
17. Crear String aleatorio
18. Bucles anidados
19. Encontrar mayor y menor
20. Menu completo
21. Como identificar cada estructura


==========================================================
1. SCANNER: PEDIR DATOS AL USUARIO
==========================================================

SE USA SI TE PIDEN:
- Pedir un numero al usuario.
- Pedir una edad, nombre, letra o cualquier dato.
- Guardar un dato introducido por teclado.

CODIGO:

Scanner sc = new Scanner(System.in);

System.out.println("Introdueix un numero:");
int numero = sc.nextInt();

System.out.println("Has introduit: " + numero);


TIPOS DE DATOS:

int numero = sc.nextInt();           // Entero
double numero = sc.nextDouble();     // Decimal
String texto = sc.next();            // Una palabra
String texto = sc.nextLine();        // Texto con espacios
boolean valor = sc.nextBoolean();    // true o false
char letra = sc.next().charAt(0);    // Un caracter


IMPORTANTE:
Si utilizas nextLine() despues de nextInt() o
nextDouble(), debes limpiar el salto de linea.

int numero = sc.nextInt();
sc.nextLine();

String texto = sc.nextLine();


==========================================================
2. IF, ELSE IF Y ELSE
==========================================================

SE USA SI TE PIDEN:
- Comprobar una condicion.
- Comparar numeros.
- Saber si alguien es mayor de edad.
- Clasificar notas o resultados.
- Comprobar si un numero es positivo o negativo.

ESTRUCTURA:

if (condicion) {
    // Si se cumple
} else if (otraCondicion) {
    // Si se cumple la segunda
} else {
    // Si ninguna se cumple
}


EJEMPLO: POSITIVO, NEGATIVO O CERO

if (numero > 0) {
    System.out.println("Positiu");
} else if (numero < 0) {
    System.out.println("Negatiu");
} else {
    System.out.println("Es zero");
}


EJEMPLO: MAYOR O MENOR DE EDAD

if (edad >= 18) {
    System.out.println("Major d'edat");
} else {
    System.out.println("Menor d'edat");
}


OPERADORES:

==  Igual que
!=  Diferente
>   Mayor que
<   Menor que
>=  Mayor o igual
<=  Menor o igual
&&  Y: se cumplen las dos condiciones
||  O: se cumple alguna condicion
!   Negacion


==========================================================
3. COMPROBAR SI UN NUMERO ES PAR O IMPAR
==========================================================

SE USA SI TE PIDEN:
- Saber si un numero es par o impar.
- Comprobar si un numero es divisible por otro.

CODIGO:

if (numero % 2 == 0) {
    System.out.println("Parell");
} else {
    System.out.println("Senar");
}


PARA COMPROBAR SI ES DIVISIBLE ENTRE 5:

if (numero % 5 == 0) {
    System.out.println("Divisible entre 5");
}


RECUERDA:
% calcula el resto de una division.
Si el resto es 0, es divisible.


==========================================================
4. SWITCH
==========================================================

SE USA SI TE PIDEN:
- Crear un menu de opciones.
- Elegir una operacion.
- Ejecutar diferentes acciones segun una opcion.

ESTRUCTURA:

switch (opcio) {
    case 1:
        // Codigo
        break;

    case 2:
        // Codigo
        break;

    default:
        // Si ninguna opcion coincide
        break;
}


EJEMPLO:

System.out.println("1. Sumar");
System.out.println("2. Restar");
System.out.println("3. Multiplicar");

int opcio = sc.nextInt();

switch (opcio) {
    case 1:
        System.out.println("Suma");
        break;

    case 2:
        System.out.println("Resta");
        break;

    case 3:
        System.out.println("Multiplicacio");
        break;

    default:
        System.out.println("Opcio incorrecta");
        break;
}


==========================================================
5. OPERADOR TERNARIO
==========================================================

SE USA SI TE PIDEN:
- Hacer una comprobacion sencilla.
- Elegir entre dos resultados.
- Sustituir un if-else sencillo.

ESTRUCTURA:

variable = condicion ? resultadoVerdadero : resultadoFalso;


EJEMPLO: PAR O IMPAR

String resultado = numero % 2 == 0 ? "Parell" : "Senar";


EJEMPLO: MAYOR O MENOR DE EDAD

String resultado = edad >= 18 ? "Major d'edat" : "Menor d'edat";


==========================================================
6. BUCLE FOR
==========================================================

SE USA SI TE PIDEN:
- Repetir una accion un numero determinado de veces.
- Contar del 1 al 10.
- Repetir 5 veces.
- Recorrer una cantidad concreta de elementos.

ESTRUCTURA:

for (int i = 0; i < 10; i++) {
    // Codigo que se repite
}


EJEMPLO: MOSTRAR DEL 1 AL 10

for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}


EJEMPLO: SUMAR DEL 1 AL 10

int suma = 0;

for (int i = 1; i <= 10; i++) {
    suma = suma + i;
}

System.out.println("Suma: " + suma);


EJEMPLO: CONTAR NUMEROS PARES

int contador = 0;

for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        contador++;
    }
}

System.out.println("Parells: " + contador);


==========================================================
7. BUCLE WHILE
==========================================================

SE USA SI TE PIDEN:
- Repetir mientras se cumpla una condicion.
- No se sabe cuantas veces se repetira.
- Repetir hasta que ocurra algo.

ESTRUCTURA:

while (condicion) {
    // Codigo que se repite
}


EJEMPLO: PEDIR NUMEROS MIENTRAS SEAN POSITIVOS

System.out.println("Introdueix un numero:");
int numero = sc.nextInt();

while (numero > 0) {

    System.out.println("Numero positiu");

    System.out.println("Introdueix un altre numero:");
    numero = sc.nextInt();
}


EJEMPLO: CONTAR HASTA 10

int contador = 0;

while (contador < 10) {
    contador++;
    System.out.println(contador);
}


==========================================================
8. BUCLE DO WHILE
==========================================================

SE USA SI TE PIDEN:
- Ejecutar algo al menos una vez.
- Mostrar un menu que se repita.
- Volver a pedir un dato hasta que sea correcto.
- Repetir hasta que el usuario decida salir.

ESTRUCTURA:

do {
    // Codigo que se ejecuta
} while (condicion);


EJEMPLO: MENU HASTA ELEGIR SALIR

int opcio;

do {
    System.out.println("1. Opcio 1");
    System.out.println("2. Opcio 2");
    System.out.println("3. Sortir");

    opcio = sc.nextInt();

} while (opcio != 3);


EJEMPLO: PEDIR UN NUMERO ENTRE 1 Y 10

int numero;

do {
    System.out.println("Introdueix un numero entre 1 i 10:");
    numero = sc.nextInt();

} while (numero < 1 || numero > 10);


==========================================================
9. CONTADORES Y ACUMULADORES
==========================================================

SE USA SI TE PIDEN:
- Contar cuantas veces ocurre algo.
- Sumar varios numeros.
- Calcular una media.
- Contar resultados que cumplen una condicion.


CONTADOR:
Aumenta normalmente de uno en uno.

int contador = 0;
contador++;


ACUMULADOR:
Guarda una suma.

int suma = 0;
suma = suma + numero;


EJEMPLO: PEDIR 5 NUMEROS Y SUMARLOS

int suma = 0;

for (int i = 1; i <= 5; i++) {

    System.out.println("Introdueix un numero:");
    int numero = sc.nextInt();

    suma = suma + numero;
}

System.out.println("Suma total: " + suma);


EJEMPLO: CALCULAR LA MEDIA DE 3 NOTAS

double suma = 0;

for (int i = 1; i <= 3; i++) {

    System.out.println("Introdueix una nota:");
    double nota = sc.nextDouble();

    suma = suma + nota;
}

double media = suma / 3;

System.out.println("Mitjana: " + media);


==========================================================
10. STRINGS: TRABAJAR CON TEXTO
==========================================================

SE USA SI TE PIDEN:
- Analizar palabras.
- Comparar textos.
- Contar letras.
- Comprobar si dos palabras son iguales.
- Transformar un texto.


METODOS IMPORTANTES:

texto.length()              // Numero de caracteres
texto.charAt(0)             // Caracter de la posicion 0
texto.equals("Hola")        // Comparar textos
texto.equalsIgnoreCase("hola") // Comparar sin distinguir mayusculas
texto.toUpperCase()         // Pasar a mayusculas
texto.toLowerCase()         // Pasar a minusculas
texto.trim()                // Quitar espacios de los extremos


EJEMPLO: COMPARAR DOS TEXTOS

if (texto.equals("Hola")) {
    System.out.println("Text correcte");
} else {
    System.out.println("Text incorrecte");
}


EJEMPLO: CONTAR LETRAS

System.out.println("Nombre de lletres: " + texto.length());


EJEMPLO: RECORRER UNA PALABRA

for (int i = 0; i < texto.length(); i++) {
    System.out.println(texto.charAt(i));
}


IMPORTANTE:
Para comparar Strings utiliza .equals().
No utilices == para comparar el contenido de dos textos.


==========================================================
11. CHAR: TRABAJAR CON CARACTERES
==========================================================

SE USA SI TE PIDEN:
- Comprobar si un caracter es una letra.
- Comprobar si es un numero.
- Saber si es mayuscula o minuscula.
- Analizar una letra.


DECLARAR UN CHAR:

char letra = 'A';


COMPROBAR SI ES UNA LETRA:

if (Character.isLetter(letra)) {
    System.out.println("Es una lletra");
}


COMPROBAR SI ES UN NUMERO:

if (Character.isDigit(letra)) {
    System.out.println("Es un numero");
}


COMPROBAR MAYUSCULAS Y MINUSCULAS:

if (Character.isUpperCase(letra)) {
    System.out.println("Majuscula");
}

if (Character.isLowerCase(letra)) {
    System.out.println("Minuscula");
}


CONVERTIR:

letra = Character.toUpperCase(letra);
letra = Character.toLowerCase(letra);


==========================================================
12. RECORRER UN STRING Y CONTAR VOCALES
==========================================================

SE USA SI TE PIDEN:
- Contar vocales.
- Contar consonantes.
- Contar letras.
- Buscar caracteres dentro de una palabra.

EJEMPLO: CONTAR VOCALES

String texto = "Hola que tal";
int contador = 0;

for (int i = 0; i < texto.length(); i++) {

    char letra = Character.toLowerCase(texto.charAt(i));

    if (letra == 'a' || letra == 'e' || letra == 'i'
            || letra == 'o' || letra == 'u') {

        contador++;
    }
}

System.out.println("Vocals: " + contador);


==========================================================
13. EXCEPCIONES: TRY Y CATCH
==========================================================

SE USA SI TE PIDEN:
- Controlar errores.
- Evitar que el programa se cierre.
- Controlar datos introducidos incorrectamente.
- Controlar una division entre cero.

ESTRUCTURA:

try {
    // Codigo que puede provocar un error

} catch (Exception e) {
    // Codigo si ocurre un error
}


EJEMPLO: CONTROLAR UN NUMERO ENTERO

try {

    System.out.println("Introdueix un numero:");
    int numero = sc.nextInt();

    System.out.println("Has introduit: " + numero);

} catch (InputMismatchException e) {

    System.out.println("Has d'introduir un numero enter");
    sc.nextLine();
}


EJEMPLO: CONTROLAR UNA DIVISION ENTRE CERO

try {

    int resultado = numero1 / numero2;
    System.out.println("Resultat: " + resultado);

} catch (ArithmeticException e) {

    System.out.println("No es pot dividir entre zero");
}


EXCEPCIONES HABITUALES:

InputMismatchException:
Se introduce un tipo de dato incorrecto.

ArithmeticException:
Se intenta dividir entre cero.

NumberFormatException:
Se intenta convertir un texto no valido a numero.

Exception:
Captura errores generales.


==========================================================
14. FORZAR EXCEPCIONES CON THROW
==========================================================

SE USA SI TE PIDEN:
- Provocar un error si un dato no cumple una condicion.
- Mostrar un mensaje de error personalizado.
- Forzar una excepcion.

ESTRUCTURA:

if (condicionIncorrecta) {
    throw new IllegalArgumentException("Missatge d'error");
}


EJEMPLO: EDAD MINIMA DE 18 AÑOS

try {

    System.out.println("Introdueix la teva edat:");
    int edad = sc.nextInt();

    if (edad < 18) {
        throw new IllegalArgumentException("Acces denegat");
    }

    System.out.println("Acces permes");

} catch (IllegalArgumentException e) {

    System.out.println(e.getMessage());
}


==========================================================
15. VALIDAR DATOS HASTA QUE SEAN CORRECTOS
==========================================================

SE USA SI TE PIDEN:
- Pedir un dato hasta que sea correcto.
- Comprobar que este dentro de un rango.
- Evitar numeros negativos.
- Repetir una pregunta si el dato no es valido.

EJEMPLO: NUMERO ENTRE 1 Y 10

int numero;

do {

    System.out.println("Introdueix un numero:");
    numero = sc.nextInt();

    if (numero < 1 || numero > 10) {
        System.out.println("Numero incorrecte");
    }

} while (numero < 1 || numero > 10);


==========================================================
16. NUMEROS ALEATORIOS CON RANDOM
==========================================================

SE USA SI TE PIDEN:
- Generar numeros aleatorios.
- Crear un juego de adivinanzas.
- Obtener valores al azar.

DECLARAR RANDOM:

Random random = new Random();


EJEMPLOS:

// Numero entre 0 y 9
int numero1 = random.nextInt(10);

// Numero entre 1 y 10
int numero2 = random.nextInt(10) + 1;

// Numero entre 1 y 100
int numero3 = random.nextInt(100) + 1;


EJEMPLO: JUEGO DE ADIVINANZAS

Random random = new Random();

int secreto = random.nextInt(10) + 1;
int numero;

System.out.println("Endevina el numero entre 1 i 10:");
numero = sc.nextInt();

while (numero != secreto) {

    System.out.println("Torna-ho a intentar:");
    numero = sc.nextInt();
}

System.out.println("Has encertat!");


==========================================================
17. CREAR UN STRING ALEATORIO
==========================================================

SE USA SI TE PIDEN:
- Crear una palabra aleatoria.
- Generar una contraseña sencilla.
- Crear caracteres aleatorios.

EJEMPLO: PALABRA DE 5 LETRAS

Random random = new Random();

String texto = "";

for (int i = 0; i < 5; i++) {

    char letra = (char) (random.nextInt(26) + 'a');

    texto = texto + letra;
}

System.out.println(texto);


==========================================================
18. BUCLES ANIDADOS
==========================================================

SE USAN SI TE PIDEN:
- Crear tablas.
- Dibujar cuadrados o rectangulos.
- Crear triangulos con asteriscos.
- Repetir una accion dentro de otra repeticion.

EJEMPLO: RECTANGULO

for (int i = 0; i < 3; i++) {

    for (int j = 0; j < 4; j++) {
        System.out.print("* ");
    }

    System.out.println();
}


RESULTADO:

* * * *
* * * *
* * * *


EJEMPLO: TRIANGULO

for (int i = 1; i <= 5; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }

    System.out.println();
}


==========================================================
19. ENCONTRAR EL NUMERO MAYOR Y MENOR
==========================================================

SE USA SI TE PIDEN:
- Introducir varios numeros.
- Encontrar el mas grande.
- Encontrar el mas pequeño.

EJEMPLO:

int mayor = Integer.MIN_VALUE;
int menor = Integer.MAX_VALUE;

for (int i = 1; i <= 5; i++) {

    System.out.println("Introdueix un numero:");
    int numero = sc.nextInt();

    if (numero > mayor) {
        mayor = numero;
    }

    if (numero < menor) {
        menor = numero;
    }
}

System.out.println("Major: " + mayor);
System.out.println("Menor: " + menor);


==========================================================
20. MENU COMPLETO
==========================================================

SE USA SI TE PIDEN:
- Crear un programa con varias opciones.
- Mostrar un menu.
- Permitir repetir las opciones.
- Salir cuando el usuario elija una opcion concreta.

CODIGO COMPLETO:

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcio;

        do {

            System.out.println("===== MENU =====");
            System.out.println("1. Opcio 1");
            System.out.println("2. Opcio 2");
            System.out.println("3. Sortir");

            System.out.println("Escull una opcio:");
            opcio = sc.nextInt();

            switch (opcio) {

                case 1:
                    System.out.println("Has escollit l'opcio 1");
                    break;

                case 2:
                    System.out.println("Has escollit l'opcio 2");
                    break;

                case 3:
                    System.out.println("Sortint del programa...");
                    break;

                default:
                    System.out.println("Opcio incorrecta");
                    break;
            }

        } while (opcio != 3);
    }
}


==========================================================
21. COMO IDENTIFICAR QUE ESTRUCTURA UTILIZAR
==========================================================

SI EL ENUNCIADO DICE...       UTILIZA...

Pide al usuario...            Scanner
Comprueba si...               if / else
Es par o impar...             if + %
Segun la opcion...             switch
Repite 10 veces...             for
Mientras sea mayor...          while
Repite hasta que...            do while
Suma varios numeros...         Acumulador
Cuenta cuantas veces...        Contador
Calcula la media...            Acumulador + division
Busca el mayor o menor...      if + variable mayor/menor
Cuenta las letras...           String.length()
Comprueba cada letra...        charAt() + for
Comprueba si es una vocal...   char + if
Controla los errores...        try / catch
Fuerza un error si...          throw
Genera un numero aleatorio...  Random
Genera una palabra aleatoria... Random + for
Crea un cuadrado o triangulo... Bucles anidados
Muestra un menu hasta salir... do while + switch


==========================================================
CONSEJOS PARA EL EXAMEN
==========================================================

1. Lee el enunciado y subraya que te pide.
2. Identifica si necesitas Scanner, if, switch o un bucle.
3. Declara las variables antes de utilizarlas.
4. Si tienes que repetir un numero concreto de veces, usa for.
5. Si tienes que repetir hasta que ocurra algo, usa while o do while.
6. Si tienes que contar, utiliza un contador.
7. Si tienes que sumar, utiliza un acumulador.
8. Si trabajas con texto, recuerda utilizar equals() para comparar.
9. Si tienes que controlar errores, utiliza try y catch.
10. Comprueba que los nombres de las variables coinciden.

==========================================================
FIN DE LOS APUNTES
==========================================================
        */
    }
    
}
