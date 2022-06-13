package MatrizRecursivaEjercicio;

public class ContarNumerosNoNegativos {

    public static void main(String[] args) {
        int[][] matriz = {{1, -2, 3}, {-4, 5, -6}, {-7, 8, -9}};
        System.out.println("Los numeros no negativos son: " + contarPositivos(matriz, 0, 0));

    }

    public static int contarPositivos(int[][] matriz, int fila, int columna) {
        int aux = 0, contador = 0;
        if (fila < matriz.length) {
            if (columna < matriz[0].length) {
                if (matriz[fila][columna] > 0) {
                    contador++;
                }
                aux = contador + contarPositivos(matriz, fila, columna + 1);
            } else {
                aux = contarPositivos(matriz, fila + 1, 0);
            }
        }
        return aux;
    }

}
