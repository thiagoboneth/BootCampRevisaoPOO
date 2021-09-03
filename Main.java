
public class Main {

    public static void main(String[] args) {

        Roupa[] thiagoRoupa = new Roupa[2];
        Sapato[] thiagoSapato = new Sapato[2];

        for (int i = 0; i <2 ; i++){
            thiagoRoupa[i] = new Roupa();
            thiagoSapato[i] = new Sapato();
        }

        thiagoRoupa[0].marca = "Adidas";
        thiagoRoupa[0].preco = 200;
        thiagoRoupa[0].tamanhoNumero = "G";

        thiagoRoupa[1].marca = "Diesel";
        thiagoRoupa[1].preco = 150;
        thiagoRoupa[1].tamanhoNumero = "GG";

        thiagoSapato[0].marca = "Convense";
        thiagoSapato[0].modelo = "All-Star";
        thiagoSapato[0].tamanho = 44;
        thiagoSapato[0].preco = 200;

        thiagoSapato[1].marca = "Adidas";
        thiagoSapato[1].modelo = "BreakNet";
        thiagoSapato[1].tamanho = 44;
        thiagoSapato[1].preco = 150;

        System.out.println(thiagoRoupa[0].toString());
        System.out.println(thiagoRoupa[1].toString());

        System.out.println(thiagoSapato[0].toString());
        System.out.println(thiagoSapato[1].toString());
    }
}