package scanner;

/*
Digite seu nome e sobrenome separadamente, a partir dessas variáveis
obtenha em uma terceira, suas iniciais e sua data de nascimento, para
a data digite 3 valores que representam dia, mês e ano.
Em seguida, exiba uma mensagem, como se fosse um token, com seu nomes,
as iniciais do seu nome e sobrenome e sua data de nascimento no
formato "dd / mm / aaaa"

Nota: Use alguma função para resolver, por exemplo, dados os 3 valores,
retorne a data como uma string.
*/

import java.util.Scanner;

public class AtivNome {
    //shift+shift -> soft wrap (quebra de linha)

    //Função precisa ser fora do método main
    public static String dataNasc(String dia, String mes, String ano){
        String dataCompleta = dia + "/" + mes + "/" + ano;
        return dataCompleta;           //retorna um tipo de dado. Não seria necessário se invés de 'string' fosse 'void'

    }

    //Método main:
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);   //Scanner recebe o dado do usuário

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();           //nextLine é só para String

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();      //o método nextLine é onde armazena, tipo input, e tem que ser associado a alguma variável

        //As iniciais para cada variável
        //char inicialN = nome.charAt(0);
        //char inicialS = sobrenome.charAt(0);

        //Para o caso de pegar as iniciais e declarar numa única variável:
        String inicial = nome.charAt(0) + " " + sobrenome.charAt(0);

        System.out.println("Digite seu dia, mês e ano de nascimento: ");
        String dia = entrada.nextLine();
        String mes = entrada.nextLine();
        String ano = entrada.nextLine();

        System.out.println("Seu nome é: "+nome + " " + sobrenome + ". Suas iniciais: " + inicial + ". Sua data de nascimento: " + dataNasc(dia, mes, ano));
    }
}
