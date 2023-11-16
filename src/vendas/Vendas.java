package vendas;

import cadastro.pessoas.Clientes;
import cadastro.pessoas.Vendedores;
import cadastro.produtos.Produtos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vendas {
    protected Clientes cliente;
    protected Vendedores vendedor;
    private List<Produtos> produtosVendidos;
    private double valorTotal;
    private Date dataCompra;

    public Vendas(Clientes cliente1, Vendedores vendedor1) {
        this.cliente = cliente1;
        this.vendedor = vendedor1;
        this.produtosVendidos = new ArrayList<>();
        this.dataCompra = new Date();
    }

    public void adicionarProduto(Produtos produto) {
        produtosVendidos.add(produto);
        valorTotal += produto.getValorTotal();
    }

    @Override
    public String toString() {
        return "Detalhes da Venda:\n" +
                "Data: " + dataCompra +
                "\nCliente: " + cliente +
                "\nVendedor: " + vendedor +
                "\nProdutos Vendidos: " + produtosVendidos +
                "\nValor Total: " + valorTotal;
    }
}
