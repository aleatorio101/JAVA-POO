import java.util.List;

public class Casa {
    String endereco;
    List<Comodo> comodos;

    Casa(String endereco, List<Comodo> comodos) {
        this.endereco = endereco;
        this.comodos = comodos;
    }

    void exibirComodos() {
        System.out.println("Casa no endereço: " + endereco);
        for (Comodo c : comodos) {
            System.out.println("Cômodo: " + c.nome);
        }
    }
}
