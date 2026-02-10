package org.example;

public class ejercicioRecursividadMatrizDiagonal3 {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Diagonal principal de la matriz es:");
        recorrerDiagonalPrincipal(matriz, 0);
    }

    public static void recorrerDiagonalPrincipal(int[][] matriz, int indice) {
        // Caso Base
        if (indice == matriz.length) {
            return;
        }

        // Caso Recursivo
        System.out.println("Elemento [" + indice + "][" + indice + "] = " + matriz[indice][indice]);
        recorrerDiagonalPrincipal(matriz, indice + 1);
    }

    //Los tipos de recursividad identificados son: Directa, lineal y de Cola.
}

