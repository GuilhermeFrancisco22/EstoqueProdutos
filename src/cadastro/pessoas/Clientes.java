package cadastro.pessoas;

import java.util.List;
import java.util.Scanner;

public class Clientes extends Pessoas {

    private String telefone;
    public Clientes() {
    }

    public Clientes(List<String> list, String nome, String email, String cpf, String endereco, String telefone) {
        super(list, nome, email, cpf, endereco);
        this.telefone = telefone;
    }

    @Override
    public void cadastro(Scanner sc) {
        System.out.println("Nome completo do cliente: ");
        this.nome = sc.nextLine();
        System.out.println("Email: ");
        this.email = sc.nextLine();
        System.out.println("CPF:");
        this.cpf = sc.nextLine();
        System.out.println("Telefone: ");
        this.telefone = sc.nextLine();
        System.out.println("Endereço: ");
        this.endereco = sc.nextLine();
        String dadosCliente = String.format("Dados do vendedor \nNome: " + nome + ", email: " + email + ", CPF: " + cpf + ", telefone: " + telefone + " e endereço: " + endereco);
        list.add(dadosCliente);
        System.out.println(list);
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", CPF: " + cpf + ", Telefone: " + telefone + ", Endereço: " + endereco;
    }

}
