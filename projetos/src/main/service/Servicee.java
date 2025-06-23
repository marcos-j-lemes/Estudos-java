package service;

import java.util.List;
import model.Tarefa;
import db.Repositorio;

public class Servicee {

    private Repositorio db;

    public Servicee(Repositorio db) {
        this.db = db;
    }

    public void addTarefa(String value) {
        db.add(value);
    }

    public void deleteTarefa(String value) {
        db.remove(value);
    }

    public void mostrar() {
        List<Tarefa> tarefas = db.exibir();
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }
}
