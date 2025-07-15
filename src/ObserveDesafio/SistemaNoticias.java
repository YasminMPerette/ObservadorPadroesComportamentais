package ObserveDesafio;

import java.util.*;

public class SistemaNoticias {
    private Map<String, List<Observer>> inscritos = new HashMap<>();

    public void inscrever(String categoria, Observer o) {
        inscritos.putIfAbsent(categoria, new ArrayList<>());
        inscritos.get(categoria).add(o);
    }

    public void desinscrever(String categoria, Observer o) {
        List<Observer> lista = inscritos.get(categoria);
        if (lista != null) lista.remove(o);
    }

    public void publicarNoticia(String categoria, String mensagem) {
        List<Observer> lista = inscritos.get(categoria);
        if (lista != null) {
            for (Observer o : lista) {
                o.update(categoria, mensagem);
            }
        }
    }
}
