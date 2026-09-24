    import java.util.ArrayList;

    public class Turma {
        private String id;
        private String nome;
        private Formador formador;

        private ArrayList<Aluno> alunos;

        private ArrayList<Sumario> sumarios;

        public Turma(String id, String nome, Formador formador) {
            if (id == null || id.isBlank()) {
                throw new IllegalArgumentException("O ID não pode estar vazio");
            }
            if (nome == null || nome.isBlank()) {
                throw new IllegalArgumentException("O nome não pode estar vazio");
            }
            if (formador == null) {
                throw new IllegalArgumentException("A turma precisa de um formador");
            }
            this.id = id;
            this.nome = nome;
            this.formador = formador;
            this.alunos = new ArrayList<>();
            this.sumarios = new ArrayList<>();
        }

        public String getId() {

            return id;
        }

        public String getNome() {

            return nome;
        }

        public Formador getFormador() {

            return formador;
        }

        public ArrayList<Aluno> getAlunos() {

            return new ArrayList<>(alunos);
        }

        public boolean adicionarAluno(Aluno aluno) {
            if (aluno == null) {
                return false;
            }
            for (Aluno alunoExistente : alunos) {
                if (alunoExistente.getId() == aluno.getId()) {
                    return false;
                }
            }

            alunos.add(aluno);
            return true;
        }


        public void removerAluno(Aluno aluno) {

            alunos.remove(aluno);
        }

        public ArrayList<Sumario> getSumarios() {

            return new ArrayList<>(sumarios);
        }

        public boolean adicionarSumario(Sumario sumario) {
            if (sumario == null) {
                return false;
            }
            for (Sumario sumarioExistente : sumarios) {
                if (sumarioExistente.getId().equals(sumario.getId())) {
                    return false;

                }

            }
            sumarios.add(sumario);
            return true;
        }

        public Aluno encontrarAlunoPorId(int alunoId) {
            for (Aluno encontrarAlunoId : alunos) {
                if (encontrarAlunoId.getId() == alunoId){
                    return encontrarAlunoId;
                }
            }
            return null;
        }

        public Sumario encontrarSumarioPorId(String sumarioId) {
            for (Sumario encontrarSumarioId : sumarios) {
                if (encontrarSumarioId.getId().equals(sumarioId)) {
                    return encontrarSumarioId;
                }
            }
            return null;
        }

    }

