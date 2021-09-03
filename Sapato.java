public class Sapato {
    String marca;
    String modelo;
    int tamanho;
    double preco;

    public Sapato(String marca, String modelo,int tamanho, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public Sapato() {

    }

    @Override
    public String toString() {
        return "Sapato{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanho=" + tamanho +
                ", preco=" + preco +
                '}';
    }
}
