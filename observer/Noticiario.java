package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Noticiario {
    private Map<Categoria, List<Observer>> assinantesPorCategoria = new HashMap<>();

    private Map<Categoria, List<Observer>> assinantes = new HashMap<>();

    public Noticiario() {
        for (Categoria c : Categoria.values()) {
            assinantes.put(c, new ArrayList<>());
        }
    }

    public void inscrever(Categoria categoria, Observer o) {
        assinantes.get(categoria).add(o);
    }

    public void desinscrever(Categoria categoria, Observer o) {
        assinantes.get(categoria).remove(o);
    }

    public void publicar(Categoria categoria, String noticia) {
        for (Observer o : assinantes.get(categoria)) {
            o.receberNoticia(categoria, noticia);
        }
    }
}