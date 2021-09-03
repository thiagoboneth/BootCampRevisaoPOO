public class MainConstrutor {
    public static void main(String[] args) {

        Roupa camisas = new Roupa();
        Sapato sapato = new Sapato();

        camisas.marca = "Adidas";
        camisas.tamanhoNumero = "GG";
        camisas.preco = 500;

        sapato.marca = "Diesel";
        sapato.modelo = "S-KB";
        sapato.tamanho = 44;
        sapato.preco = 1650.23;

        System.out.println(camisas.toString());
        System.out.println(sapato.toString());
    }
}
