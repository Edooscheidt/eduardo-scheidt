import java.time.LocalDate;
import java.time.Period;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate dataNascimentoEduardo = LocalDate.of(2004, 2, 27);

        LocalDate dataNascimentoDiogo = LocalDate.of(2003, 4, 2);

        if (dataNascimentoDiogo.isAfter(dataNascimentoEduardo)) {
            System.out.println("Diogo é mais novo. ");
        } else {
            System.out.println("Eduardo é mais novo. ");
        }

        int idadeDiogo = Period.between(dataNascimentoDiogo, hoje).getYears();
        System.out.println("O Diogo tem " + idadeDiogo + " anos.");

        int idadeEduardo = Period.between(dataNascimentoEduardo, hoje).getYears();
        System.out.println("O Eduardo tem " + idadeEduardo + " anos.");

    }
}