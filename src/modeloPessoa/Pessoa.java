
package modeloPessoa;


public class Pessoa {
    private String nome;
    private int idade;
    private long cpf;
    private String endereco;
    private String sexo;
    
    
    public Pessoa(String nome_P, int idade_P,long cpf_P, String endereco_P, String sexo_P){
        this.nome = nome_P;
        this.idade = idade_P;
        this.cpf = cpf_P;
        this.endereco = endereco_P;
        this.sexo = sexo_P;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
}
