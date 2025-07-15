package commandDesafio;

public class ComandoImprimir implements Comando {
    private Impressora impressora;
    private String documento;

    public ComandoImprimir(Impressora i, String doc) {
        this.impressora = i;
        this.documento = doc;
    }

    public void executar() {
        impressora.imprimir(documento);
    }

    public void desfazer() {
        System.out.println("Cancelando impressão de: " + documento);
    }

    public String getDocumento() {
        return documento;
    }
}
