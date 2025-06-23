import java.util.Scanner;
import model.Tarefa;
import db.Repositorio;
import service.Servicee;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Repositorio repositorio = new Repositorio();
        Servicee service = new Servicee(repositorio);

        do {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    service.addTarefa(descricao);
                    System.out.println("Tarefa adicionada!");
                    break;
                case 2:
                    service.mostrar();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
