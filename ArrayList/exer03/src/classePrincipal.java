public class classePrincipal {

    public static void main(String[] args) {

        sistemaAlunos sistema = new sistemaAlunos();

        aluno a1 = new aluno("Carlos", 20, "1001", "Desenvolvimento de Sistemas", 8.5, "carlos@email.com");
        aluno a2 = new aluno("Ana", 22, "1002", "Desenvolvimento de Sistemas", 9.0, "ana@email.com");
        aluno a3 = new aluno("Pedro", 17, "1003", "Administração", 7.5, "pedro@email.com");

        try {
            sistema.cadastrarAluno(a1);
            sistema.cadastrarAluno(a2);
            sistema.cadastrarAluno(a3);

            System.out.println("Alunos cadastrados com sucesso!");

            System.out.println("\n--- Alunos encontrados por curso, idade e média ---");

            for (aluno aluno : sistema.buscarPorCursoIdadeEMedia("Desenvolvimento de Sistemas", 18, 8.0)) {
                System.out.println("\n" + aluno);
            }

            System.out.println("\n--- Busca por matrícula ---");

            aluno encontrado = sistema.buscarPorMatricula("1002");

            if (encontrado != null) {
                System.out.println(encontrado);
            } else {
                System.out.println("Aluno não encontrado.");
            }

            System.out.println("\n--- Teste de e-mail duplicado ---");

            aluno a4 = new aluno("Marcos", 21, "1004", "Informática", 8.0, "carlos@email.com");

            sistema.cadastrarAluno(a4);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}