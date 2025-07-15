package commandDesafio;

public class MainCommand {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        FilaImpressao fila = new FilaImpressao();

        fila.adicionarComando(new ComandoImprimir(impressora, "Relatorio.pdf"));
        fila.adicionarComando(new ComandoImprimir(impressora, "Contrato.docx"));
        fila.mostrarHistorico();

        fila.desfazerUltimo();
        fila.mostrarHistorico();
    }
}
