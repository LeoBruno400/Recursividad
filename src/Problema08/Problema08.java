package Problema08;

import java.util.Scanner;

public class Problema08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = sc.nextLine();
        palabra= palabra.replaceAll(" ", "");
        palabra= palabra.toLowerCase();
        int der = palabra.length()-1;
        int izq = 0;
        System.out.println(verificacionPalabra(palabra, izq, der));
        sc.close();
    }

    public static boolean verificacionPalabra(String palabra, int izq, int der) {
        boolean similar = true;

        if (izq < der) {
            if (palabra.charAt(izq) == palabra.charAt(der)) {
                similar = verificacionPalabra(palabra, izq+1, der-1);
            }else{
                similar=false;
            }
        }
        return similar;
    }
}
