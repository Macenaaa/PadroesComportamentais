package command;

public class Main {
    public static void main(String[] args) {
        Gerenciador impressora = new Gerenciador();

        Documento doc1 = new Documento("Relatório_Semanal");
        Documento doc2 = new Documento("PDF_Relatorio");

        Comando cmd1 = new Imprimir(doc1);
        Comando cmd2 = new Imprimir(doc2);

        impressora.executar(cmd1);
        impressora.executar(cmd2);

        impressora.mostrarHistorico();

        impressora.desfazerUltimaImpressao();
        impressora.mostrarHistorico();
    }
}