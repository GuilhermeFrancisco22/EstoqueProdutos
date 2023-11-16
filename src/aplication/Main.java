package aplication;

import cadastro.pessoas.Clientes;
import cadastro.pessoas.Vendedores;
import cadastro.produtos.Feminino;
import cadastro.produtos.Infantil;
import cadastro.produtos.Masculino;
import vendas.Vendas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vendedores vendedor1 = new Vendedores();
        Clientes cliente1 = new Clientes();
        Masculino masculino = new Masculino();
        Feminino feminino = new Feminino();
        Infantil infantil = new Infantil();
        Vendas vendas = new Vendas(cliente1, vendedor1);

        System.out.println("Cadastre seu Vendedor");
        vendedor1.cadastro(sc);

        System.out.println("Cadastre seu Cliente");
        cliente1.cadastro(sc);


        System.out.println("Qual categoria de produto deseja cadastrar:\n" +
                "\n1 - Infantil" +
                "\n2 - Feminino" +
                "\n3 - Masculino");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                infantil.cadastroProd();
                vendas.adicionarProduto(infantil);
                break;
            case 2:
                feminino.cadastroProd();
                vendas.adicionarProduto(feminino);
                break;
            case 3:
                masculino.cadastroProd();
                vendas.adicionarProduto(masculino);
                break;
            default:
                System.err.println("Categoria não encontrada");
                break;
        }
        // Exibe informações da venda
        System.out.println(vendas);
    }
}
