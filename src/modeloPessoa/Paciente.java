package modeloPessoa;

import modeloPessoa.Pessoa;

public class Paciente extends Pessoa {
    
    private String tipo_sangue;
    private boolean consultasOdont;
    private boolean consultasFisi;
    private boolean consultasNutri; 
    private boolean consultasPsic; 
    
    public Paciente(String nome_P, int idade_P, long cpf_P, String endereco_P, String sexo_P,String t_sangue){
        super(nome_P,idade_P,cpf_P,endereco_P, sexo_P);
        
        this.tipo_sangue = t_sangue;
        this.consultasOdont = false;
        this.consultasFisi = false;
        this.consultasNutri = false; 
        this.consultasPsic = false; 
    }

    public String getTipo_sangue() {
        return tipo_sangue;
    }

    public void setTipo_sangue(String tipo_sangue) {
        this.tipo_sangue = tipo_sangue;
    }

    public boolean getConsultasOdont() {
        return consultasOdont;
    }

    public void setConsultasOdont(boolean consultasOdont) {
        this.consultasOdont = consultasOdont;
    }
    
    public boolean getConsultasFisi() {
        return consultasFisi;
    }

    public void setConsultasFisi(boolean consultasFisi) {
        this.consultasFisi = consultasFisi;
    }

    public boolean getConsultasNutri() {
        return consultasNutri;
    }

    public void setConsultasNutri(boolean consultasNutri) {
        this.consultasNutri = consultasNutri;
    }

    public boolean getConsultasPsic() {
        return consultasPsic;
    }

    public void setConsultasPsic(boolean consultasPsic) {
        this.consultasPsic = consultasPsic;
    }
    

    public String toString(){
        return "NOME: "+this.getNome()+"\nIDADE: "+this.getIdade()+"\nCPF: "+this.getCpf()+
                "\nENDEREÇO: "+this.getEndereco()+"\nSEXO: "+this.getSexo()+"\nTIPO SANGUINEO: "+this.getTipo_sangue()+"\n";
    }

}
