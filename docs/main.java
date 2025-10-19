import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Entrar Despesa");
            System.out.println("2. Anotar Pagamento");
            System.out.println("3. Listar Despesas em Aberto no período");
            System.out.println("4. Listar Despesas Pagas no período");
            System.out.println("5. Gerenciar Tipos de Despesa");
            System.out.println("6. Gerenciar Usuários");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Entrar Despesa selecionado");
                    break;
                case 2:
                    System.out.println("Anotar Pagamento selecionado");
                    break;
                case 3:
                    System.out.println("Listar Despesas em Aberto selecionado");
                    break;
                case 4:
                    System.out.println("Listar Despesas Pagas selecionado");
                    break;
                case 5:
                    System.out.println("Gerenciar Tipos de Despesa selecionado");
                    break;
                case 6:
                    System.out.println("Gerenciar Usuários selecionado");
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 7);

        scanner.close();
    }
}

