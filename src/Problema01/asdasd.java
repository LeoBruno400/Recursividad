package Problema01;


public class asdasd {
    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5 };
        System.out.println("numero buscar");
        int numeroBuscar = 3;
        System.out.println(imcEspecifico(arreglo, numeroBuscar));
    }

    public static boolean imcEspecifico(int[] arreglo, int IMC) {
        boolean existencia = false;
        int i = 0;
        int longitud = arreglo.length-1;

        do {
            if (arreglo[i] == IMC) {
                existencia = true;
            }
            i++;
        } while (i<longitud && existencia == false);
        return existencia;
    }
}
