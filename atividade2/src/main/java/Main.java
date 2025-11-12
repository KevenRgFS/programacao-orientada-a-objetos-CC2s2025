
import java.util.ArrayList;
import java.util.Scanner;

import dao.PessoaDAO;
import model.Colecao;
import model.Funcionario;
import model.Instituicao;
import model.Livro;
import model.Material;
import model.Pessoa;
import model.Revista;
import model.Usuario;
import src.main.java.model.Emprestimo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PessoaDAO pessoaDAO = new PessoaDAO();

        ArrayList<Pessoa> pessoas = pessoaDAO.getTodasPessoas();
        ArrayList<Material> materiais = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();


        // Exemplo Fixo
        Instituicao UCB = new Instituicao("UCB", "123456", "Brasilia-DF");
        Colecao c1 = new Colecao("Pedro", 10);
        Emprestimo e1 = new Emprestimo(UCB, c1, "20/10/2025", "21/10/2025");
        emprestimos.add(e1);


        int opcao;

        do {
            System.out.println("===== SISTEMA DE BIBLIOTECA =====");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Cadastrar Funcionário");
            System.out.println("3 - Listar Pessoas");
            System.out.println("4 - Cadastrar Livro");
            System.out.println("5 - Cadastrar Revista");
            System.out.println("6 - Listar Materiais");
            System.out.println("7 - Cadastrar Empréstimo");
            System.out.println("8 - Listar Empréstimos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeU = sc.nextLine();
                    System.out.print("Email: ");
                    String emailU = sc.nextLine();
                    System.out.print("Matrícula: ");
                    int matricula = sc.nextInt();
                    sc.nextLine();
                    Usuario u1 = new Usuario(nomeU, emailU, matricula);
                    pessoas.add(u1);
                    pessoaDAO.salvarPessoa(u1);
                    System.out.println("Usuário cadastrado com sucesso!\n");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeF = sc.nextLine();
                    System.out.print("Email: ");
                    String emailF = sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    Funcionario f1 = new Funcionario(nomeF, emailF, cargo);
                    pessoas.add(f1);
                    pessoaDAO.salvarPessoa(f1);
                    System.out.println("Funcionário cadastrado com sucesso!\n");
                    break;

                case 3:
                    System.out.println("=== Lista de Pessoas ===");
                    for (Pessoa p : pessoas) {
                        p.exibirInfo();
                        System.out.println("-------------------");
                    }
                    break;

                case 4:
                    System.out.print("Título: ");
                    String tituloL = sc.nextLine();
                    System.out.print("Ano de publicação: ");
                    int anoL = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    materiais.add(new Livro(tituloL, anoL, autor));
                    System.out.println("Livro cadastrado!\n");
                    break;

                case 5:
                    System.out.print("Título: ");
                    String tituloR = sc.nextLine();
                    System.out.print("Ano de publicação: ");
                    int anoR = sc.nextInt();
                    System.out.print("Edição: ");
                    int edicao = sc.nextInt();
                    sc.nextLine();
                    materiais.add(new Revista(tituloR, anoR, edicao));
                    System.out.println("Revista cadastrada!\n");
                    break;

                case 6:
                    System.out.println("=== Lista de Materiais ===");
                    for (Material m : materiais) {
                        m.descricao();
                        System.out.println("-------------------");
                    }
                    break;

                case 7:
                    if (pessoas.isEmpty() || materiais.isEmpty()) {
                        System.out.println("É necessário ter pelo menos uma pessoa e um material cadastrados.\n");
                        break;
                    }
                    System.out.println("Escolha o usuário (índice):");
                    for (int i = 0; i < pessoas.size(); i++) { 
                            System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    int idxUsuario = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Escolha o material (índice):");
                    for (int i = 0; i < materiais.size(); i++) {
                        System.out.println(i + " - " + materiais.get(i).getTitulo());
                    }
                    int idxMaterial = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Data de empréstimo: ");
                    String dataE = sc.nextLine();
                    System.out.print("Data de devolução: ");
                    String dataD = sc.nextLine();

                    emprestimos.add(new Emprestimo(pessoas.get(idxUsuario),
                                                   materiais.get(idxMaterial),
                                                   dataE, dataD));
                    System.out.println("Empréstimo cadastrado!\n");
                    break;

                case 8:
                    System.out.println("=== Lista de Empréstimos ===");
                    for (Emprestimo e : emprestimos) {
                        e.exibirDetalhes();
                        System.out.println("-------------------");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
            }

        } while (opcao != 0);

        sc.close();
    }
}