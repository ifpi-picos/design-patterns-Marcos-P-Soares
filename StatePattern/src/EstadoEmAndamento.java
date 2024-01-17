public class EstadoEmAndamento implements EstadoCurso{
    private Curso curso;

    @Override
    public void realizarInscricao() {
        System.out.println("Inscrição não permitida durante o curso.");
    }

    @Override
    public void cancelarMatricula() {
        System.out.println("Matrícula não pode ser cancelada durante o curso.");
    }

    @Override
    public void verNotas() {
        System.out.println("Notas do curso em andamento.");
    }

    @Override
    public void verHistorico() {
        System.out.println("Você não pode visualizar o histórico durante o curso.");
    }

    @Override
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
