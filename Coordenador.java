import java.util.ArrayList;

public class Coordenador {
    private String id;
    private String nome;
    private ArrayList<Turma> turmas;

    public Coordenador(String id, String nome) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("O id não pode estar vazio");
        }
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }
        this.id = id;
        this.nome = nome;
        this.turmas = new ArrayList<>();
    }

    public String getId() {

        return id;
    }

    public String getNome() {

        return nome;
    }

    public boolean adicionarTurma(Turma turma) {
        if (turma == null) {
            return false;
        }
         String turmaId = turma.getId();

        for (Turma turmaExistente : turmas) {
            if (turmaExistente.getId().equals(turmaId)) {
                return false;
            }
        }
        turmas.add(turma);
        return true;
    }
    public ArrayList<Turma> getTurmas() {
        return new ArrayList<>(turmas);

    }

}
