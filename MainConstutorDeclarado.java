import java.util.ArrayList;
import java.util.List;

public class MainConstutorDeclarado {
    public static void main(String[] args) {

        List<Roupa>thiagoRoupa = new ArrayList<>();

        thiagoRoupa.add(new Roupa("Diesel","GG",500));
        thiagoRoupa.add(new Roupa("Adidas","GG",250));


        System.out.println(thiagoRoupa);
    }
}
