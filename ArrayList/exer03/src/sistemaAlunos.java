import java.util.ArrayList;

public class sistemaAlunos {

    private ArrayList<aluno> alunos = new ArrayList<>();

    public ArrayList<aluno> buscarPorCursoIdadeEMedia(String curso, int idadeMinima, double mediaMinima) {
        ArrayList<aluno> resultado = new ArrayList<>();

        for (aluno aluno : alunos) {
            if (aluno.getCurso().equalsIgnoreCase(curso)
                    && aluno.getIdade() >= idadeMinima
                    && aluno.getMediaFinal() >= mediaMinima) {

                resultado.add(aluno);
            }
        }

        return resultado;
    }

    public aluno buscarPorMatricula(String matricula) {
        for (aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }

        return null;
    }

    public void cadastrarAluno(aluno aluno) {
        for (aluno existente : alunos) {
            if (existente.getEmail().equalsIgnoreCase(aluno.getEmail())) {
                throw new IllegalArgumentException("Já existe um aluno cadastrado com esse e-mail.");
            }
        }

        alunos.add(aluno);
    }
}