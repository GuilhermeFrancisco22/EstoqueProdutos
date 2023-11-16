package cadastro.pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Pessoas {
    protected List<String> list = new ArrayList<>();
    protected String nome;
    protected String email;
    protected String cpf;
    protected String endereco;

    public Pessoas() {
    }

    public Pessoas(List<String> list, String nome, String email, String cpf, String endereco) {
        this.list = list;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public abstract void cadastro(Scanner sc);

}
