package org.example;

public class ejercicioRecursividadMatriz2 {

    public static void main(String[] args) {
        int[] [] matriz = {
                {2,4,6},
                {8,10,12},
                {14,16,18}
        };
        System.out.println("Recorriendo matriz recursivamente:");
        recorrerMatriz(matriz, 0, 0);
    }

    public static void recorrerMatriz( int[][] matriz, int fila, int columna) {
        // Caso Base
        //ya no hay se encuentran filas
        if (fila == matriz.length) {
            return;
        }

        // Si se termina la columna, se pasa a la siguiente fila
        if (columna == matriz[fila].length) {
            recorrerMatriz(matriz, fila + 1, 0);
            return;
        }

        // Caso recursivo
        System.out.println("Elemento [" + fila + "][" + columna + "] = " + matriz[fila][columna]);

        recorrerMatriz(matriz, fila, columna + 1);
    }

    //Los tipos de recursividad identificados son: Directa, lineal y de Cola.
}
