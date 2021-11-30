package primos;

/*
Exercício 1
Faça uma função que, dado um número, indica se é um número primo ou não. Um número primo é aquele que só pode ser
dividido por 1 e ele mesmo. Por exemplo: 25 não é primo, pois 25 é divisível por 1, 5 e 25. 17 é primo porque só pode
ser dividido por 1 e por 17.

Para usar esta função que iremos criar em um programa, podemos permitir a entrada de apenas um número para verificar
se o número é primo ou não. Para resolvê-lo, use a função obtida no exercício desenvolvido na aula assíncrona, Boolean
e Divisível (int n, int divisor).
 */

import java.util.Scanner;

public class NumerosPrimos_Ex1 {
    private static Boolean verificaPrimo(int numero){
        //for(int i = 2; i < numero; i++){
        for(int i = 2; i <= Math.sqrt(numero); i++){
            if (numero % i == 0)
                return false;
        }
        return true;
    }


    public static void main (String[] args){
        System.out.println("Digite um número: ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        System.out.println(verificaPrimo(numero));
    }
}
