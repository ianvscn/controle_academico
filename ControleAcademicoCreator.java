package controle_academico;

class ControleAcademicoCreator implements Creator<ControleAcademico> {
    @Override
    public ControleAcademico create() {
        return new ControleAcademico();
    }
}
