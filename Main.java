package controle_academico;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos criadores
        Creator<Professor> professorCreator = new ProfessorCreator();
        Creator<Aluno> alunoCreator = new AlunoCreator();
        Creator<Disciplina> disciplinaCreator = new DisciplinaCreator();
        Creator<Horario> horarioCreator = new HorarioCreator(); // Adicione esta linha

        // Criando instâncias das entidades utilizando os criadores
        Professor professor = professorCreator.create();
        Aluno aluno = alunoCreator.create();
        Disciplina disciplina = disciplinaCreator.create();
        Horario horario = horarioCreator.create(); // Adicione esta linha

        // Criando instância de ControleAcademico
        ControleAcademico controleAcademico = new ControleAcademico();

        // Adicionando professor, aluno e disciplina ao controle acadêmico
        controleAcademico.adicionarProfessor(professor);
        controleAcademico.adicionarAluno(aluno);

        // Adicionando disciplina e horário ao controle acadêmico
        controleAcademico.adicionarDisciplina(disciplina, horario); // Altere esta linha

        // Testando se o professor foi adicionado corretamente
        if (controleAcademico.getProfessores().contains(professor)) {
            System.out.println("Professor adicionado corretamente ao controle acadêmico.");
        } else {
            System.out.println("Erro ao adicionar professor ao controle acadêmico.");
        }

        // Testando se o aluno foi adicionado corretamente
        if (controleAcademico.getAlunos().contains(aluno)) {
            System.out.println("Aluno adicionado corretamente ao controle acadêmico.");
        } else {
            System.out.println("Erro ao adicionar aluno ao controle acadêmico.");
        }

        // Testando se a disciplina foi adicionada corretamente
        if (controleAcademico.getDisciplinas().contains(disciplina)) {
            System.out.println("Disciplina adicionada corretamente ao controle acadêmico.");
        } else {
            System.out.println("Erro ao adicionar disciplina ao controle acadêmico.");
        }
    }
}
