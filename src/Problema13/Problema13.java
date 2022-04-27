package Problema13;

public class Problema13 {
    public static void main(String[] args) {
        int filas = 0;
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("La matriz es:");
        mostrarMatriz(matriz);
        System.out.println();
        System.out.println("El numero mas grande es: "+mayorEnMatriz(matriz, filas));
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        int i, j, longitudFila, longitudCol;
        longitudFila = matriz.length;
        longitudCol = matriz[0].length;
        for (i = 0; i < longitudFila; i++) {
            for (j = 0; j < longitudCol; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int mayorNumero(int[][] matriz, int filas, int columnas) {
        int mayor = 0;
        int casoBase;
        int valorIncial;

        if (columnas >= 0 && columnas < matriz[0].length) {
            valorIncial = matriz[filas][columnas];
            casoBase = mayorNumero(matriz, filas, columnas + 1);

            if (valorIncial < casoBase) {
                mayor = casoBase;
            } else {
                mayor = valorIncial;
            }
        }
        return mayor;
    }

    public static int mayorEnMatriz(int[][] matriz, int filas){
        int mayorEnFila;
        int mayorNextLine;
        int masGrande = 0;

        if(filas>=0 && filas<matriz.length){
            mayorEnFila = mayorNumero(matriz, filas, 0);
            mayorNextLine = mayorEnMatriz(matriz, filas+1);
            if(mayorEnFila>mayorNextLine){
                masGrande = mayorEnFila;
            }else{
                masGrande = mayorNextLine;
            }
        }
        return masGrande;   
    }
}
