import java.util.ArrayList;
import java.util.List;

public class Computador {
    Processador processador;
    MemoriaRAM memoria;
    List<Periferico> perifericos = new ArrayList<>();

    Computador(Processador processador, MemoriaRAM memoria) {
        this.processador = processador;
        this.memoria = memoria;
    }

    void adicionarPeriferico(Periferico p) {
        perifericos.add(p);
    }

    void exibirConfig() {
        System.out.printf("Processador: %s | RAM: %dGB%n",
                processador.modelo, memoria.capacidadeGB);
        for (Periferico p : perifericos) {
            System.out.println("Periférico: " + p.nome);
        }
    }
}
