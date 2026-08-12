import java.util.Scanner;

public class metodo2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe Qual Colega você deseja apresentar : ");
        System.out.println("Opções : Diogo,Patrick ou Henrique.");
        String nomeAlunos = leitor.next();
        if ((nomeAlunos.equals("diogo")) || (nomeAlunos.equals("Diogo"))){
            chamaEduardo();
        }else if (nomeAlunos.equalsIgnoreCase("patrick")){
            chamaPatrick();
        }else if (nomeAlunos.equalsIgnoreCase("Henrique")){
            chamaHenrique();
        }else{
            System.out.println("Opção Inválida!");
        }
    }
    public static void chamaEduardo(){
        System.out.println("O nome dele é Diogo.");
        System.out.println("Ele tem 23 anos.");
        System.out.println("Ele(a) é estudante de desenvolvimento de sistemas.");
    }
    public static void chamaPatrick(){
        System.out.println("O nome dele é Patrick.");
        System.out.println("Ele tem 30 anos.");
        System.out.println("Ele(a) é estudante de desenvolvimento de sistemas.");
    }
    public static void chamaHenrique(){
        System.out.println("O nome dele é Henrique.");
        System.out.println("Ele tem 16 anos.");
        System.out.println("Ele(a) é estudante de desenvolvimento de sistemas.");
    }


}