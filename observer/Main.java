package observer;


public class Main {
    public static void main(String[] args) {
        
        Noticiario noticiario = new Noticiario();
        
        Usuario usuario1 = new Usuario("Paulo");
        Usuario usuario2 = new Usuario("Amanda");
        
        noticiario.inscrever(Categoria.TECNOLOGIA, usuario1);
        noticiario.inscrever(Categoria.ESPORTES, usuario2);
        
        noticiario.publicar(Categoria.TECNOLOGIA, "Novo smartphone lançado!");
        noticiario.publicar(Categoria.ESPORTES, "Time local vence campeonato!");
        
        noticiario.desinscrever(Categoria.TECNOLOGIA, usuario1);
        
        noticiario.publicar(Categoria.TECNOLOGIA, "Atualização de software disponível.");

    }
}