public class EstadoAberto implements EstadoCurso {
    private Curso curso;

    @Override
    public void realizarInscricao() {
        System.out.println("Inscrição realizada com sucesso.");
    }

    @Override
    public void cancelarMatricula() {
        System.out.println("Matrícula cancelada com sucesso.");
    }

    @Override
    public void verNotas() {
        System.out.println("Você não pode visualizar notas enquanto o curso está aberto.");
    }

    @Override
    public void verHistorico() {
        System.out.println("Você não pode visualizar o histórico enquanto o curso está aberto.");
    }

    @Override
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
