import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 1. Pessoa ===");
        Pessoa p = new Pessoa("Lucas", 20);
        p.exibirIdade();
        p.fazerAniversario();
        p.exibirIdade();

        System.out.println("\n=== 2. Circulo ===");
        Circulo c = new Circulo(5);
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());

        System.out.println("\n=== 3. Carro e Motor ===");
        Carro carro = new Carro("Ford", "Focus", 250, "Gasolina");
        carro.exibirDetalhes();

        System.out.println("\n=== 4. Livro e Autor ===");
        Autor a = new Autor("Machado de Assis", "Brasileiro");
        Livro l1 = new Livro("Dom Casmurro", a);
        Livro l2 = new Livro("Memórias Póstumas", a);
        l1.exibirDetalhes();
        l2.exibirDetalhes();

        System.out.println("\n=== 5. Time e Jogadores ===");
        Time t = new Time("Flamengo", "Rio de Janeiro");
        t.adicionarJogador(new Jogador("Pedro", "Atacante"));
        t.adicionarJogador(new Jogador("Arrascaeta", "Meia"));
        t.listarJogadores();

        System.out.println("\n=== 6. Casa e Comodos ===");
        Casa casa = new Casa("Av. Brasil, 123", Arrays.asList(
                new Comodo("Sala"),
                new Comodo("Cozinha"),
                new Comodo("Quarto")));
        casa.exibirComodos();

        System.out.println("\n=== 7. Professor e Disciplinas ===");
        Professor prof = new Professor("Carlos");
        prof.adicionarDisciplina(new Disciplina("Matemática"));
        prof.adicionarDisciplina(new Disciplina("Programação"));
        prof.listarDisciplinas();

        System.out.println("\n=== 8. Sistema de Vendas ===");
        Cliente cli = new Cliente("Lucas", "123.456.789-00");
        Pedido pedido = new Pedido(cli);
        pedido.adicionarProduto(new Produto("Notebook", 3500.0));
        pedido.adicionarProduto(new Produto("Mouse", 80.0));
        pedido.exibirPedido();

        System.out.println("\n=== 9. Computador ===");
        Computador pc = new Computador(new Processador("i7"), new MemoriaRAM(16));
        pc.adicionarPeriferico(new Periferico("Mouse"));
        pc.adicionarPeriferico(new Periferico("Teclado"));
        pc.adicionarPeriferico(new Periferico("Monitor"));
        pc.exibirConfig();
    }
}
