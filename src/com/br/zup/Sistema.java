package com.br.zup;

import java.util.Scanner;

/**
 * Classe para rodar o sistema e executar os modulos
 * @author Vinicius Ferreira
 */
public class Sistema {
    private static ListaDeContatos contatos = new ListaDeContatos();

    public static void menu(){
        System.out.println("Digite: \n1 para cadastrar PJ\n2 para cadastrar PF" +
                "\n3 para pesquisar por nome Contato");
    }

    /**
     * Constroi o objeto Pessoa Fisica para salvar na lista de contatos
     *
     */
    public static void cadastrarPF(){
        System.out.println("Digite nome");
        String nome = new Scanner(System.in).nextLine();
        System.out.println("Digite telefone");
        String telefone = new Scanner(System.in).nextLine();
        System.out.println("Digite CPF");
        String cpf = new Scanner(System.in).nextLine();
        System.out.println("Digite idade");
        int idade = new Scanner(System.in).nextInt();

        PessoaFisica pessoaFisica = new PessoaFisica(nome, telefone, cpf, idade);
        contatos.adicionarPessoa(pessoaFisica);
    }

    /**
     * Pesquisa contato pelo nome e mostra na tela para o usuario
     */
    public static void pesquisarContato(){
        System.out.println("Digite nome");
        String nome = new Scanner(System.in).nextLine();
        try {
            Pessoa pessoa = contatos.buscarPessoa(nome);
            System.out.println(pessoa);
        }catch (RuntimeException e){
            System.out.println("Não encontrei esse contato");
        }

    }

    public static void executarSistema(){
        boolean continuar = true;
        while (continuar){
            menu();
            int resposta = new Scanner(System.in).nextInt();
            if(resposta == 2){
                cadastrarPF();
            }else if (resposta == 3){
                pesquisarContato();
            }
        }
    }
}
