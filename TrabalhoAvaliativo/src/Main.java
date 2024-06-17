import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        OrdemDeProduto gestorDeProdutos = new OrdemDeProduto();
        OrdemDoCliente gestorDeClientes = new OrdemDoCliente();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Adicionar Cliente");
            System.out.println("4. Listar Clientes");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a cor do produto:");
                    String cor = scanner.nextLine();
                    System.out.println("Digite o preço do produto:");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); 

                    Produto produto = new Produto(nome, cor, preco);
                    gestorDeProdutos.adicionarProduto(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Lista de Produtos:");
                    for (Produto p : gestorDeProdutos.listarProdutos()) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do cliente:");
                    String nomeCliente = scanner.nextLine();
                    System.out.println("Digite o email do cliente:");
                    String emailCliente = scanner.nextLine();

                    Cliente cliente = new Cliente(nomeCliente, emailCliente);
                    gestorDeClientes.adicionarCliente(cliente);
                    System.out.println("Cliente adicionado com sucesso!");
                    break;

                case 4:
                    System.out.println("Lista de Clientes:");
                    for (Cliente c : gestorDeClientes.listarClientes()) {
                        System.out.println(c);
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

    }
}