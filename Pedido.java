import java.util.ArrayList;
import java.util.List;

public class Pedido {
    Cliente cliente;
    List<Produto> produtos = new ArrayList<>();

    Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    void exibirPedido() {
        System.out.println("Pedido do cliente: " + cliente.nome);
        for (Produto p : produtos) {
            System.out.printf("Produto: %s - R$ %.2f%n", p.nome, p.preco);
        }
    }
}
