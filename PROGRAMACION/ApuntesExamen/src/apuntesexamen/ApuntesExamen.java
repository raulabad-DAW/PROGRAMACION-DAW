/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntesexamen;

/**
 *
 * @author r.abad
 */
public class ApuntesExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        ESTRUCTURA MENU SWITCH CON EXCEPCIONES: 
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
 
        do {
            try {
                System.out.println();
                System.out.println("===== MENU =====");
                System.out.println("1. Opcion 1");
                System.out.println("2. Opcion 2");
                System.out.println("3. Opcion 3");
                System.out.println("4. Salir");
                System.out.print("Elige una opcion: ");
 
                opcion = sc.nextInt();
                sc.nextLine();
 
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Has elegido la opcion 1");
                    }
                    case 2 -> {
                        System.out.println("Has elegido la opcion 2");
                    }
                    case 3 -> {
                        System.out.println("Has elegido la opcion 3");
                    }
                    case 4 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Error: opcion no valida (elige de 1 a 4)");
                }
 
            } catch (InputMismatchException e) {
                System.out.println("Error: solo puedes introducir numeros enteros");
                sc.nextLine();
                opcion = 0;
            }
 
        } while (opcion != 4);
 
        sc.close();
        
        =====================================================================
              APUNTES COMPLETOS JAVA - EXAMEN RA1, RA2 Y RA3
=====================================================================

INDICE:
  0. Plantilla principal
  1. Variables y tipos de datos
  2. Scanner y entrada de datos
  3. Operaciones matematicas
  4. Condicionales IF / ELSE
  5. SWITCH
  6. Operador ternario
  7. Bucles FOR, WHILE y DO-WHILE
  8. Contadores y acumuladores
  9. Numeros pares, impares, positivos y negativos
 10. Numeros mayores, menores y medias
 11. Strings y CHAR
 12. Recorrer y analizar palabras
 13. Clasificar caracteres
 14. Validar textos y codigos
 15. Excepciones TRY / CATCH
 16. Forzar excepciones THROW
 17. Validaciones con excepciones
 18. Random y numeros aleatorios
 19. Menus completos
 20. Ejercicios combinados
 21. Errores tipicos
 22. Como elegir la estructura correcta

=====================================================================
0. PLANTILLA PRINCIPAL
=====================================================================

CUANDO SE UTILIZA:
Al empezar cualquier ejercicio Java. Es la estructura basica
que necesita un programa para funcionar.

IMPORTS:
Se escriben ANTES de la clase. Solo hay que importar las clases
que se utilicen en el ejercicio.

Scanner: permite pedir datos al usuario.
InputMismatchException: permite controlar errores de Scanner.
Random: permite generar numeros aleatorios.

ESTRUCTURA:

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Aqui se escribe el ejercicio.

    }
}

TRUCOS DE NETBEANS:
sout + TAB: escribe System.out.println()
Alt + Shift + F: ordena y formatea el codigo.
Alt + Shift + I: intenta corregir los imports.


=====================================================================
1. VARIABLES Y TIPOS DE DATOS
=====================================================================

CUANDO SE UTILIZA:
Cuando necesitamos guardar informacion para utilizarla despues.

int:
Guarda numeros enteros, sin decimales.

double:
Guarda numeros con decimales.

String:
Guarda texto, palabras o frases.

char:
Guarda un unico caracter. Utiliza comillas simples.

boolean:
Guarda true o false.

EJEMPLOS:

int edad = 18;
double precio = 25.50;
String nombre = "Albert";
char letra = 'A';
boolean correcto = true;

IMPORTANTE:
La variable debe declararse antes de utilizarse.
No se puede utilizar una variable que no existe o que esta
fuera del bloque donde se ha declarado.


=====================================================================
2. SCANNER Y ENTRADA DE DATOS
=====================================================================

CUANDO SE UTILIZA:
Cuando el programa necesita que el usuario introduzca informacion.

LEER UN ENTERO:
Se utiliza cuando se pide un numero sin decimales.

int n = sc.nextInt();

LEER UN DECIMAL:
Se utiliza para precios, notas o cantidades decimales.

double n = sc.nextDouble();

LEER UNA PALABRA:
Se utiliza cuando no necesitamos espacios.

String palabra = sc.next();

LEER UNA FRASE:
Se utiliza cuando el usuario puede escribir varias palabras.

String frase = sc.nextLine();

LEER UN CARACTER:
Se utiliza cuando solo necesitamos una letra o caracter.

char c = sc.nextLine().charAt(0);

LEER UN BOOLEAN:

boolean valor = sc.nextBoolean();

PROBLEMA DEL BUFFER:
Despues de nextInt() o nextDouble(), queda un ENTER pendiente.
Si despues utilizamos nextLine(), puede leer una linea vacia.

SOLUCION:
Poner un nextLine() adicional para limpiar el buffer.

int edad = sc.nextInt();
sc.nextLine();

String nombre = sc.nextLine();

IMPORTANTE:
No hace falta limpiar el buffer si estamos utilizando
solamente nextLine().


=====================================================================
3. OPERACIONES MATEMATICAS
=====================================================================

CUANDO SE UTILIZA:
Cuando el enunciado pide calcular cantidades, resultados,
precios, porcentajes, medias o conversiones.

OPERADORES:

+  Sumar.
-  Restar.
*  Multiplicar.
/  Dividir.
%  Obtener el resto de una division.

EJEMPLO:

int a = 10;
int b = 5;

int suma = a + b;
int resta = a - b;
int multiplicacion = a * b;
int division = a / b;
int resto = a % b;

CALCULAR UNA MEDIA:
Se utiliza cuando hay que calcular el promedio de varios valores.

double media = (n1 + n2 + n3) / 3.0;

IMPORTANTE:
Si divides dos enteros, Java devuelve un entero.
Utiliza 3.0 para obtener decimales.

CALCULAR UN PORCENTAJE:
Se utiliza para descuentos, IVA o porcentajes.

double precio = 100;
double descuento = 20;

double resultado = precio * descuento / 100;

PRECIO CON DESCUENTO:

double precioFinal = precio - (precio * descuento / 100);

INTERCAMBIAR DOS VARIABLES:
Se utiliza cuando hay que intercambiar los valores de dos variables.

int aux = a;
a = b;
b = aux;

CONVERTIR SEGUNDOS EN HORAS, MINUTOS Y SEGUNDOS:

int segundos = sc.nextInt();

int horas = segundos / 3600;
int minutos = (segundos % 3600) / 60;
int restantes = segundos % 60;


=====================================================================
4. CONDICIONALES IF / ELSE
=====================================================================

CUANDO SE UTILIZA:
Cuando el programa tiene que tomar decisiones dependiendo
de una condicion.

ESTRUCTURA:

if (condicion) {
    // Se ejecuta si la condicion es verdadera.
} else {
    // Se ejecuta si la condicion es falsa.
}

CUANDO HAY MAS DE DOS POSIBILIDADES:
Se utiliza else if para comprobar otras condiciones.

if (nota >= 9) {
    System.out.println("Excel·lent");
} else if (nota >= 5) {
    System.out.println("Aprovat");
} else {
    System.out.println("Suspès");
}

OPERADORES DE COMPARACION:

<   Menor que.
>   Mayor que.
<=  Menor o igual.
>=  Mayor o igual.
==  Igual.
!=  Diferente.

OPERADORES LOGICOS:

&&  AND: se deben cumplir las dos condiciones.
||  OR: basta con que se cumpla una condicion.
!   NOT: niega una condicion.

COMPROBAR UN RANGO:
Se utiliza cuando un numero debe estar entre dos valores.

if (n >= 1 && n <= 10) {
    System.out.println("Correcte");
}

COMPROBAR QUE ESTA FUERA DE UN RANGO:

if (n < 1 || n > 10) {
    System.out.println("Incorrecte");
}

NUMERO PAR O IMPAR:
Se utiliza el resto de la division entre 2.

if (n % 2 == 0) {
    System.out.println("Parell");
} else {
    System.out.println("Senar");
}

POSITIVO, NEGATIVO O CERO:

if (n > 0) {
    System.out.println("Positiu");
} else if (n < 0) {
    System.out.println("Negatiu");
} else {
    System.out.println("Zero");
}

COMPARAR STRINGS:
Nunca se deben comparar Strings con ==.
Se utiliza equals() para comparar su contenido.

if (nombre.equals("Albert")) {
    System.out.println("Correcte");
}

equalsIgnoreCase() ignora mayusculas y minusculas.

if (nombre.equalsIgnoreCase("albert")) {
    System.out.println("Correcte");
}

IMPORTANTE:
Cuando hay varios else if, coloca primero las condiciones
mas restrictivas para evitar que otra condicion las capture antes.


=====================================================================
5. SWITCH
=====================================================================

CUANDO SE UTILIZA:
Cuando tenemos varias opciones y queremos ejecutar una accion
diferente dependiendo del valor introducido.

Se utiliza mucho en menus.

SWITCH CON NUMEROS:

switch (opcio) {

    case 1 -> System.out.println("Opcio 1");
    case 2 -> System.out.println("Opcio 2");
    case 3 -> System.out.println("Opcio 3");

    default -> System.out.println("Opcio incorrecta");
}

SWITCH CON LETRAS:
Se utiliza cuando las opciones son caracteres.

switch (opcio) {

    case 'a' -> System.out.println("Opcio A");
    case 'b' -> System.out.println("Opcio B");

    default -> System.out.println("Opcio incorrecta");
}

SWITCH CON STRINGS:

switch (opcio) {

    case "arxiu" -> System.out.println("Arxiu");
    case "buscar" -> System.out.println("Buscar");

    default -> System.out.println("Opcio incorrecta");
}

SWITCH CLASICO:
Se utiliza cuando se trabaja con la estructura tradicional.
Necesita break para evitar que continue al siguiente caso.

switch (opcio) {

    case 1:
        System.out.println("Opcio 1");
        break;

    case 2:
        System.out.println("Opcio 2");
        break;

    default:
        System.out.println("Error");
        break;
}

IMPORTANTE:
Switch funciona con int, char y String, pero no con double.


=====================================================================
6. OPERADOR TERNARIO
=====================================================================

CUANDO SE UTILIZA:
Cuando tenemos una condicion sencilla y queremos guardar
uno de dos resultados en una variable.

ESTRUCTURA:

condicion ? resultadoSiVerdadero : resultadoSiFalso;

MAYOR O MENOR DE EDAD:

String resultado = (edad >= 18) ? "Major" : "Menor";

PAR O IMPAR:

String resultado = (n % 2 == 0) ? "Parell" : "Senar";

MAYOR ENTRE DOS NUMEROS:

int mayor = (a > b) ? a : b;

DESCUENTO:

double finalPrecio = (precio > 50) ? precio * 0.9 : precio;

IMPORTANTE:
El ternario sustituye un if/else sencillo.
No es recomendable utilizarlo para muchas condiciones complicadas.


=====================================================================
7. BUCLES FOR, WHILE Y DO-WHILE
=====================================================================

FOR:
CUANDO SE UTILIZA:
Cuando sabemos cuantas veces queremos repetir una accion.

EJEMPLO: repetir 10 veces.

for (int i = 0; i < 10; i++) {
    System.out.println(i);
}

VARIANTES:

// Del 1 al 100.
for (int i = 1; i <= 100; i++)

// Contar hacia atras.
for (int i = 10; i >= 1; i--)

// De 5 en 5.
for (int i = 5; i <= 100; i += 5)

// Solo numeros pares.
for (int i = 2; i <= 100; i += 2)

// Abecedario.
for (char c = 'a'; c <= 'z'; c++)

WHILE:
CUANDO SE UTILIZA:
Cuando no sabemos cuantas veces se repetira el bucle.
Comprueba la condicion ANTES de ejecutar el codigo.
Puede no ejecutarse nunca.

EJEMPLO: pedir numeros hasta introducir cero.

int n = -1;

while (n != 0) {

    n = sc.nextInt();

}

DO-WHILE:
CUANDO SE UTILIZA:
Cuando queremos que el codigo se ejecute COMO MINIMO una vez.
Comprueba la condicion DESPUES de ejecutar el codigo.
Se utiliza mucho en menus y validaciones.

EJEMPLO:

int opcio;

do {

    System.out.println("1. Continuar");
    System.out.println("2. Sortir");

    opcio = sc.nextInt();

} while (opcio != 2);

IMPORTANTE:
Do-while lleva un punto y coma al final.

CONTADOR:
Se utiliza para contar cuantas veces sucede algo.

int contador = 0;
contador++;

ACUMULADOR:
Se utiliza para sumar diferentes cantidades.

int suma = 0;
suma += n;

BANDERA:
Se utiliza para controlar si un bucle debe continuar.

boolean seguir = true;

while (seguir) {

    // Codigo.

    seguir = false; // Cuando queremos terminar.
}

BREAK:
Se utiliza para salir completamente de un bucle.

CONTINUE:
Se utiliza para saltar una repeticion y continuar con la siguiente.

BUCLE DENTRO DE OTRO BUCLE:
Se utiliza para crear piramides, filas, columnas y tablas.

for (int i = 1; i <= 5; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }

    System.out.println();
}

TABLA DE MULTIPLICAR:
Se utiliza cuando hay que mostrar las multiplicaciones
de un numero.

for (int i = 1; i <= 10; i++) {
    System.out.println(n + " x " + i + " = " + (n * i));
}

IMPORTANTE:
En un while hay que actualizar la variable de control.
Si no, puede producirse un bucle infinito.


=====================================================================
8. CONTADORES Y ACUMULADORES
=====================================================================

CONTADOR:
CUANDO SE UTILIZA:
Cuando el enunciado pide contar elementos que cumplen
una condicion.

int contador = 0;

for (int i = 0; i < 5; i++) {

    int n = sc.nextInt();

    if (n > 0) {
        contador++;
    }
}

System.out.println("Quantitat: " + contador);

ACUMULADOR:
CUANDO SE UTILIZA:
Cuando el enunciado pide sumar diferentes numeros.

int suma = 0;

for (int i = 0; i < 5; i++) {

    int n = sc.nextInt();

    suma += n;
}

System.out.println("Suma: " + suma);

MEDIA:
CUANDO SE UTILIZA:
Cuando hay que calcular el promedio de varios numeros.

double media = suma / 5.0;

IMPORTANTE:
Contador cuenta elementos.
Acumulador suma valores.


=====================================================================
9. NUMEROS PARES, IMPARES, POSITIVOS Y NEGATIVOS
=====================================================================

CONTAR PARES E IMPARES:
CUANDO SE UTILIZA:
Cuando hay que introducir varios numeros y clasificarlos.

int pares = 0;
int impares = 0;

for (int i = 0; i < 10; i++) {

    int n = sc.nextInt();

    if (n % 2 == 0) {
        pares++;
    } else {
        impares++;
    }
}

System.out.println("Parells: " + pares);
System.out.println("Imparells: " + impares);

CONTAR POSITIVOS, NEGATIVOS Y CEROS:

int positivos = 0;
int negativos = 0;
int ceros = 0;

for (int i = 0; i < 5; i++) {

    int n = sc.nextInt();

    if (n > 0) {
        positivos++;
    } else if (n < 0) {
        negativos++;
    } else {
        ceros++;
    }
}


=====================================================================
10. NUMEROS MAYORES, MENORES Y MEDIAS
=====================================================================

BUSCAR EL MAYOR:
CUANDO SE UTILIZA:
Cuando nos piden encontrar el numero mas grande.

int mayor = Integer.MIN_VALUE;

for (int i = 0; i < 5; i++) {

    int n = sc.nextInt();

    if (n > mayor) {
        mayor = n;
    }
}

BUSCAR EL MENOR:
CUANDO SE UTILIZA:
Cuando nos piden encontrar el numero mas pequeño.

int menor = Integer.MAX_VALUE;

for (int i = 0; i < 5; i++) {

    int n = sc.nextInt();

    if (n < menor) {
        menor = n;
    }
}

IMPORTANTE:
Integer.MIN_VALUE y Integer.MAX_VALUE son valores iniciales
para poder comparar cualquier numero entero.

Otra opcion mas sencilla es leer el primer numero y utilizarlo
como valor inicial de mayor y menor.


=====================================================================
11. STRINGS Y CHAR
=====================================================================

CUANDO SE UTILIZA:
Cuando el ejercicio trabaja con palabras, frases, letras
o caracteres individuales.

METODOS IMPORTANTES:

length():
Devuelve la cantidad de caracteres de un String.

String palabra = "Hola";
int cantidad = palabra.length();

charAt():
Obtiene un caracter segun su posicion.
La primera posicion es 0.

char letra = palabra.charAt(0);

equals():
Compara el contenido de dos Strings.

palabra.equals("Hola");

equalsIgnoreCase():
Compara ignorando mayusculas y minusculas.

palabra.equalsIgnoreCase("hola");

toUpperCase():
Convierte todo el texto a mayusculas.

palabra.toUpperCase();

toLowerCase():
Convierte todo el texto a minusculas.

palabra.toLowerCase();

trim():
Elimina espacios al principio y al final.

palabra.trim();

isEmpty():
Comprueba si el String esta vacio.

palabra.isEmpty();

substring():
Obtiene una parte del texto.

palabra.substring(1, 3);

contains():
Comprueba si un texto contiene otro.

palabra.contains("ol");

CONVERTIR STRING A ENTERO:

int n = Integer.parseInt("25");

CONVERTIR STRING A DECIMAL:

double n = Double.parseDouble("10.5");

IMPORTANTE:
parseInt y parseDouble pueden provocar NumberFormatException
si el texto no representa un numero.


=====================================================================
12. RECORRER Y ANALIZAR PALABRAS
=====================================================================

CUANDO SE UTILIZA:
Cuando necesitamos analizar cada caracter de una palabra.
Normalmente se utiliza un for con length() y charAt().

RECORRER UNA PALABRA:

String palabra = sc.nextLine();

for (int i = 0; i < palabra.length(); i++) {

    char c = palabra.charAt(i);

    System.out.println(c);
}

CONTAR VOCALES:

int vocales = 0;

for (int i = 0; i < palabra.length(); i++) {

    char c = Character.toLowerCase(palabra.charAt(i));

    if (c == 'a' || c == 'e' || c == 'i'
        || c == 'o' || c == 'u') {

        vocales++;
    }
}

CONTAR CONSONANTES:

int consonantes = 0;

for (int i = 0; i < palabra.length(); i++) {

    char c = Character.toLowerCase(palabra.charAt(i));

    if (Character.isLetter(c)
        && c != 'a' && c != 'e' && c != 'i'
        && c != 'o' && c != 'u') {

        consonantes++;
    }
}

DETECTAR LETRAS DOBLES:
CUANDO SE UTILIZA:
Cuando el enunciado pide encontrar dos letras iguales seguidas.

boolean dobles = false;

for (int i = 0; i < palabra.length() - 1; i++) {

    if (palabra.charAt(i) == palabra.charAt(i + 1)) {
        dobles = true;
    }
}

IMPORTANTE:
El bucle termina en length() - 1 porque se compara
la posicion actual con la siguiente.
Si no, charAt(i + 1) puede salirse del String.


=====================================================================
13. CLASIFICAR CARACTERES
=====================================================================

CUANDO SE UTILIZA:
Cuando el ejercicio pide reconocer si un caracter es:
una letra, un numero, una mayuscula, una minuscula o un simbolo.

METODOS DE CHARACTER:

Character.isLetter(c):
Comprueba si es una letra.

Character.isDigit(c):
Comprueba si es un numero del 0 al 9.

Character.isUpperCase(c):
Comprueba si es una mayuscula.

Character.isLowerCase(c):
Comprueba si es una minuscula.

Character.toLowerCase(c):
Convierte el caracter a minuscula.

Character.toUpperCase(c):
Convierte el caracter a mayuscula.

CLASIFICAR UN CARACTER:

char c = sc.nextLine().charAt(0);

if (Character.isLetter(c)) {
    System.out.println("Es una lletra");

} else if (Character.isDigit(c)) {
    System.out.println("Es un numero");

} else {
    System.out.println("Es un simbol");
}

CONTAR DIFERENTES TIPOS DE CARACTERES:

int letras = 0;
int numeros = 0;
int mayusculas = 0;
int minusculas = 0;

String texto = sc.nextLine();

for (int i = 0; i < texto.length(); i++) {

    char c = texto.charAt(i);

    if (Character.isDigit(c)) {
        numeros++;

    } else if (Character.isUpperCase(c)) {
        mayusculas++;

    } else if (Character.isLowerCase(c)) {
        minusculas++;
    }

    if (Character.isLetter(c)) {
        letras++;
    }
}

IMPORTANTE:
Los espacios y simbolos no se cuentan como letras ni numeros.


=====================================================================
14. VALIDAR TEXTOS Y CODIGOS
=====================================================================

CUANDO SE UTILIZA:
Cuando el enunciado pide comprobar que una palabra, contraseña
o codigo tiene unas caracteristicas determinadas.

COMPROBAR LONGITUD MINIMA:

if (palabra.length() < 3) {
    System.out.println("Paraula massa curta");
}

COMPROBAR QUE SOLO HAY UNA LETRA:

if (texto.length() != 1 || !Character.isLetter(texto.charAt(0))) {
    System.out.println("No es una lletra");
}

IMPORTANTE:
Esta comprobacion primero verifica que existe un solo caracter.
Asi evitamos utilizar charAt(0) con un String vacio.

CODIGO DE UNA MAYUSCULA Y CUATRO NUMEROS:

String codigo = sc.nextLine();

if (codigo.length() == 5
    && Character.isUpperCase(codigo.charAt(0))) {

    boolean correcto = true;

    for (int i = 1; i < 5; i++) {

        if (!Character.isDigit(codigo.charAt(i))) {
            correcto = false;
        }
    }

    if (correcto) {
        System.out.println("Codi correcte");
    }
}


=====================================================================
15. EXCEPCIONES TRY / CATCH
=====================================================================

CUANDO SE UTILIZA:
Cuando una instruccion puede producir un error durante
la ejecucion y queremos controlar ese error.

ESTRUCTURA:

try {

    // Codigo que puede fallar.

} catch (TipoExcepcion e) {

    // Codigo que se ejecuta cuando aparece ese error.

}

EXCEPCIONES IMPORTANTES:

InputMismatchException:
Cuando nextInt() o nextDouble() recibe un dato incorrecto.

NumberFormatException:
Cuando parseInt() o parseDouble() no puede convertir un texto.

ArithmeticException:
Cuando se realiza una division entera entre cero.

StringIndexOutOfBoundsException:
Cuando charAt() intenta acceder a una posicion inexistente.

NullPointerException:
Cuando intentamos utilizar un objeto que tiene valor null.

ArrayIndexOutOfBoundsException:
Cuando accedemos a una posicion inexistente de un array.

IllegalArgumentException:
Cuando nosotros forzamos una excepcion por un valor incorrecto.

CAPTURAR UN ERROR DE SCANNER:

try {

    int n = sc.nextInt();

} catch (InputMismatchException e) {

    System.out.println("Has d'introduir un numero");
    sc.nextLine();
}

IMPORTANTE:
Si nextInt() falla, el dato incorrecto sigue en el buffer.
Hay que limpiarlo con nextLine() para evitar repetir el error.

CAPTURAR UNA DIVISION ENTRE CERO:

try {

    int resultado = a / b;

} catch (ArithmeticException e) {

    System.out.println("No es pot dividir entre zero");
}

CAPTURAR UNA CONVERSION INCORRECTA:

try {

    int n = Integer.parseInt(texto);

} catch (NumberFormatException e) {

    System.out.println("El text no es un numero");
}

ORDEN DE LOS CATCH:
Los errores mas especificos deben ir primero.
Los mas generales deben ir al final.

MULTI-CATCH:
Se utiliza cuando diferentes excepciones necesitan mostrar
el mismo mensaje y ejecutar el mismo codigo.

catch (InputMismatchException | ArithmeticException e) {
    System.out.println("Error");
}

FINALLY:
Se utiliza cuando queremos ejecutar un codigo siempre,
tanto si se produce un error como si no.

finally {
    System.out.println("Final del programa");
}


=====================================================================
16. FORZAR EXCEPCIONES THROW
=====================================================================

CUANDO SE UTILIZA:
Cuando el enunciado pide que nosotros provoquemos una excepcion
si el usuario introduce un dato que no cumple las condiciones.

ESTRUCTURA:

if (condicionIncorrecta) {
    throw new IllegalArgumentException("Missatge d'error");
}

EJEMPLO: EDAD MENOR DE 18:

try {

    int edad = sc.nextInt();

    if (edad < 18) {
        throw new IllegalArgumentException(
            "Acces denegat: Has de ser major d'edat"
        );
    }

    System.out.println("Acces permes");

} catch (IllegalArgumentException e) {

    System.out.println(e.getMessage());
}

getMessage():
Se utiliza para recuperar el mensaje que hemos escrito
dentro del throw.

IMPORTANTE:
El throw debe estar dentro del try si queremos que el catch
de ese try recoja la excepcion.


=====================================================================
17. VALIDACIONES CON EXCEPCIONES
=====================================================================

CUANDO SE UTILIZA:
Cuando el ejercicio pide comprobar datos y lanzar errores
si no cumplen las condiciones.

VALIDAR UN RANGO:

try {

    int n = sc.nextInt();

    if (n < 1 || n > 10) {
        throw new IllegalArgumentException("Numero incorrecte");
    }

    System.out.println("Numero correcte");

} catch (InputMismatchException e) {

    System.out.println("Has d'introduir un numero");
    sc.nextLine();

} catch (IllegalArgumentException e) {

    System.out.println(e.getMessage());
}

VALIDAR UNA EDAD:

try {

    int edad = sc.nextInt();

    if (edad < 18) {
        throw new IllegalArgumentException("Edat incorrecta");
    }

    System.out.println("Edat correcta");

} catch (InputMismatchException e) {

    System.out.println("No has introduit un numero");
    sc.nextLine();

} catch (IllegalArgumentException e) {

    System.out.println(e.getMessage());
}

VALIDAR UNA PALABRA:

try {

    String palabra = sc.nextLine();

    if (palabra.length() < 3) {
        throw new IllegalArgumentException(
            "La paraula ha de tenir 3 caracters"
        );
    }

    System.out.println("Paraula correcta");

} catch (IllegalArgumentException e) {

    System.out.println(e.getMessage());
}

REPETIR HASTA QUE EL DATO SEA CORRECTO:

Se utiliza cuando el enunciado dice que hay que volver a pedir
el dato hasta que sea valido.

int n = 0;
boolean correcto = false;

while (!correcto) {

    try {

        n = sc.nextInt();
        sc.nextLine();

        if (n < 1 || n > 10) {
            throw new IllegalArgumentException("Numero incorrecte");
        }

        correcto = true;

    } catch (InputMismatchException e) {

        System.out.println("Introdueix un numero");
        sc.nextLine();

    } catch (IllegalArgumentException e) {

        System.out.println(e.getMessage());
    }
}

IMPORTANTE:
Si el enunciado pide que el programa se detenga al producirse
el error, no utilices un bucle para volver a preguntar.


=====================================================================
18. RANDOM Y NUMEROS ALEATORIOS
=====================================================================

CUANDO SE UTILIZA:
Cuando necesitamos generar numeros o caracteres al azar.

IMPORT:
import java.util.Random;

CREAR RANDOM:

Random random = new Random();

GENERAR UN NUMERO ENTRE 1 Y 10:

int n = random.nextInt(10) + 1;

GENERAR UN NUMERO ENTRE 0 Y 9:

int n = random.nextInt(10);

GENERAR UNA LETRA ALEATORIA:

char letra = (char) (random.nextInt(26) + 'a');

CREAR UNA PALABRA ALEATORIA:

String palabra = "";

for (int i = 0; i < 5; i++) {

    char letra = (char) (random.nextInt(26) + 'a');

    palabra += letra;
}

IMPORTANTE:
nextInt(10) genera del 0 al 9.
Si sumamos 1, genera del 1 al 10.


=====================================================================
19. MENUS COMPLETOS
=====================================================================

CUANDO SE UTILIZA:
Cuando el programa debe mostrar opciones y permitir que
el usuario elija que quiere hacer.

MENU CON SWITCH:

int opcio;

System.out.println("1. Opcio 1");
System.out.println("2. Opcio 2");
System.out.println("3. Sortir");

opcio = sc.nextInt();

switch (opcio) {

    case 1 -> System.out.println("Opcio 1");
    case 2 -> System.out.println("Opcio 2");
    case 3 -> System.out.println("Sortint...");
    default -> System.out.println("Opcio incorrecta");
}

MENU QUE SE REPITE:

int opcio;

do {

    System.out.println("1. Opcio 1");
    System.out.println("2. Opcio 2");
    System.out.println("3. Sortir");

    opcio = sc.nextInt();

    switch (opcio) {

        case 1 -> System.out.println("Opcio 1");
        case 2 -> System.out.println("Opcio 2");
        case 3 -> System.out.println("Sortint...");
        default -> System.out.println("Opcio incorrecta");
    }

} while (opcio != 3);

IMPORTANTE:
El do-while hace que el menu vuelva a aparecer.
Cuando el usuario selecciona 3, el programa termina.


=====================================================================
20. EJERCICIOS COMBINADOS
=====================================================================

JUEGO DE ADIVINAR:
Combina Random, do-while e if.
Se utiliza cuando hay que adivinar un numero aleatorio.

Random random = new Random();
int secreto = random.nextInt(10) + 1;
int intento;

do {

    intento = sc.nextInt();

    if (intento < secreto) {
        System.out.println("Mes gran");

    } else if (intento > secreto) {
        System.out.println("Mes petit");

    } else {
        System.out.println("Correcte");
    }

} while (intento != secreto);


SUMAR NUMEROS HASTA INTRODUCIR CERO:
Combina do-while y acumulador.

int n;
int suma = 0;

do {

    n = sc.nextInt();
    suma += n;

} while (n != 0);

System.out.println("Suma: " + suma);


PIRAMIDE DE NUMEROS:
Combina dos bucles for.

for (int i = 1; i <= 5; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }

    System.out.println();
}


JUEGO CON TRES INTENTOS:
Combina while, contador y String.

int intentos = 0;
boolean acertado = false;

while (intentos < 3 && !acertado) {

    String respuesta = sc.nextLine();

    intentos++;

    if (respuesta.equalsIgnoreCase("Oslo")) {
        acertado = true;
        System.out.println("Correcte");
    } else {
        System.out.println("Incorrecte");
    }
}


=====================================================================
21. ERRORES TIPICOS
=====================================================================

1. COMPARAR STRINGS CON ==:
Incorrecto: palabra == "Hola"
Correcto: palabra.equals("Hola")

2. OLVIDAR LIMPIAR EL BUFFER:
Despues de nextInt() o nextDouble(), si despues utilizas
nextLine(), limpia antes el buffer.

3. BUCLE INFINITO:
Comprueba que actualizas la variable del while.

4. DIVISION ENTERA:
5 / 2 devuelve 2.
5 / 2.0 devuelve 2.5.

5. CHAR Y STRING:
String utiliza comillas dobles: "Hola"
char utiliza comillas simples: 'a'

6. RANGO INCORRECTO:
No se escribe 1 < n < 10.
Se escribe n > 1 && n < 10.

7. CHARAT:
No accedas a una posicion que no existe.
Para comparar con el siguiente caracter, utiliza
i < palabra.length() - 1.

8. ORDEN DE LOS CATCH:
Primero las excepciones especificas.
Al final las generales.

9. DO-WHILE:
No olvides el punto y coma despues de while(condicion).

10. VARIABLES:
Declara las variables fuera del bucle si necesitas utilizarlas
despues del bucle.

11. INPUTMISMATCHEXCEPTION:
Limpia el buffer dentro del catch para eliminar el dato incorrecto.

12. MENSAJES:
Escribe exactamente los mensajes que pide el enunciado.


=====================================================================
22. COMO ELEGIR LA ESTRUCTURA CORRECTA
=====================================================================

SI EL ENUNCIADO DICE:

"Si se cumple una condicion..."
-> IF / ELSE.

"Hay diferentes opciones para elegir..."
-> SWITCH.

"Repite 10 veces..."
-> FOR.

"Repite hasta que..."
-> WHILE.

"Ejecuta como minimo una vez..."
-> DO-WHILE.

"Cuenta cuantos..."
-> CONTADOR (++).

"Calcula la suma..."
-> ACUMULADOR (+=).

"Encuentra el mayor..."
-> VARIABLE MAYOR + IF.

"Encuentra el menor..."
-> VARIABLE MENOR + IF.

"Calcula la media..."
-> SUMA / CANTIDAD.0.

"Comprueba una palabra..."
-> STRING + EQUALS.

"Recorre todos los caracteres..."
-> FOR + LENGTH + CHARAT.

"Detecta si es una letra..."
-> CHARACTER.ISLETTER.

"Detecta si es un numero..."
-> CHARACTER.ISDIGIT.

"Detecta mayusculas..."
-> CHARACTER.ISUPPERCASE.

"Genera un numero aleatorio..."
-> RANDOM.

"Controla un error..."
-> TRY / CATCH.

"Fuerza una excepcion..."
-> THROW.

"Vuelve a preguntar si hay un error..."
-> WHILE + TRY / CATCH.

"Menu que vuelve a aparecer..."
-> DO-WHILE + SWITCH.


=====================================================================
ESTRATEGIA PARA EL EXAMEN
=====================================================================

1. Lee los tres ejercicios antes de empezar.

2. Empieza por el ejercicio que entiendas mejor.

3. Identifica las palabras clave del enunciado.

4. Busca en estos apuntes la estructura que necesitas.

5. Primero consigue que funcione con datos correctos.

6. Despues añade las validaciones y excepciones.

7. Comprueba el programa con:
   - Un dato correcto.
   - Un dato incorrecto.
   - Un numero negativo.
   - Un cero.
   - Una letra cuando se espera un numero.
   - Un texto vacio cuando corresponda.

8. Comprueba que los bucles terminan correctamente.

9. No olvides los mensajes que pide el enunciado.

10. Si te bloqueas, deja el ejercicio y avanza al siguiente.

=====================================================================
                       FIN DE LOS APUNTES
=====================================================================
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        */
    }
    
}
