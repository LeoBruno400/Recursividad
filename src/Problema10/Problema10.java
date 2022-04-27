package Problema10;

import java.util.Scanner;

public class Problema10 {
    public static void main(String[] args) {
        String cadena = " ";
        System.out.println(contarPalabra(cadena));
    }

    public static String contarPalabra(String cadena) {
        Scanner sc = new Scanner(System.in);
        String caracterIngresado;
        String nuevaCadena = " ";
        System.out.println("Ingrese una letra: \nPunto para terminar");
        caracterIngresado = sc.nextLine();
        if (caracterIngresado.equals(".")) {
            caracterIngresado = " ";
        } else {
            caracterIngresado += contarPalabra(nuevaCadena);
        }
        sc.close();
        return caracterIngresado;
    }

}
