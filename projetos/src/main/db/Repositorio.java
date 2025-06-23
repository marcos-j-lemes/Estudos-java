package db;

import model.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    private List<Tarefa> tarefas = new ArrayList<>();

    public void add(String value) {
        tarefas.add(new Tarefa(value));
    }

    public void remove(String value) {
        tarefas.removeIf(t -> t.getTarefa().equals(value));
    }

    public List<Tarefa> exibir() {
        return tarefas;
    }
}
