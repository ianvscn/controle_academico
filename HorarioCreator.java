package controle_academico;
import java.util.Date;

// Criador de Horarios
class HorarioCreator implements Creator<Horario> {
    @Override
    public Horario create() {
        // Criando os horários específicos para a disciplina "Programação Java"
        String diaSemana = "Terça-feira";
        // Criando os objetos Date para representar as horas de início e fim da aula
        // O mês (0-11), dia (1-31), ano, horas e minutos estão sendo definidos aqui
        Date horaInicio = new Date(0, 0, 0, 11, 0); // 11h
        Date horaFim = new Date(0, 0, 0, 13, 0); // 13h

        // Criando e retornando o objeto Horario com o horário específico
        return new Horario(diaSemana, horaInicio, horaFim);
    }
}
