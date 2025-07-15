package command;

import java.util.Stack;

public class Gerenciador {
    private Stack<Comando> historico = new Stack<>();

    public void executar(Comando cmd) {
        cmd.executar();
        historico.push(cmd);
    }

    public void desfazerUltimaImpressao() {
        if (!historico.isEmpty()) {
            Comando removido = historico.pop();
            System.out.println("Cancelar: " + ((Imprimir) removido).getDocumento().getNome());
        } else {
            System.out.println("Nada para desfazer.");
        }
    }

    public void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Histórico vazio.");
        } else {
            System.out.println("Histórico:");
            for (Comando cmd : historico) {
                System.out.println("- " + ((Imprimir) cmd).getDocumento().getNome());
            }
        }
    }
}