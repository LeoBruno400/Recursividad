package Problema06;

public class Problema06 {

    public static void main(String[] args) {
        int longitud;
        int[] arreglo = {1,55,3,9};
        longitud = arreglo.length - 1;
        System.out.println(numeroMayor(arreglo, longitud));
    }

    public static int numeroMayor(int[] arreglo, int longitud) {
        int mayorInicial;
        if (longitud > 0) {
            mayorInicial = numeroMayor(arreglo, longitud-1);
            if (arreglo[longitud] > mayorInicial) {
                mayorInicial = arreglo[longitud];
            }
        }else{
            mayorInicial = arreglo[0];
        }
        return mayorInicial;
    }
}
