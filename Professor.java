import java.util.ArrayList;
import java.util.List;

public class Professor {
    String nome;
    List<Disciplina> disciplinas = new ArrayList<>();

    Professor(String nome) {
        this.nome = nome;
    }

    void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    void listarDisciplinas() {
        System.out.println("Professor: " + nome);
        for (Disciplina d : disciplinas) {
            System.out.println("Leciona: " + d.nome);
        }
    }
}
