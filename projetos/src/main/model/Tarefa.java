package model;

public class Tarefa {

    private String tarefa;

    public Tarefa(String descricao) {
        this.tarefa = descricao;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public String toString() {
        return tarefa;
    }
}
