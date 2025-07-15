package command;

public class Imprimir implements Comando {
    private Documento doc;

    public Imprimir(Documento doc) {
        this.doc = doc;
    }

    public void executar() {
        System.out.println("Imprimindo: " + doc.getNome());
    }

    public Documento getDocumento() {
        return doc;
    }
}