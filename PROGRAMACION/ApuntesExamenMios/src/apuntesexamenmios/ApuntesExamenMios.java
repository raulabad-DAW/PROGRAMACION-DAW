/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuntesexamenmios;

/**
 *
 * @author r.abad
 */
public class ApuntesExamenMios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        #####################################################################
 6. STRINGS (tipo complejo)
#####################################################################
 - String entre COMILLAS DOBLES "hola"      char entre SIMPLES 'h'
   ("a" es un String, 'a' es un char: NO son lo mismo)
 - Con Strings no se usan +, -, <, >, ==  (solo + para concatenar y =).
   Para operar se usan FUNCIONES (metodos).
 - Las posiciones empiezan en 0.  "hola": h=0  o=1  l=2  a=3
 - Los Strings son INMUTABLES: las funciones NO cambian el original,
   DEVUELVEN uno nuevo. Hay que guardar el resultado:
        frase = frase.toUpperCase();        // asi si cambia
        frase.toUpperCase();                // asi NO cambia nada
 
 String frase = "hola com va";
 
 length()            numero de caracteres
     frase.length()                 -> 11
 charAt(pos)         caracter en esa posicion (devuelve char)
     frase.charAt(0)                -> 'h'
     frase.charAt(frase.length()-1) -> 'a'     (ultimo caracter)
 concat(str)         une dos Strings (igual que +)
     frase.concat("?")              -> "hola com va?"
 contains(str)       true si contiene ese texto
     frase.contains("hola")         -> true
 trim()              quita espacios del principio y del final (no los del medio)
     "   hola com va   ".trim()     -> "hola com va"
 substring(ini)      desde ini hasta el final
     frase.substring(3)             -> "a com va"
 substring(ini, fin) desde ini hasta fin-1  (el de "fin" NO se incluye)
     frase.substring(3, 10)         -> "a com v"
 replace(a, b)       cambia TODAS las apariciones (chars o Strings)
     frase.replace('a', 'i')        -> "holi com vi"
     frase.replace("hola", "adeu")  -> "adeu com va"
     quitar espacios:  frase.replace(" ", "")      -> "holacomva"
     encadenar:  s.replace("x","a").replace("y","b")   (el orden importa)
 toUpperCase()       a MAYUSCULAS
 toLowerCase()       a minusculas
 equals(str)         ¿iguales? (distingue mayusculas)   -> true / false
     frase.equals("hola com va")    -> true
 equalsIgnoreCase(s) ¿iguales ignorando mayusculas?
 startsWith(str)     true si EMPIEZA por ese texto      ("prefijo")
     "principal".startsWith("prin") -> true
 endsWith(str)       true si TERMINA por ese texto
 indexOf(str)        posicion de la primera aparicion, o -1 si no esta
 isEmpty()           true si no tiene ningun caracter
 
 NUNCA compares Strings con ==    ->   usa  equals / equalsIgnoreCase
 La comparacion da un boolean:   boolean igual = a.equals(b);
 
 RECORRER UN STRING (muy comun: contar, buscar, invertir):
     for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         // trabajar con c
     }
   Al reves (para invertir un texto o mostrarlo desde el final):
     for (int i = s.length() - 1; i >= 0; i--) { ... s.charAt(i) ... }
   Construir un String nuevo:   resultado = resultado + c;   (empieza en "")
 
 CHARS (caracteres sueltos):
   Comparar con ==  :              c == 'a'
   Character.isDigit(c)            ¿es un numero?
   Character.isLetter(c)           ¿es una letra?
   Character.isUpperCase(c) / isLowerCase(c)
   Character.toUpperCase(c)        pasa un char a mayuscula
   ASCII:  int codigo = (int) 'A';   // 65        char letra = (char) 66;   // 'B'
   Un char se puede sumar/restar como numero:  (char) (c + 1)
 
 Convertir:
   String a int:      Integer.parseInt("12")
   String a double:   Double.parseDouble("3.5")
   int a String:      String.valueOf(12)   o   "" + 12
        
        #####################################################################
 0. COMO DECIDIR QUE ESTRUCTURA USAR  (LO MAS IMPORTANTE)
#####################################################################
 
PASO 1: ¿Tengo que REPETIR algo varias veces?
   NO  -> SELECCION (if, if-else, else if, switch, ternario)
   SI  -> BUCLE (for, while, do-while)
 
---------------------------------------------------------------------
 SELECCION: ¿cual uso?
---------------------------------------------------------------------
 "Si pasa X, haz Y" (y si no, no pasa nada) ........... if
 "Si pasa X haz Y, y si no haz Z" (2 caminos) ......... if / else
 Varios RANGOS o condiciones (notas, edades, horas,
   temperaturas, meses agrupados) ..................... if / else if / else
 Un VALOR EXACTO entre varias opciones (menu, dia 1-7,
   mes 1-12, "petita"/"mitjana"/"gran") ............... switch
 Guardar un valor en una variable segun una condicion
   simple (2 resultados, 1 linea) ..................... ternario
 
---------------------------------------------------------------------
 BUCLES: ¿cual uso?
---------------------------------------------------------------------
 SE CUANTAS VECES se repite (100 veces, de 1 a N, 5 numeros,
   tabla de multiplicar, radios de 1 a 10) ............ for
 NO SE cuantas veces: repito HASTA QUE pase algo
   (hasta que escriba 0 / negativo / acierte / "salir")
   y podria no ejecutarse ni una vez ................... while
 Igual que while pero DEBE EJECUTARSE AL MENOS 1 VEZ
   (menu, pedir un dato y validarlo, confirmar S/N) .... do-while
 
---------------------------------------------------------------------
 PALABRAS CLAVE DEL ENUNCIADO -> ESTRUCTURA
---------------------------------------------------------------------
 "del 1 al 100", "N veces", "para cada...", "tabla", "los 5 numeros" -> for
 "hasta que", "mientras", "fins que", "pararà quan", "maximo de
   intentos", "endevinar", "sumar hasta que introduzca 0"            -> while
 "menu", "vuelve a pedir", "valida", "repite el proceso",
   "confirmacion S/N", "al menos una vez"                           -> do-while
 "si es mayor / menor / multiplo / par / esta entre"                 -> if
 "segun la nota / edad / hora", "clasifica en tramos"                -> else if
 "opcion 1, 2, 3...", "numero de dia / mes", "tamaño de pizza"       -> switch
 "guarda en un String/int segun..." (2 opciones)                     -> ternario
 "si el usuario escribe una letra", "no se puede dividir"            -> try / catch
 "fuerza una excepcion", "lanza un error si..."                      -> throw
 
 TRUCO: si dudas entre for y while, preguntate: ¿puedo decir YA
 cuantas vueltas dara? Si si -> for. Si depende de lo que escriba
 el usuario o de que pase algo -> while / do-while.
 
 
#####################################################################
 1. SELECCION
#####################################################################
 
---------------------------------------------------------------------
 1.1 IF  /  IF-ELSE
---------------------------------------------------------------------
 if (condicion) {
     // se ejecuta SOLO si la condicion es true
 } else {
     // se ejecuta si es false (opcional)
 }
 
 La condicion SIEMPRE tiene que ser un boolean (true/false).
 
 Operadores de comparacion:  <   >   <=   >=   ==   !=
 Operadores logicos:   &&  (Y: se cumplen las dos)
                       ||  (O: se cumple al menos una)
                       !   (NO: invierte)
 
 Cosas que se usan MUCHO:
   - ¿es par?                  n % 2 == 0
   - ¿es multiplo de 10?       n % 10 == 0
   - ¿esta entre 50 y 100?     n >= 50 && n <= 100      (NO: 50 <= n <= 100)
   - ¿fuera de un rango?       n < 0 || n > 10
   - ¿son iguales?             a == b
   - ¿es positivo?             n > 0
 
 Ejemplo (2 caminos):
   int edad = 20;
   if (edad >= 18) {
       System.out.println("Mayor de edad");
   } else {
       System.out.println("Menor de edad");
   }
 
---------------------------------------------------------------------
 1.2 IF - ELSE IF - ELSE  (varios tramos)
---------------------------------------------------------------------
 if (cond1) {
     ...
 } else if (cond2) {
     ...
 } else if (cond3) {
     ...
 } else {
     // ninguna anterior se ha cumplido
 }
 
 REGLAS CLAVE:
   - Java evalua de ARRIBA a ABAJO. En cuanto una condicion es true,
     ejecuta ese bloque y SALTA todo lo demas.
   - Por eso el ORDEN importa. Ejemplo con tramos de una nota:
         if (nota < 5) ...
         else if (nota < 7) ...     // aqui ya se que nota >= 5
         else if (nota < 9) ...     // aqui ya se que nota >= 7
         else ...
     No hace falta repetir "nota >= 5 &&" porque los tramos
     anteriores ya lo descartan.
   - Si el ultimo tramo es un caso especial (ej. un 10 exacto),
     ponlo ANTES del tramo general que lo incluiria, o con ==.
   - Si pones varios "if" sueltos en vez de "else if", se evaluan TODOS
     (puede salir mas de un mensaje).
 
 Ejemplo:
   int temp = 25;
   if (temp < 10) {
       System.out.println("Frio");
   } else if (temp < 25) {
       System.out.println("Templado");
   } else {
       System.out.println("Calor");
   }
 
 ERRORES TIPICOS EN IF:
   - Usar = en vez de ==        (if (a = 5) NO; if (a == 5) SI)
   - Poner ; justo despues del if:   if (a > 3); { ... }   <- MAL
   - Comparar Strings con ==    -> usar  s.equals("hola")
   - Encadenar comparaciones:   a < b < c   <- NO existe.
                                 Usa: a < b && b < c
   - Olvidar que dos numeros iguales tambien existen (¿caso a == b?)
 
---------------------------------------------------------------------
 1.3 SWITCH  (valor exacto: menus, dias, meses, textos)
---------------------------------------------------------------------
 Solo funciona con int, char y String (NUNCA double).
 No evalua rangos (no sirve para "mayor que 5").
 
 SWITCH CLASICO (necesita break):
   switch (opcion) {
       case 1:
           System.out.println("uno");
           break;
       case 2:
           System.out.println("dos");
           break;
       default:                      // equivale al "else"
           System.out.println("opcion no valida");
   }
   Sin break, Java "cae" al case siguiente y lo ejecuta tambien.
   Para varios valores con el mismo resultado se apilan los case:
       case 6:
       case 7:
           ...
           break;
 
 SWITCH CON FLECHAS (rule switch, sin break):
   switch (opcion) {
       case 1 -> System.out.println("uno");
       case 2 -> {
           System.out.println("dos");
       }
       case 3, 4, 5 -> System.out.println("de 3 a 5");   // varios valores
       default -> System.out.println("opcion no valida");
   }
 
 Con Strings:
   switch (talla) {
       case "S" -> ...
       case "M" -> ...
       default  -> ...
   }
 
 Cuando usar switch o else-if: si cada rama compara la MISMA variable
 con un valor concreto -> switch. Si hay rangos (<, >) -> else if.
 
---------------------------------------------------------------------
 1.4 TERNARIO  (un if-else en una linea, para ASIGNAR un valor)
---------------------------------------------------------------------
   variable = (condicion) ? valorSiTrue : valorSiFalse;
 
   String tipo = (n % 2 == 0) ? "par" : "impar";
   int mayor   = (a > b) ? a : b;
   double precio = (esSocio) ? base * 0.8 : base;
 
 Se pueden encadenar para 3 resultados:
   String signo = (n > 0) ? "positivo" : (n < 0) ? "negativo" : "cero";
 
 Solo sirve cuando el resultado es un VALOR. Si hay que hacer varias
 instrucciones (varios println, etc.) usa if-else normal.
 
 
#####################################################################
 2. BUCLES
#####################################################################
 
 Conceptos:
   - Bucle = bloque de codigo que se repite. Iteracion = cada vuelta.
   - VARIABLE DE CONTROL (i, j, k) tiene 3 fases:
        1) se INICIALIZA        int i = 0;
        2) se COMPRUEBA         i < 10
        3) se ACTUALIZA         i++       <- si se te olvida: BUCLE INFINITO
   - Tipos de variable dentro de un bucle:
        CONTADOR     suma siempre lo mismo       contador++;   i += 2;
        ACUMULADOR   suma cantidades distintas   suma += numero;
        SEMAFORO     boolean que decide seguir   boolean seguir = true;
   - Acumuladores y contadores se DECLARAN E INICIALIZAN FUERA
     del bucle (int suma = 0;). Si los declaras dentro, se reinician
     en cada vuelta.
 
---------------------------------------------------------------------
 2.1 FOR  (se cuantas vueltas)
---------------------------------------------------------------------
 for (inicializacion; condicion; actualizacion) {
     // cuerpo
 }
 
   for (int i = 0; i < 10; i++) {          // 0,1,2...9  (10 vueltas)
       System.out.println(i);
   }
   for (int i = 1; i <= 10; i++) { ... }   // 1..10
   for (int i = 10; i >= 1; i--) { ... }   // de mayor a menor
   for (int i = 0; i <= 100; i += 2) { ... }   // de 2 en 2
 
 - La variable i solo existe DENTRO del for (su ambito son las llaves).
   Puedes reutilizar el nombre i en otro for.
 - Cuidado con el "off by one": < excluye el limite, <= lo incluye.
 - Para pedir N datos: for (int i = 0; i < N; i++) { leer dato }
 - Patron SUMA / MEDIA:
       int suma = 0;
       for (int i = 0; i < n; i++) {
           suma += leerNumero;
       }
       double media = (double) suma / n;
 - Patron CONTAR cosas que cumplen algo:
       int cuantos = 0;
       for (...) { if (condicion) { cuantos++; } }
 - Patron TABLA: for (int i = 1; i <= 10; i++) { n + " x " + i + " = " + (n * i) }
 - For dentro de for (anidados): la de dentro da TODAS sus vueltas por
   cada vuelta de la de fuera. Sirve para tablas, tableros, filas y columnas.
       for (int fila = 0; fila < 8; fila++) {
           for (int col = 0; col < 8; col++) { ... }
       }
 
---------------------------------------------------------------------
 2.2 WHILE  (no se cuantas vueltas; comprueba ANTES de entrar)
---------------------------------------------------------------------
 while (condicion) {
     // cuerpo (algo aqui dentro debe poder volver false la condicion)
 }
 
 - Si la condicion es false desde el principio, NO se ejecuta nunca.
 - Un for es lo mismo que un while:
       int i = 0;              // inicializacion
       while (i < 10) {        // condicion
           ...
           i++;                // actualizacion
       }
 
 PATRONES DE WHILE (casi todos los ejercicios son uno de estos):
 
 a) CENTINELA: repetir hasta que el usuario escriba un valor especial
       int num = sc.nextInt();  sc.nextLine();      // primera lectura ANTES
       while (num != 0) {
           // trabajar con num
           num = sc.nextInt();  sc.nextLine();      // ultima linea: volver a leer
       }
    (si no vuelves a leer dentro, bucle infinito)
 
 b) ACUMULADOR hasta llegar a un objetivo:
       double total = 0;
       while (total < 100) {
           total += lo que lea;
       }
 
 c) SEMAFORO / BANDERA:
       boolean seguir = true;
       while (seguir) {
           ...
           if (num < 0) { seguir = false; }
       }
 
 d) ADIVINAR / REPETIR HASTA ACERTAR (+ limite de intentos):
       int intentos = 0;
       boolean acertado = false;
       while (!acertado && intentos < 3) {      // DOS condiciones con &&
           ... leer intento ...
           if (intento == secreto) { acertado = true; }
           intentos++;
       }
       // despues del bucle: mirar acertado para decir si gano o perdio
 
 e) CONTADOR simple:
       int i = 0;
       while (i < 5) { ...; i++; }
 
---------------------------------------------------------------------
 2.3 DO-WHILE  (se ejecuta SIEMPRE al menos 1 vez; comprueba AL FINAL)
---------------------------------------------------------------------
 do {
     // cuerpo
 } while (condicion);          // <- OJO: lleva punto y coma
 
 Diferencia con while: la condicion se evalua DESPUES del cuerpo.
 Usalo cuando primero hay que hacer algo (pedir un dato) y luego decidir
 si se repite.
 
 PATRON MENU:
       int opcion;
       do {
           // mostrar el menu
           opcion = sc.nextInt();  sc.nextLine();
           switch (opcion) {
               case 1 -> ...
               case 2 -> ...
               case 4 -> System.out.println("Saliendo...");
               default -> System.out.println("Opcion no valida");
           }
       } while (opcion != 4);     // 4 = salir
 
 PATRON VALIDAR UN DATO (repetir hasta que sea correcto):
       int edad;
       do {
           System.out.print("Edad: ");
           edad = sc.nextInt();  sc.nextLine();
       } while (edad < 0);        // repite MIENTRAS sea incorrecto
 
 PATRON CONFIRMAR S/N:
       do {
           ... pedir dato ...
           ... preguntar "¿correcto? (S/N)" y guardar en String respuesta
       } while (respuesta.equalsIgnoreCase("N"));
 
 PATRON "MAXIMO / MINIMO" de lo que va escribiendo el usuario:
       empieza con un valor que cualquier numero supere
       (por ejemplo, el primero leido, o Integer.MIN_VALUE para el maximo)
       y en cada vuelta: if (num > maximo) { maximo = num; }
 
 OJO: en do-while la variable (opcion, edad...) se declara ANTES del
 do, porque dentro de las llaves no se veria en el while(...).
 
---------------------------------------------------------------------
 2.4 BREAK y CONTINUE
---------------------------------------------------------------------
   break;      -> sale del bucle (o del switch) inmediatamente
   continue;   -> salta lo que queda de esta vuelta y pasa a la siguiente
 
   for (int i = 1; i <= 10; i++) {
       if (i % 2 == 0) { continue; }    // se salta los pares
       if (i > 7) { break; }            // termina el bucle
       System.out.println(i);           // 1, 3, 5, 7
   }
   Cuidado con continue en un while: si el i++ esta DESPUES del continue,
   nunca se ejecuta -> bucle infinito.
 
---------------------------------------------------------------------
 2.5 BUCLE INFINITO (el error mas comun)
---------------------------------------------------------------------
 Pasa cuando la condicion nunca se vuelve false:
   - te olvidas del i++ / de volver a leer el dato
   - la condicion esta al reves (i > 0 con i++)
   - usas == con doubles o con una condicion imposible
 Si se queda colgado en NetBeans: boton rojo "Stop" de la consola.
 
 RESUMEN BUCLES:
   for       -> repeticiones conocidas, todo en la cabecera
   while     -> repetir mientras pase algo, puede no entrar nunca
   do-while  -> igual, pero entra siempre una vez (menus, validaciones)
 
 
#####################################################################
 3. EXCEPCIONES (try / catch / throw)
#####################################################################
 
 Una excepcion es un error que ocurre MIENTRAS el programa se ejecuta.
 Si no la controlas, el programa se para con un mensaje en rojo.
 
 COMO LEER EL ERROR:
   Exception in thread "main" java.util.InputMismatchException   <- TIPO
       at ...
       at paquete.Clase.main(Clase.java:24)                      <- ARCHIVO y LINEA
   Mira la PRIMERA linea (tipo) y la linea que menciona TU clase.
 
 ESTRUCTURA:
   try {
       // codigo que puede fallar
   } catch (TipoExcepcion e) {
       // que hacer si falla
   }
   // el programa CONTINUA despues
 
 EXCEPCIONES MAS HABITUALES:
   InputMismatchException         nextInt()/nextDouble() y el usuario escribe una letra
   NumberFormatException          Integer.parseInt("abc"), Double.parseDouble("x")
   ArithmeticException            division ENTERA entre 0  (10 / 0)
                                  (con double no salta: da Infinity)
   StringIndexOutOfBoundsException  charAt / substring con posicion fuera del String
   ArrayIndexOutOfBoundsException   posicion fuera de un array
   NullPointerException           usar un objeto que vale null
   IllegalArgumentException       argumento no valido (la que usamos con throw)
 
 JERARQUIA: Throwable -> Error (graves, no se tratan) y Exception.
   Dentro de Exception: IOException (FileNotFoundException...) y
   RuntimeException (las del programador: las de arriba).
 
 ORDEN DE LOS CATCH: primero los ESPECIFICOS, despues los GENERICOS.
   Un catch de RuntimeException captura tambien sus hijas
   (NullPointerException...). Si lo pones antes, da error.
       try { ... }
       catch (NullPointerException e) { ... }    // especifica primero
       catch (RuntimeException e) { ... }        // generica despues
 
 MULTI-CATCH (mismo tratamiento para varias):
       catch (InputMismatchException | ArithmeticException e) { ... }
 
 Convertir texto a numero (puede lanzar NumberFormatException):
       int n = Integer.parseInt("9");
       double d = Double.parseDouble("10.3");
 
 FORZAR UNA EXCEPCION con throw (para valores que Java no considera error,
 como una edad negativa):
       try {
           if (edad < 0) {
               throw new IllegalArgumentException("Edad no valida");
           }
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());     // muestra el mensaje
       }
   (puedes usar mensajes distintos segun el caso: uno para "menor que 1",
    otro para "mayor que 10")
 
 TRUCO IMPORTANTE (Scanner + while/do-while):
   Si nextInt() falla con InputMismatchException, el texto erroneo SIGUE
   en el Scanner. Si estas en un bucle, vuelve a fallar sin parar.
   Solucion: en el catch limpiar con  sc.nextLine();
       boolean ok = false;
       do {
           try {
               int n = sc.nextInt();  sc.nextLine();
               ok = true;
           } catch (InputMismatchException e) {
               System.out.println("Solo numeros enteros");
               sc.nextLine();          // <- limpia el buffer
           }
       } while (!ok);
 
 finally (opcional): se ejecuta SIEMPRE, haya o no excepcion.
 
        */
    }
    
}
