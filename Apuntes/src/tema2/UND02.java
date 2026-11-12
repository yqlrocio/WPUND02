package tema2;

public class UND02 {

	public static void main(String[] args) {
		
        int n = 5; // Tamaño de la matriz cuadrada (5x5)

        // =====================================================================
        // 1. DIAGONAL PRINCIPAL
        // =====================================================================
        System.out.println("--- DIAGONAL PRINCIPAL (i == j) ---");
        for (int i = 0; i < n; i++) {           // Bucle externo: filas
            for (int j = 0; j < n; j++) {       // Bucle interno: columnas
                if (i == j) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }

        // =====================================================================
        // 2. DIAGONAL SECUNDARIA 
        // =====================================================================
        System.out.println("\n--- DIAGONAL SECUNDARIA (i + j == n - 1) ---");
        for (int i = 0; i < n; i++) {           // Bucle externo: filas
            for (int j = 0; j < n; j++) {       // Bucle interno: columnas
                if (i + j == n - 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }
    }
}