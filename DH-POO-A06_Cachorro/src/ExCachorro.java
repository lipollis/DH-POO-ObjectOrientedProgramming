/*
Identifique, modele e implemente em Java a classe envolvida na instrução
especificando seus atributos, responsabilidades, pelo menos dois construtores e os
getters e setters correspondentes.
Imagine uma instituição que adota cachorros, e para a adoção é obrigatório que os
cachorros registrados em nosso sistema possuam informações como: está apto ou
não para a adoção, raça, ano aproximado de nascimento, peso, possuem chip ou
não, estejam feridos ou não e atribuído o primeiro nome para eles na instituição.
Precisaremos saber a idade do cachorro e validar se ele possui um chip para
localização.
Um cachorro pode ser encaminhado para adoção se não estiver ferido e pesar
mais de 5 kg.
Crie a classe com seus atributos e responsabilidades, conforme descrito acima.
 */

import java.util.Scanner;

public class ExCachorro {
    public static void main(String[] args) {

        System.out.println("Cão 01");

        CachorroAdocao cao01 = new CachorroAdocao();

        cao01.avaliacaoCao();

        System.out.println("Cão 02");

        CachorroAdocao cao02 = new CachorroAdocao("Vira-Lata",2018,5.1,true);

        cao02.avaliacaoCao();

        cao02.avaliacaoAdocao();

        cao02.saberIdade(2021);
    }

}
