package commandDesafio;

import java.util.Stack;

public class FilaImpressao {
    private Stack<Comando> historico = new Stack<>();

    public void adicionarComando(Comando comando) {
        comando.executar();
        historico.push(comando);
    }

    public void desfazerUltimo() {
        if (!historico.isEmpty()) {
            Comando cmd = historico.pop();
            cmd.desfazer();
        }
    }

    public void mostrarHistorico() {
        System.out.println("Histórico de Impressões:");
        for (Comando cmd : historico) {
            if (cmd instanceof ComandoImprimir) {
                System.out.println(((ComandoImprimir) cmd).getDocumento());
            }
        }
    }
}
