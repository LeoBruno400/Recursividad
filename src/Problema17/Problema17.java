package Problema17;

public class Problema17 {
    public static void main(String[] args) {
        int numero = 5;
        piramideNumerosDecrecientes(numero);
    }

    public static String piramideNumerosDecrecientes(int num){
        String numIngresado = Integer.toString(num);
        if (numIngresado.equals("1")) {
            numIngresado += " ";
            System.out.println(numIngresado);
        } else {
            numIngresado += piramideNumerosDecrecientes(Integer. parseInt(numIngresado)-1);
            System.out.println(numIngresado);
        }
        return numIngresado;
    }
}

