public class Curso {
    private String nome;
    private EstadoCurso estado;

    public Curso(String nome, EstadoCurso estado) {
        this.nome = nome;
        this.estado = estado;
        this.estado.setCurso(this); // Passa a referência do contexto para o estado
    }

    public void transitarParaEstado(EstadoCurso novoEstado) {
        this.estado = novoEstado;
        this.estado.setCurso(this); // Passa a referência do contexto para o novo estado
    }

    public void realizarInscricao() {
        estado.realizarInscricao();
    }

    public void cancelarMatricula() {
        estado.cancelarMatricula();
    }

    public void verNotas() {
        estado.verNotas();
    }

    public void verHistorico() {
        estado.verHistorico();
    }
}
