package cadastro.produtos;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Infantil extends Produtos {
    public Infantil() {
    }

    public Infantil(Scanner sc, List<String> listProds, Random random, int idProd, String nomeProduto, int qtd, double valor, double valorTotal) {
        super(sc, listProds, random, idProd, nomeProduto, qtd, valor, valorTotal);
    }

    @Override
    public void cadastroProd() {
        System.out.println("Nome do produto: ");
        nomeProduto = sc.nextLine();
        System.out.println("Quantidade: ");
        qtd = sc.nextInt();
        System.out.println("Valor: ");
        valor = sc.nextDouble();
        valorTotal = valor * qtd;
        String dadosInfantil = String.format("Categoria: infantil, Id: %d, nome: %s, quantidade: %d, valor: %.2f, valorTotal: %.2f", idProd, nomeProduto, qtd, valor, valorTotal);
        listProds.add(dadosInfantil);
        System.out.println(listProds);
    }
}
