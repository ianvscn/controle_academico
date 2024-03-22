package controle_academico;

class DisciplinaCreator implements Creator<Disciplina> {
    @Override
    public Disciplina create() {
        return new Disciplina();
    }
}
