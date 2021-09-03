public class Roupa {
     String marca;
     String tamanhoNumero;
     double preco;

    public Roupa(String marca, String tamanhoNumero, double preco) {
        this.marca = marca;
        this.tamanhoNumero = tamanhoNumero;
        this.preco = preco;
    }

    public Roupa() {

    }

    @Override
    public String toString() {
        return "Roupa{" +
                "marca='" + marca + '\'' +
                ", tamanhoNumero='" + tamanhoNumero + '\'' +
                ", preco=" + preco +
                '}';
    }
}
