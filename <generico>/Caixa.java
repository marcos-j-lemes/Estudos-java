public class Caixa<T>{

    private T dados;


    public void guardar(T item){
        this.dados = item;
    }

    public T pegar(){
        return dados;
    }
}