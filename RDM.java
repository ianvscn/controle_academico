package controle_academico;

class RDM {
    private Aluno aluno;
    private Disciplina disciplina;
    private Horario horario;

    public RDM(Aluno aluno, Disciplina disciplina, Horario horario) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.horario = horario;
    }

    // Getters e setters

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
