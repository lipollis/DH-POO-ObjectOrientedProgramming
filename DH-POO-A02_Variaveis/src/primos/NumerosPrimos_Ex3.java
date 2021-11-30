package primos;

import java.util.Scanner;

public class NumerosPrimos_Ex3 {
    private static boolean ehPrimo ( int numero){
        if(numero == 0 || numero == 1)  return false;
        for(int i = 2; i < numero; i++) {
            if(numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        if(ehPrimo(numero)){
            System.out.println("o número " + numero + " é Primo.");
        } else {
            System.out.println("o número " + numero + " não é Primo.");
        }

    }
}
