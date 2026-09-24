import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {


        //CRIAÇÃO DOS ALUNOS


        Aluno aluno1 = new Aluno(1, "João Silva", "12345");
        Aluno aluno2 = new Aluno(2, "Maria Blanquet", "67890");
        Aluno aluno3 = new Aluno(3, "Josh Matters", "21223");



        //CRIAÇÃO DOS FORMADORES


        Formador formador1 = new Formador("2", "Maria Santos");
        Formador formador2 = new Formador("3", "Marcos Santos");



        //CRIAÇÃO DAS TURMAS


        Turma turma1 = new Turma("1", "Programação", formador1);
        Turma turma2 = new Turma("2", "Jardinagem", formador2);



        //ADICIONAR ALUNOS À TURMA


        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);



        //MOSTRAR TURMA E ALUNOS

        System.out.println("\n--- TURMA ---");
        System.out.println("ID: " + turma1.getId());
        System.out.println("Nome: " + turma1.getNome());
        System.out.println("Formador: " + turma1.getFormador().getNome());
        System.out.println("Número de alunos: " + turma1.getAlunos().size());

        System.out.println("\nAlunos:");

        for (Aluno aluno : turma1.getAlunos()) {
            System.out.println(
                    "  [" + aluno.getId() + "] "
                            + aluno.getNome()
                            + " | Número: " + aluno.getNumero()
            );
        }



        //CRIAÇÃO DOS SUMÁRIOS

        Sumario sumario1 = new Sumario(
                "1",
                LocalDate.of(2026, 6, 15),
                LocalTime.of(10, 0),
                LocalTime.of(12, 0),
                "Introdução à Programação",
                turma1
        );

        Sumario sumario2 = new Sumario(
                "2",
                LocalDate.of(2026, 6, 16),
                LocalTime.of(14, 0),
                LocalTime.of(16, 0),
                "Estruturas de Dados",
                turma1
        );

        Sumario sumario3 = new Sumario(
                "3",
                LocalDate.of(2026, 6, 17),
                LocalTime.of(10, 0),
                LocalTime.of(12, 0),
                "Jardinagem",
                turma2
        );



        //ADICIONAR SUMÁRIOS ÀS TURMAS


        turma1.adicionarSumario(sumario1);
        turma1.adicionarSumario(sumario2);

        turma2.adicionarSumario(sumario3);



        //MOSTRAR SUMÁRIOS


        System.out.println("\n--- SUMÁRIOS DA TURMA ---");

        for (Sumario sumario : turma1.getSumarios()) {
            System.out.println(
                    "  [" + sumario.getId() + "] "
                            + sumario.getData()
                            + " | "
                            + sumario.getHoraInicio()
                            + " - "
                            + sumario.getHoraFim()
                            + " | "
                            + sumario.getTema()
            );
        }



        //REGISTAR PRESENÇAS


        Presenca presenca1 = new Presenca(
                1,
                aluno1,
                EstadoPresenca.PRESENTE
        );

        Presenca presenca2 = new Presenca(
                2,
                aluno2,
                EstadoPresenca.PRESENTE
        );

        Presenca presenca3 = new Presenca(
                3,
                aluno3,
                EstadoPresenca.JUSTIFICADO
        );

        sumario1.adicionarPresenca(presenca1);
        sumario1.adicionarPresenca(presenca2);
        sumario1.adicionarPresenca(presenca3);



        //MOSTRAR PRESENÇAS


        System.out.println("\n--- PRESENÇAS ---");

        for (Presenca presenca : sumario1.getPresencas()) {
            System.out.println(
                    "  " + presenca.getAluno().getNome()
                            + " → "
                            + presenca.getEstado()
            );
        }



        //RESUMO DAS PRESENÇAS


        System.out.println("\n--- RESUMO ---");

        System.out.println(
                "Presentes:    " + sumario1.contarPresentes()
        );

        System.out.println(
                "Ausentes:     " + sumario1.contarAusentes()
        );

        System.out.println(
                "Justificados: " + sumario1.contarJustificados()
        );



        //COORDENADOR


        Coordenador coordenador1 = new Coordenador(
                "1",
                "Carlos Santos"
        );


        System.out.println("\n--- COORDENADOR ---");
        System.out.println("Coordenador: " + coordenador1.getNome());
        System.out.println("Turmas do coordenador: " + coordenador1.getTurmas().size());
    }
}
