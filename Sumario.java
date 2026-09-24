import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Sumario {
    private String id;
    private LocalDate data;
    private LocalTime horaInicio;

    private LocalTime horaFim;

    private String tema;
    private ArrayList<Presenca> presencas;
    private Turma turma;

    public Sumario(String id, LocalDate data, LocalTime horaInicio, LocalTime horaFim, String tema, Turma turma) {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("O ID não pode ser nulo ou estar em branco");
        }
        if (data == null) {
            throw new IllegalArgumentException("A data não pode ser nula");
        }
        if (horaInicio == null) {
            throw new IllegalArgumentException("A hora de início não pode ser nula");
        }
        if (horaFim == null) {
            throw new IllegalArgumentException("A hora do fim não pode ser nula");
        }
        if (tema == null || tema.isBlank()) {
            throw new IllegalArgumentException("O tema não pode estar vazio");
        }
        if (horaFim.isBefore(horaInicio) || horaFim.equals(horaInicio)) {
            throw new IllegalArgumentException("hora de fim tem de ser posterior à hora de início");
        }
        this.id = id;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.tema = tema;
        this.presencas = new ArrayList<>();
        this.turma = turma;
    }

    public String getId() {

        return id;
    }

    public LocalDate getData() {

        return data;
    }

    public LocalTime getHoraInicio() {

        return horaInicio;
    }

    public LocalTime getHoraFim() {

        return horaFim;
    }

    public String getTema() {

        return tema;
    }

    public boolean adicionarPresenca(Presenca presenca) {
        if (presenca == null) {
            return false;
        }
        if (!alunoPertenceATurma(presenca)) {
            return false;
        }
        int alunoId = presenca.getAluno().getId();

        for (Presenca presencaExistente : presencas) {
            if (presencaExistente.getAluno().getId() == alunoId) {
                return false;
            }
        }
        presencas.add(presenca);
        return true;

    }

    public ArrayList<Presenca> getPresencas() {
        return new ArrayList<>(presencas);
    }

    public int contarAusentes() {

        int totalAusentes = 0;

        for (Presenca presenca : presencas) {
            if (presenca.getEstado() == EstadoPresenca.AUSENTE) {
                totalAusentes++;
            }
        }
        return totalAusentes;
    }

    public int contarPresentes() {

        int totalPresentes = 0;

        for (Presenca presenca : presencas) {
            if (presenca.getEstado() == EstadoPresenca.PRESENTE) {
                totalPresentes++;
            }
        }
        return totalPresentes;
    }

    public int contarJustificados() {
        int totalJustificados = 0;

        for (Presenca presenca : presencas) {
            if (presenca.getEstado() == EstadoPresenca.JUSTIFICADO) {
                totalJustificados++;
            }
        }
        return totalJustificados;
    }

    public boolean atualizarPresenca(int alunoId, EstadoPresenca novoEstado) {

        if (novoEstado == null) {
            return false;
        }

        for (Presenca presenca : presencas) {
            if (presenca.getAluno().getId() == alunoId) {
                presenca.setEstado(novoEstado);
                return true;
            }
        }

        return false;
    }
    public boolean alunoPertenceATurma (Presenca presenca) {
        int alunoId = presenca.getAluno().getId();

        for (Aluno alunoRegistrado : turma.getAlunos()) {
            if (alunoRegistrado.getId() == alunoId) {
                return true;
            }
        }
        return false;
    }
}