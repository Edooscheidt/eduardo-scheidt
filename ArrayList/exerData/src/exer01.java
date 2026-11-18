import java.time.LocalDate;
import java.time.Period;

public class exer01 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate dataNascimento = LocalDate.of(2004, 02, 27);

        int idade = Period.between(dataNascimento, hoje).getYears();

        System.out.println("Idade: " + idade + " anos");

        if (idade >= 18) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

    }
}
