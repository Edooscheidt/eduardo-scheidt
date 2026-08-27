public class classePrincipal {
    public static void main(String[] args) {
        usuario uEduardo = new usuario();

        uEduardo.nome = "Eduardo";
        uEduardo.estadoCivil = "Solteiro";
        uEduardo.sexo = 'm';
        uEduardo.data = "27/02/2004";

        System.out.println(uEduardo.nome + " " + uEduardo.estadoCivil + " "  + uEduardo.data + " ");

        usuario uDiogo = new usuario();

        uDiogo.nome = "Diogo";
        uDiogo.estadoCivil = "Solteiro";
        uDiogo.sexo = 'm';
        uDiogo.data = "02/04/2003";

        System.out.println(uDiogo.nome + " " + uDiogo.estadoCivil + " "  + uDiogo.data + " ");

        usuario uPatrick = new usuario();

        uPatrick.nome = "Patrick";
        uPatrick.estadoCivil = "Casado";
        uPatrick.sexo = 'm';
        uPatrick.data = "22/02/1996";

        System.out.println(uPatrick.nome + " " + uPatrick.estadoCivil + " "  + uPatrick.data + " ");
    }


}
