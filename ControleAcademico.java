package controle_academico;

import java.util.ArrayList;
import java.util.List;

// Classe ControleAcademico
class ControleAcademico {
    private List<Professor> professores = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();
    private List<Horario> horarios = new ArrayList<>();

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarDisciplina(Disciplina disciplina, Horario horario) {
        disciplinas.add(disciplina);
        horarios.add(horario);
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }
}
