package cadastro.produtos;

import java.util.*;

public class Produtos implements Estoque {
    protected Scanner sc = new Scanner(System.in);
    protected List<String> listProds = new ArrayList<>();
    protected Random random = new Random();
    protected int idProd = random.nextInt(100);
    protected String nomeProduto;
    protected int qtd;
    protected double valor;
    protected double valorTotal;
    protected String dadosProd;

    public Produtos() {
    }

    public Produtos(Scanner sc, List<String> listProds, Random random, int idProd, String nomeProduto, int qtd, double valor, double valorTotal) {
        this.sc = sc;
        this.listProds = listProds;
        this.random = random;
        this.idProd = idProd;
        this.nomeProduto = nomeProduto;
        this.qtd = qtd;
        this.valor = valor;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return dadosProd.toString();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void cadastroProd() {
    }
}
