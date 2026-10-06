import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class exmploLista {

    public static void main(String[] args) {

        List<Integer> idades = new ArrayList<>();
        idades.add(13);
        idades.add(14);
        idades.add(22);
        idades.add(23);
        idades.add(30);
        idades.add(17);

        System.out.println(idades);

        Collections.sort(idades);//retorna as idades em ordem

        System.out.println(idades.contains(15));

        System.out.println(idades.contains(13));

        System.out.println(idades.indexOf(258848));

        System.out.println(idades.getLast()); //retorna o ultimo

        System.out.println(idades.getFirst());//retorna o primeiro

        System.out.println(idades.size());

    }
}
