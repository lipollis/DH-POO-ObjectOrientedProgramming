import entities.JogoUsuario;

public class JogoPrincipal {
    public static void main(String[] args) {

//      Instancia usuário 1

        JogoUsuario user1 = new JogoUsuario("Felipe", "Flipper");

        System.out.println("\n------Iniciando Jogo-----\n");

        System.out.println("Criando usuario1: " + user1.getNome());
        System.out.println("Atribuindo nova pontuação " + user1.aumentarPontuacao(500));
//      System.out.println("Nova pontuação " + user1.aumentarPontuacao(300)); Simulando pontuação para manter em Nível 1
        System.out.println(user1.bonus(500));

        System.out.println( "\nRelatório do jogador" +
                            "\nNome: " + user1.getNome() +
                            "\nNicknamne: " + user1.getNickName() +
                            "\nPontuação: " + user1.getPontuacao() +
                            "\nNivel: " + user1.getNivel());

//      Instancia suário 2

        JogoUsuario user2 = new JogoUsuario("Aline", "Pollis");

        System.out.println("\nCriando usuario2: " + user2.getNome());

        System.out.println("Atribuindo nova pontuação " + user2.aumentarPontuacao(800));
//      System.out.println("Nova pontuação " + user2.aumentarPontuacao(100));
        System.out.println(user2.bonus(800));

        System.out.println( "\nRelatório do jogador" +
                            "\nNome: " + user2.getNome() +
                            "\nNicknamne: " + user2.getNickName() +
                            "\nPontuação: " + user2.getPontuacao() +
                            "\nNivel: " + user2.getNivel());

    }
}
