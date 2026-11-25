import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Carlos", LocalDate.of(2005,10,25));
        Pessoa p2 = new Pessoa("Eduardo", LocalDate.of(2004,2,27));

        Familia f1 = new Familia();

        f1.adicionarPessoa(p1);
        f1.adicionarPessoa(p2);

        System.out.println(f1.encontrarPessoaMaisVelha());
    }
}