import java.util.ArrayList;
import java.util.List;

public class floricultura {

    private List<flor> flores = new ArrayList<>();

    public void adicionarFlor(flor flor) {
        flores.add(flor);
    }

    public List<flor> floresDoCliente(String cliente) {

        List<flor> resultado = new ArrayList<>();

        for (flor flor : flores) {
            if (flor.getCliente().equalsIgnoreCase(cliente)) {
                resultado.add(flor);
            }
        }

        return resultado;
    }
}