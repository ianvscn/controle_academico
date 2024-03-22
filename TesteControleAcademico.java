package controle_academico;

import java.text.SimpleDateFormat;

public class TesteControleAcademico {
    public static void main(String[] args) {
        // Criando instâncias dos criadores
        Creator<Professor> professorCreator = new ProfessorCreator();
        Creator<Aluno> alunoCreator = new AlunoCreator();
        Creator<Disciplina> disciplinaCreator = new DisciplinaCreator();
        Creator<Horario> horarioCreator = new HorarioCreator();

        // Criando instâncias das entidades utilizando os criadores
        Professor professor = professorCreator.create();
        professor.setNome("João Silva");

        Aluno aluno = alunoCreator.create();
        aluno.setNome("Maria Souza");

        Disciplina disciplina = disciplinaCreator.create();
        disciplina.setNome("Programação Java");

        // Criando instância de Horario
        Horario horario = horarioCreator.create();

        // Criando instância de ControleAcademico
        ControleAcademico controleAcademico = new ControleAcademico();

        // Adicionando professor, aluno e disciplina ao controle acadêmico
        controleAcademico.adicionarProfessor(professor);
        controleAcademico.adicionarAluno(aluno);

        // Adicionando disciplina e horário ao controle acadêmico
        controleAcademico.adicionarDisciplina(disciplina, horario);

        // Verificando se as entidades foram adicionadas corretamente
        System.out.println("Professores no controle acadêmico:");
        for (Professor p : controleAcademico.getProfessores()) {
            System.out.println("- " + p.getNome());
        }

        System.out.println("\nAlunos no controle acadêmico:");
        for (Aluno a : controleAcademico.getAlunos()) {
            System.out.println("- " + a.getNome());
        }

        System.out.println("\nDisciplinas no controle acadêmico:");
        for (Disciplina d : controleAcademico.getDisciplinas()) {
            System.out.println("- " + d.getNome());
        }
        
        System.out.println("\nHorários das disciplinas:");
        for (int i = 0; i < controleAcademico.getDisciplinas().size(); i++) {
            Disciplina d = controleAcademico.getDisciplinas().get(i);
            Horario h = controleAcademico.getHorarios().get(i);
            
            // Formatação dos horários
            SimpleDateFormat formatadorHora = new SimpleDateFormat("HH:mm");
            String horaInicioFormatada = formatadorHora.format(h.getHoraInicio());
            String horaFimFormatada = formatadorHora.format(h.getHoraFim());
            
            System.out.println("- " + d.getNome() + ": " + h.getDiaSemana() + " " + horaInicioFormatada + " - " + horaFimFormatada);
        }
    }
}
