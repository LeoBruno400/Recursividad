package MatrizRecursivaEjercicio;

public class SumaNumerosParesRecursivo {
    public static void main(String[] args) {
        int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("La matriz es");
        mostrarMatriz(matriz);
        System.out.println("");
        System.out.println("La suma de los numeros pares es: " + sumaPar(matriz, 0, 0));
    }
    
    public static int sumaPar(int [][] matriz, int fila, int columna){
        int suma = 0;
        if(fila < matriz.length){
            if(columna<matriz[0].length){
                if(matriz[fila][columna]%2==0){
                    suma = matriz[fila][columna] + sumaPar(matriz, fila, columna+1);
                }else{
                    suma = sumaPar(matriz, fila, columna+1);
                }
            }else{
                suma = sumaPar(matriz, fila+1, 0);
            }
        }
        return suma;
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
    
}
