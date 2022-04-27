package Problema12;

import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arreglo = {'a','b','c','d','e'};
        int longitud = arreglo.length-1;
        char caracterBuscado;

        System.out.println("Ingrese el caracter que desea buscar: ");
        caracterBuscado = sc.next().charAt(0);

        System.out.println(encontrarCaracter(arreglo, longitud, caracterBuscado));
        sc.close();
    }
    public static boolean encontrarCaracter(char[] arreglo, int longitud, char caracterBuscado){
        boolean existencia = false;
        
        if(longitud>=0){
            if(caracterBuscado != arreglo[longitud]){ 
                //Caso iterativo: si el caracter buscado no coincide con el caracter en la posicion del arrelgo
                existencia = encontrarCaracter(arreglo, longitud-1, caracterBuscado);
            }else{
                //Caso base: si lo encuentra retorna la true
                existencia = true;
            }
        }
        return existencia;
    }
}
