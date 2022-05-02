package Problema19;

public class Problema19 {
    public static void main(String[] args) {
        int numero = 9;
        piramideNumerosDecrecientes(numero);
    }

    public static String piramideNumerosIzquierda(int num) {
        String numero = Integer.toString(num);
        String cadenaNueva = "";

        if (numero.equals("1")) {
            numero += ""; // Caso base: retorna 1
        } else {
            // Caso iterativo: suma los digitos en una cadena de strings
            cadenaNueva += piramideNumerosIzquierda(num - 1) + " ";
            System.out.print(cadenaNueva);
        }
        return numero;
    }

    public static String piramideNumerosDecrecientes(int num) {
        String numIngresado = Integer.toString(num);
        String cadenaIterativa = "";

        if (numIngresado.equals("1")) {
            System.out.println(numIngresado);
        } else {
            numIngresado += " " + piramideNumerosDecrecientes(num - 1);
            cadenaIterativa += piramideNumerosIzquierda(num - 1) + " ";
            System.out.println(cadenaIterativa + numIngresado);
        }
        return numIngresado;
    }

}
