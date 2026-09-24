public class Formador {
    private String id;
    private String nome;

    public Formador(String id, String nome) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("O id não pode estar vazio");
        }
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }
        this.id = id;
        this.nome = nome;

    }

    public String getId() {

        return id;
    }

    public String getNome() {

        return nome;
    }
}
