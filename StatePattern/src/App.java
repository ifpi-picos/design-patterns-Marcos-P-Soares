public class App {
    public static void main(String[] args){
    Curso cursoJava = new Curso("JavacursoJava Avançado", new EstadoAberto());

    // Teste de transições de estado
    cursoJava.realizarInscricao();
    cursoJava.verNotas();

    cursoJava.transitarParaEstado(new EstadoEmAndamento());
    cursoJava.realizarInscricao();  // Não permitido
    cursoJava.verHistorico();  // Não permitido

    cursoJava.transitarParaEstado(new EstadoConcluido());
    cursoJava.realizarInscricao();  // Não permitido
    cursoJava.verNotas();  // Não permitido
    cursoJava.verHistorico();
    }
}
