package strategyDesafio;

public class MainStrategy {
    public static void main(String[] args) {
        Assinatura assinatura = new Assinatura();

        assinatura.setPlano(new PlanoBasico());
        assinatura.mostrarPreco();

        assinatura.setPlano(new PlanoPadrao());
        assinatura.mostrarPreco();

        assinatura.setPlano(new PlanoPremium());
        assinatura.mostrarPreco();
    }
}
