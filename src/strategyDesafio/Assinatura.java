package strategyDesafio;

public class Assinatura {
    private PlanoStrategy plano;

    public void setPlano(PlanoStrategy plano) {
        this.plano = plano;
    }

    public void mostrarPreco() {
        System.out.println("Preço da assinatura: R$ " + plano.calcularPreco());
    }
}
