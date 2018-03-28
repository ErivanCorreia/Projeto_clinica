package modeloPessoa;

import modeloPessoa.Pessoa;

public class Funcionario extends Pessoa {
    private String funcao;
    
    public Funcionario(String nome_P, int idade_P, long cpf_P, String endereco_P, String funcao_f, String sexo_P){
        super(nome_P, idade_P, cpf_P, endereco_P, sexo_P);
        
        this.funcao = funcao_f;
    }    

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public String toString(){
        return "NOME: "+this.getNome()+"\nIDADE: "+this.getIdade()+"\nCPF: "+this.getCpf()+
                "\nENDEREÇO: "+this.getEndereco()+"\nSEXO: "+this.getSexo()+"\nFUNÇÃO: "+this.getFuncao()+"\n";
    }
}
