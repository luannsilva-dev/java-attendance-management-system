public class Presenca {
    private int id;
    private Aluno aluno;
    private EstadoPresenca estado;

    public Presenca(int id, Aluno aluno, EstadoPresenca estado) {

        if (estado == null) {
            throw new IllegalArgumentException("Estado não pode ser null");
        }
        if (aluno == null) {
            throw new IllegalArgumentException("É preciso associar um aluno");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("O id precisa ser maior que 0");
        }
        this.id = id;
        this.aluno = aluno;
        this.estado = estado;
    }

    public int getId() {

        return id;
    }

    public Aluno getAluno() {

        return aluno;
    }

    public EstadoPresenca getEstado() {

        return estado;
    }

    public void setEstado(EstadoPresenca novoEstado) {
        if (novoEstado == null) {
            return;

        }
        this.estado = novoEstado;
    }
}