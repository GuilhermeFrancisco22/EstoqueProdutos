package cadastro;

public abstract class Pessoas {
    private String nome;
    private String email;
    private String cpf;
    private String endereco;

    public Pessoas(){}

    public Pessoas(String nome, String email, String cpf, String endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    /*
    * nome completo

     * email

     * cpf

     * rg

     * endereço

     * cpf/cnpj

     * telefone

     * nome

     * email

     * endereço*/
}
