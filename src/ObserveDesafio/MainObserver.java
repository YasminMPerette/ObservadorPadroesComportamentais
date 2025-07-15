package ObserveDesafio;

public class MainObserver {
    public static void main(String[] args) {
        SistemaNoticias sistema = new SistemaNoticias();
        Usuario ana = new Usuario("Ana");
        Usuario pedro = new Usuario("Pedro");

        sistema.inscrever("Esporte", ana);
        sistema.inscrever("Política", pedro);
        sistema.inscrever("Esporte", pedro);

        sistema.publicarNoticia("Esporte", "Brasil vence Copa!");
        sistema.publicarNoticia("Política", "Nova lei aprovada.");
    }
}
