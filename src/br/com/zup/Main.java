package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Variáveis
        int escolhaMenu;


        // Primeira parte do console
        System.out.println("Sistema de gerenciamento de funcionários");
        System.out.println();
        System.out.println("Utilize os números indicados para navegar pelo menu");
        System.out.println("1 - Adicionar funcionários");
        System.out.println("2 - Remover funcionários");
        System.out.println("3 - Exibir a lista de funcionários");
        escolhaMenu = leitor.nextInt();
    }
}
