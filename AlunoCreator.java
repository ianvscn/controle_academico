package controle_academico;

class AlunoCreator implements Creator<Aluno> {
    @Override
    public Aluno create() {
        return new Aluno();
    }
}

