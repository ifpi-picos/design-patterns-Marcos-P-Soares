public class EstadoConcluido implements EstadoCurso{
    private Curso curso;

    @Override
    public void realizarInscricao() {
        System.out.println("Inscrição não permitida após o curso concluído.");
    }

    @Override
    public void cancelarMatricula() {
        System.out.println("Matrícula não permitida após o curso concluído.");
    }

    @Override
    public void verNotas() {
        System.out.println("Notas não disponíveis após o curso concluído.");
    }

    @Override
    public void verHistorico() {
        System.out.println("Histórico do curso concluído.");
    }
    
    @Override
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
