package modeloSetor;
import modeloPessoa.Paciente;
import java.util.ArrayList;

public class SetorGenerico {//ESTE SETOR REPRESENTA OS SETORES (clínico e operacional);
    
   private ArrayList<Paciente> listaP;// ArrayList genérico do tipo paciente
   
    public SetorGenerico(){
        listaP = new ArrayList();//instanciando o arrayList no construtor
        
    }

    public String cadastrar(Paciente novoPaciente){//recebe um paciente como paramentro
        listaP.add(novoPaciente);//listaP adiciona um objeto paciente
        return "\nCADASTRADO COM SUCESSO !!\nID DO PACIENTE:"+listaP.indexOf(novoPaciente)+"\n";//retorna uma String;
    }
    
    public void remover(int idPaciente){
       listaP.remove(idPaciente);//remover paciente na posição idPaciente digitado pelo usuário
    }
    
    public boolean verificaIdP(int id){//recebe o id do paciente que é a posição da lista
         
        for(int i=0; i<listaP.size(); i++){//percorre a lista
           if(id == listaP.indexOf(listaP.get(i))){//se o numéro digitado for igual ao id da lista então...
               return true;//retorna true;
           }
       }
       return false;//se não retorna a false;
    }
    
    public void alterarNome(int idPaciente, String novoNome){//parametos id e nome que desejar para mudar
        
            listaP.get(idPaciente).setNome(novoNome);//lista na posiçao id irá setar um novo nome que foi passado como parametro
    }

    public void alterarIdade(int idPaciente, int novaIdade){//mesma lógica do método alterar nome
        
         listaP.get(idPaciente).setIdade(novaIdade);
            
    } 
    
    public void alterarCpf(int idPaciente, long novoCpf){
        
            listaP.get(idPaciente).setCpf(novoCpf);
    }
    
    public void alterarEndereco(int idPaciente, String novoEndereco){
        
            listaP.get(idPaciente).setEndereco(novoEndereco);
           
    }
    
    public void alterarSexo(int idPaciente, String sexo){
        
            listaP.get(idPaciente).setSexo(sexo);
    }
    
    public void alterarSangue(int idPaciente, String tipoSangue){
        
            listaP.get(idPaciente).setTipo_sangue(tipoSangue);
    }
    
    public void consultaOdonto(int id){//recebe um id como paramentro;
        listaP.get(id).setConsultasOdont(true);//o método verificaId acima é chamado para verificar se o id é verdadeiro
        listaP.get(id).setConsultasFisi(false);//se for, então é chamado setColsulta... da classe paciente que recebe true
        listaP.get(id).setConsultasNutri(false);
        listaP.get(id).setConsultasPsic(false);
    }
    
    public void consultaFisio(int id){
        listaP.get(id).setConsultasOdont(false);
        listaP.get(id).setConsultasFisi(true);
        listaP.get(id).setConsultasNutri(false);
        listaP.get(id).setConsultasPsic(false);
    }
    
    public void consultaNutri(int id){
        listaP.get(id).setConsultasOdont(false);
        listaP.get(id).setConsultasFisi(false);
        listaP.get(id).setConsultasNutri(true);
        listaP.get(id).setConsultasPsic(false);
    }
    
    public void consultaPsico(int id){
        listaP.get(id).setConsultasOdont(false);
        listaP.get(id).setConsultasFisi(false);
        listaP.get(id).setConsultasNutri(false);
        listaP.get(id).setConsultasPsic(true);
    }
    
    public String verificaConsultas( int id){//irá verificar as consultas marcadas...
        if(listaP.get(id).getConsultasOdont() == true){
            return "PACIENTE "+listaP.get(id).getNome()+" MARCOU UMA CONSULTA PARA ODONTO";//... retornando uma String com a mensagem;
        }if(listaP.get(id).getConsultasFisi() == true){
            return "PACIENTE "+listaP.get(id).getNome()+" MARCOU UMA CONSULTA PARA FISIOTERAPIA";
        }if(listaP.get(id).getConsultasNutri() == true){
            return "PACIENTE "+listaP.get(id).getNome()+" MARCOU UMA CONSULTA COM NUTRICIONISTA";
        }if(listaP.get(id).getConsultasPsic() == true){
            return "PACIENTE "+listaP.get(id).getNome()+" MARCOU UMA CONSULTA COM PSICÓLOGO(A)";
        }
           
        return "PACIENTE "+listaP.get(id).getNome()+" NÃO TEM NENHUMA CONSULTA MARCADA";
        
    }
    
    public boolean listar(){//não recebe parametros
        if(listaP.size()==0){//se a lista for igual a 0 então retorna a false;
            return false;
        }
            for(int i=0; i<listaP.size(); i++){//se a lista tiver conteúdo então irá impri-los;
                System.out.println(listaP.get(i).toString()+"ID: "+listaP.indexOf(listaP.get(i))+"\n");
            }
        return true;
    }
}
