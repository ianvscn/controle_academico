package controle_academico;

class ProfessorCreator implements Creator<Professor> {
    @Override
    public Professor create() {
        return new Professor();
    }
}