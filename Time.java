import java.util.ArrayList;
import java.util.List;

public class Time {
    String nome;
    String cidade;
    List<Jogador> jogadores = new ArrayList<>();

    Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    void adicionarJogador(Jogador j) {
        jogadores.add(j);
    }

    void listarJogadores() {
        System.out.println("Time: " + nome + " (" + cidade + ")");
        for (Jogador j : jogadores) {
            System.out.printf("Jogador: %s - %s%n", j.nome, j.posicao);
        }
    }
}
