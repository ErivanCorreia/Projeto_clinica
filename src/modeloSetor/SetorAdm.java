package modeloSetor;
import modeloPessoa.Funcionario;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SetorAdm{
    private ArrayList<Funcionario> listaF;   //ArrayList generico do tipo funcionário
    
    public SetorAdm(){
        listaF = new ArrayList();//instanciando o arrayList no construtor;
    }
    
   public String cadastraFunc(Funcionario novoFuncionario){//recebe um objeto funcionário como parametro
       listaF.add(novoFuncionario);//adiciona na lista
       return "\nCADASTRADO COM SUCESSO !!\nCÓDIGO DO FUNCIONÁRIO:"+listaF.indexOf(novoFuncionario)+"\n";
    }
    
   public  void removeFunc(int idFunc ){//se o id do funcionário for real
      
       listaF.remove(idFunc);//então ele é excluido

   }
   
   public boolean varificaIdF(int idFunc){
      
       for(int i=0; i<listaF.size(); i++){
           if(idFunc == listaF.indexOf(listaF.get(i)) ){
               return true;
           }
       }
       return false;
   }
 
   public void alteraNomeF(int idFunc, String nome){
      
       listaF.get(idFunc).setNome(nome);
       
  }
   public void alteraIdadeF(int idFunc, int idade){
       
       listaF.get(idFunc).setIdade(idade);
      
  }
   
  public void alteraCpfFunc(int idFunc, long cpf){
      
       listaF.get(idFunc).setCpf(cpf);
       
  }
  
  public void alteraEndF(int idFunc, String endereco){
       
       listaF.get(idFunc).setEndereco(endereco);
      
  }
  
  public void alteraSexoF(int idFunc, String sexo){
       
       listaF.get(idFunc).setSexo(sexo);
      
  }
  
  public void alteraFuncao(int idFunc, String funcao){
       
       listaF.get(idFunc).setFuncao(funcao);

  }
  
  public void relatorioConsul(String txt){//recebe um texto ou mensagem do usuario como parametro
      Path diretorio = Paths.get("C:/Users/Jaiane/Desktop/RelatorioConsulta.txt");//onde o txt gerado irá ficar
      byte[] textoByte = txt.getBytes();//convertendo o texto em bites
      try{//tratando excessões 
          Files.write(diretorio, textoByte);//colocando o txt no diretório informado
      }catch(Exception erro){
          
      }
  }
  
  public void relatorioPacient(String txt){
      Path diretorio = Paths.get("C:/Users/Jaiane/Desktop/RelatorioPaciente.txt");
     byte [] txtByte = txt.getBytes();
      try{
          Files.write(diretorio, txtByte);
      }catch(Exception erro){
          
      }
  }
  
  public boolean listarFun(){
      if(listaF.size() == 0){
          return false;
      }
      for(int i=0; i<listaF.size(); i++){
          System.out.println(listaF.get(i).toString()+"ID: "+listaF.indexOf(listaF.get(i))+"\n");
      }
    return true;  
  }
}
