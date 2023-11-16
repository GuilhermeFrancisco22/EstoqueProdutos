package cadastro.pessoas;

import java.util.List;
import java.util.Scanner;

public class Vendedores extends Pessoas {

    private String rg;

    public Vendedores() {
    }

    public Vendedores(List<String> list, String nome, String email, String cpf, String endereco, String rg) {
        super(list, nome, email, cpf, endereco);
        this.rg = rg;
    }

    @Override
    public void cadastro(Scanner sc) {
        System.out.println("Nome completo do vendedor: ");
        nome = sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("CPF:");
        cpf = sc.nextLine();
        System.out.println("RG: ");
        rg = sc.nextLine();
        System.out.println("Endereço: ");
        endereco = sc.nextLine();
        String dadosVendedor = String.format("Dados do vendedor: Nome: " + nome + ", email: " + email + ", CPF: " + cpf + ", RG: " + rg + " e endereço: " + endereco);
        list.add(dadosVendedor);
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", CPF: " + cpf + ", RG: " + rg + ", Endereço: " + endereco;
    }
}
