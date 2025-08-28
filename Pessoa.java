public class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void fazerAniversario() {
        this.idade++;
    }

    void exibirIdade() {
        System.out.printf("%s tem %d anos.%n", this.nome, this.idade);
    }
}
