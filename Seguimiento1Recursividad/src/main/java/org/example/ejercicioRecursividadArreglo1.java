package org.example;

public class ejercicioRecursividadArreglo1 {

    public static void main(String[] args) {
        int[] arreglo = {100,200,300,400,500,600};
        System.out.println("Recorriendo arreglo recursivamente:");
        ejercicioRecursividadArreglo1.recorrerArreglo(arreglo, 0);
    }

    public static void recorrerArreglo(int[] arreglo, int indice){
        //Caso Base
        if (indice == arreglo.length){
            return;
        }
        //Caso recursivo
        System.out.println("Posición del elemto " + indice + ": " + arreglo[indice]);
        recorrerArreglo(arreglo, indice + 1);
    }

    //Los tipos de recursividad identificados son: Directa, lineal y de Cola.

}
