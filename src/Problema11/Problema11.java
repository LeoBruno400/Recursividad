package Problema11;

public class Problema11 {
    public static void main(String[] args) {
        int[] arreglo = { 2, 1, 2, 1, 2, 1 };
        int i = 0;
        int longitud = arreglo.length - 1;
        System.out.println(sumaPosicionesPares(arreglo, i, longitud));
        System.out.println(sumaPosicionesImpares(arreglo, i, longitud));
    }

    public static int sumaPosicionesPares(int[] arreglo, int i, int longitud) {
        int contadorPar = 0;

        if (longitud % 2 != 0) {
            longitud -= 1;
        }

        if (i < longitud) {
            contadorPar = arreglo[i] + sumaPosicionesPares(arreglo, i + 2, longitud);
        } else {
            contadorPar = arreglo[i];
        }
        return contadorPar;
    }
    public static int sumaPosicionesImpares(int[] arreglo, int i, int longitud) {
        int contadorPar = 0;

        if (longitud % 2 == 0) {
            longitud -= 1;
        }

        if(i==0){
            i = 1;
        }

        if (i < longitud) {
            contadorPar = arreglo[i] + sumaPosicionesImpares(arreglo, i + 2, longitud);
        } else {
            contadorPar = arreglo[i];
        }
        return contadorPar;
    }


}
