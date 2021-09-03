package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis
        int escolhaMenu;
        int qtdeFuncionariosADD;
        String cpf;
        String nome;
        String telefone;
        String email;
        String confirmarADD = "sim";

        // Lista
        HashMap<String, String> cadastro = new HashMap<>();


        // Primeira parte do console
        System.out.println("Sistema de gerenciamento de funcionários");
        System.out.println();
        System.out.println("Utilize os números indicados para navegar pelo menu");
        System.out.println("1 - Adicionar funcionários");
        System.out.println("2 - Remover funcionários");
        System.out.println("3 - Exibir a lista de funcionários");
        escolhaMenu = leitor.nextInt();

        // Estrutura de decisão - Menu
        switch (escolhaMenu){
            case 1: // Sistema para adicionar funcionários
                // O próximo while permite a repetição da adição de novos funcionários
                while (confirmarADD.equalsIgnoreCase("sim")) {
                    System.out.println("Quantos funcionários deseja adicionar?");
                    qtdeFuncionariosADD = leitor.nextInt();
                    for (int i = 1; i <= qtdeFuncionariosADD; i++) {
                        System.out.println("Por favor insira o CPF do funcionário");
                        cpf = leitor.next();
                        System.out.println("Nome");
                        leitor.nextLine();
                        nome = leitor.nextLine();
                        System.out.println("Telefone");
                        telefone = leitor.next();
                        System.out.println("E-mail");
                        email = leitor.next();
                        cadastro.put(cpf, "Nome do funcionário: " + nome + " Dados de contato - "
                                + "Telefone: " + telefone + " E-mail: " + email);
                    }
                    System.out.println("Deseja inserir mais algum funcionário? Responda com Sim ou Não");
                    confirmarADD = leitor.next();
                }
            break;
            case 2:
                // Sistema para remover funcionários
            break;
            case 3:
                // Exibir a lista de funcionários

            break;
            default:
                // Número inválido
        }
    }
}
