public class Carro {
    String marca;
    String modelo;
    Motor motor;

    Carro(String marca, String modelo, int potencia, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(potencia, tipoCombustivel);
    }

    void exibirDetalhes() {
        System.out.println("Carro");
        System.out.printf("Marca: %s \n", this.marca);
        System.out.printf("Modelo: %s \n", this.modelo);
        System.out.printf("Potencia: %s \n", this.motor.potencia);
        System.out.printf("Tipo de Combustivel: %s \n", this.motor.tipoCombustivel);
    }
}
