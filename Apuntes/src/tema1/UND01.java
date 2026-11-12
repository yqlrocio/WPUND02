package tema1;
	
import java.util.Scanner;

	/**
	 * GUIA RESUMEN PARA EXAMEN - UNIDAD 01 (FUNDAMENTOS DE JAVA)
	 * Esta clase contiene ejemplos ejecutables y comentados de todos los conceptos clave.
	 */
	
public class UND01 {

    // Constante global de clase (se declara con 'final' y en MAYUSCULAS)
    public static final double IVA = 0.21;

    public static void main(String[] args) {

        // =====================================================================
        // 1. ENTRADA DE DATOS (SCANNER) Y SALIDA POR CONSOLA
        // =====================================================================
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        // TRUCO DE EXAMEN: Limpiar el buffer despues de leer un numero (nextInt/nextDouble)
        // antes de leer un String con nextLine(), si no se salta la lectura.
        sc.nextLine();

        System.out.print("Introduce tu nombre completo: ");
        String nombre = sc.nextLine();

        // =====================================================================
        // 2. TIPOS DE DATOS PRIMITIVOS Y OBJETO STRING
        // =====================================================================
        int entero = 10;                // Numeros sin decimales
        double decimal = 7.75;          // Numeros con decimales (usar punto, no coma)
        boolean esAprobado = true;      // Solo admite true o false
        char inicial = 'J';             // Un unico caracter (comillas SIMPLES)
        String texto = "Java UD01";     // Cadena de texto (comillas DOBLES)

        // =====================================================================
        // 3. OPERADORES ARITMETICOS, DIVISION ENTERA Y MODULO (%)
        // =====================================================================
        int a = 5;
        int b = 2;

        int divEntera = a / b;              // Resultado: 2 (pierde los decimales)
        double divReal = (double) a / b;    // Resultado: 2.5 (casting explicito a double)
        int resto = a % b;                  // Resultado: 1 (modulo o resto de 5 / 2)

        // Usos tipicos del modulo (%) en examen:
        boolean esPar = (entero % 2 == 0);          // true si es par
        int ultimaCifra = 1234 % 10;                // Resultado: 4
        boolean esMultiploDe5 = (entero % 5 == 0);  // true si es multiplo de 5

        // Incrementos y acumuladores
        entero++;       // Suma 1 (ahora vale 11)
        entero += 5;    // Equivale a: entero = entero + 5 (ahora vale 16)

        // =====================================================================
        // 4. OPERADORES RELACIONALES Y LOGICOS
        // =====================================================================
        // Relacionales: == (igual), != (distinto), <, >, <=, >=
        // Logicos: && (Y - ambos ciertos), || (O - al menos uno cierto), ! (NO - invierte)
        boolean puedeEntrar = (edad >= 18) && esAprobado;

        // ¡IMPORTANTE EN EXAMEN! Comparar Strings:
        // NUNCA usar == con Strings. Usar .equals() o .equalsIgnoreCase()
        boolean mismoTexto = texto.equals("Java UD01");
        boolean mismoTextoSinMayus = texto.equalsIgnoreCase("java ud01");

        // =====================================================================
        // 5. CLASE MATH Y CONVERSIONES (CASTING)
        // =====================================================================
        double potencia = Math.pow(2, 3);       // 2 elevado a 3 = 8.0 (devuelve double)
        double raiz = Math.sqrt(25);            // Raiz cuadrada de 25 = 5.0
        long redondeo = Math.round(7.6);        // Redondeo normal = 8
        double haciaArriba = Math.ceil(7.1);    // Redondeo hacia arriba = 8.0
        double haciaAbajo = Math.floor(7.9);    // Redondeo hacia abajo = 7.0

        // Numero aleatorio entre min (1) y max (10) incluidos:
        int min = 1, max = 10;
        int aleatorio = (int) (Math.random() * (max - min + 1)) + min;

        // Casting de double a int (trunca decimales, no redondea):
        int notaSinDecimales = (int) decimal;   // Vale 7

        // =====================================================================
        // 6. FORMATEO DE SALIDA CON PRINTF
        // =====================================================================
        // %s -> String | %d -> int | %.2f -> double con 2 decimales | %n -> salto de linea
        double precioFinal = 19.99 * (1 + IVA);
        System.out.println("\n--- RESUMEN DE RESULTADOS ---");
        System.out.printf("Alumno: %s | Edad: %d | Nota truncada: %d%n", nombre, edad, notaSinDecimales);
        System.out.printf("Division real: %.2f | Precio con IVA: %.2f euros%n", divReal, precioFinal);
        System.out.println("Numero aleatorio (1-10): " + aleatorio);

        // Cerrar siempre el Scanner al terminar el programa
        sc.close();
    }
}