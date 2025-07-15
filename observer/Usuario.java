package observer;

public class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberNoticia(Categoria categoria, String conteudo) {
        System.out.println("Usuário " + nome + " recebeu notícia na categoria " + categoria + ": " + conteudo);
    }

    public String getNome() {
        return nome;
    }

}