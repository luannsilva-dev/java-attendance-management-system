public class Aluno {
    private int id;
    private String nome;
    private String numero;

    public Aluno(int id, String nome, String numero) {
        if (id <= 0) {
            throw new IllegalArgumentException("O id não pode ser menor ou igual a 0");
        }
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou estar em branco");
        }
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("O número não pode ser nulo ou estar em branco");
        }
        this.id = id;
        this.nome = nome;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}
