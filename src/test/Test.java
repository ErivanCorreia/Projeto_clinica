package test;

import modeloPessoa.Funcionario;
import modeloPessoa.Paciente;
import modeloSetor.SetorGenerico;
import modeloSetor.SetorAdm;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Paciente paciente;
        Funcionario funcionario;
        SetorGenerico setor = new SetorGenerico();
        SetorAdm setor3 = new SetorAdm();
        
        int aux = 1;
        while (aux == 1) {// LAÇO DE REPETIÇÃO CONTENDO TODOS OS SETORES
            //MENU COM OPÇÕES DE SETORES...
            System.out.println("------------------------------- MENU PRINCIPAL ------------------------------");
            System.out.println("DIGITE - [1] - PARA IR AO SETOR OPERACIONAL");
            System.out.println("DIGITE - [2] - SETOR CLÍNICO");
            System.out.println("DIGITE - [3] - SETOR ADMINISTRATIVO");
            System.out.println("DIGITE - [0] - SAIR DO PROGRAMA\n");

            int opSetor = input.nextInt();//VALOR QUE IRÁ INICIAR O SWITCH COM TODOS OS SETORES
            switch (opSetor) {//SWICTH COM SETROES E SUAS RESPECTIVAS OPÇÕES...
                case 1://1ªOPÇÃO DO MENU PRINCIPAL | ENTRA NO SETOR OPERACIONAL
                    int auxSetor1 = 1;
                    while(auxSetor1 == 1){
                        System.out.println("------------------------------- SETOR OPERACIONAL -----------------------------");
                        System.out.println("O PACIENTE SÓ PODERÁ MARCAR 1 CONSULTA POR VEZ");
                        System.out.println("DIGITE - [1] - MARCAR CONSULTA PARA ODONTO");
                        System.out.println("DIGITE - [2] - MARCAR CONSULTA PARA FISIOTERAPIA");
                        System.out.println("DIGITE - [3] - MARCAR CONSULTA PARA NUTRICIONISTA");
                        System.out.println("DIGITE - [4] - MARCAR CONSULTA PRA PSICOLOGO(A)");
                        System.out.println("DIGITE - [5] -  VERIFICAR CONSULTAS ");
                        System.out.println("DIGITE - [0] - VOLTAR AO MENU PRINCIPAL");
                        
                        int optSetor1 = input.nextInt();
                        switch(optSetor1){
                            case 1://1ªOPÇÃO DO MENU SETOR OPERACIONAL
                                System.out.println("PARA CONTINUAR DIGITE O ID DO PACIENTE:");
                                int idP = input.nextInt();

                                if(setor.verificaIdP(idP) == true){//VERIFICAÇÃO SE ID EXISTE PELO MÉTODO verificaIdP()DA CLASSE SetorGenerico 
                                    setor.consultaOdonto(idP);//SE O ID É VERDADEIRO ENTÃO A CONSULTA É MARCADA PELO MÉDOTO consultaOdonto()DA CLASSE SetorGenerico 
                                    System.out.println("CONSULTA MARCADA COM SUCESSO !!!\n");
                                }else{
                                    System.out.println("PACIENTE INEXISTENTE !!!\n");
                                }
                                
                            break;  
                            
                            case 2://2ªOPÇÃO DO MENU SETOR OPERACIONAL
                                System.out.println("PARA CONTINUAR DIGITE O ID DO PACIENTE:");
                                int id = input.nextInt();
                                
                                if(setor.verificaIdP(id) == true){
                                    setor.consultaFisio(id);//SE O ID É VERDADEIRO ENTÃO A CONSULTA É MARCADA PELO MÉDOTO consultasFisio()DA CLASSE SetorGenerico 
                                    System.out.println("CONSULTA MARCADA COM SUCESSO !!!\n");
                                }else{
                                    System.out.println("PACIENTE INEXISTENTE !!!\n");
                                }
                                
                            break;   
                            
                            case 3://3ªOPÇÃO DO MENU SETOR OPERACIONAL
                                System.out.println("PARA CONTINUAR DIGITE O ID DO PACIENTE:");
                                int id_p = input.nextInt();
                                
                                if(setor.verificaIdP(id_p) == true){
                                    setor.consultaNutri(id_p);//SE O ID É VERDADEIRO ENTÃO A CONSULTA É MARCADA PELO MÉDOTO consultaNutri()DA CLASSE SetorGenerico 
                                    System.out.println("CONSULTA MARCADA COM SUCESSO !!!\n");
                                }else{
                                    System.out.println("PACIENTE INEXISTENTE !!!\n");
                                }
                                
                            break;  
                            
                            case 4:
                                System.out.println("PARA CONTINUAR DIGITE O ID DO PACIENTE:");
                                int id_P = input.nextInt();
                                
                                if(setor.verificaIdP(id_P) == true){
                                    setor.consultaPsico(id_P);
                                    System.out.println("CONSULTA MARCADA COM SUCESSO !!!\n");
                                }else{
                                    System.out.println("PACIENTE INEXISTENTE !!!\n");
                                }
                            break;    
                            case 5://5ªOPÇÃO DO MENU SETOR OPERACIONAL
                                System.out.println("DIGITE O ID DO PACIENTE PARA CONTINUAR");
                                int idPacient = input.nextInt();
                                if(setor.verificaIdP(idPacient) == true){
                                    System.out.println(setor.verificaConsultas(idPacient));
                                }else{
                                    System.out.println("PACIENTE INEXISTENTE\n");
                                }
                                
                            break;    
                                    
                            case 0://6ªOPÇÃO DO MENU SETOR OPERACIONAL
                                auxSetor1 = 0;
                                System.out.println("ADEUS !!\n");
                            break;
                            
                            default:
                                System.out.println("OPÇÃO INVÁLIDA !!\n");
                            break;    
                            
                        }
                    }
                    
                break;

                case 2://2ªOPÇÃO DO MENU PRINCIPAL | ENTRA NO SETOR CLÍNICO
                    int auxSetor2 = 1;
                    while (auxSetor2 == 1) {//LAÇO DE REPETIÇÃO CONTENDO O SETOR CLÍNICO
                        //OPÇÕES DO SETOR CLÍNICO
                        System.out.println("------------------------------- SETOR CLÍNICO -------------------------------");
                        System.out.println("DIGITE - [1] - PARA CADASTRAR PACIENTE");
                        System.out.println("DIGITE - [2] - PARA ATUALIZAR INFORMAÇÕES DO PRONTUÁRIO");
                        System.out.println("DIGITE - [3] - PARA REMOVER PACIENTE");
                        System.out.println("DIGITE - [4] - PARA LISTAR PACIENTES");
                        System.out.println("DIGITE - [0] - PARA RETORNAR AO MENU PRINCIPAL\n");

                        int opSetor2 = input.nextInt();//VALOR QUE IRÁ INICIAR O SWITCH COM AS OPÇÕES DO SETOR CLÍNICO
                        switch (opSetor2) {
                            case 1: //1ª OPÇÃO DO MENU SETOR CLÍNICO | CADASTRA PACIENTE

                                System.out.println("INSIRA O NOME:");
                                input.nextLine();
                                String nome = input.nextLine();
                                System.out.println("INSIRA A IDADE:");
                                int idade = input.nextInt();
                                System.out.println("INSIRA O CPF:");
                                long cpf = input.nextLong();
                                System.out.println("INSIRA O ENDEREÇO:");
                                input.nextLine();
                                String endereco = input.nextLine();
                                System.out.println("INSIRA SEXO 'M' MASCULINO 'F' FEMININO: ");
                                String sexo = input.nextLine();
                                System.out.println("INSIRA O TIPO SANGUINEO:");
                                String tSangue = input.nextLine();
                                System.out.println("");
                                //INSTANCIANDO A CLASSE "Paciente"
                                paciente = new Paciente(nome, idade, cpf, endereco,sexo, tSangue);
                                System.out.println(setor.cadastrar(paciente));//ATRAVÉS DO OBJETO setor2 EXECUTA A CHAMADA DO MÉTODO "cadastrar" QUE RECEBE UM OBJETO "Paciente"
                                
                                System.out.println("");
                                break;

                            case 2://2ª OPÇÃO DO MENU SETOR CLÍNICO | MENU DE ALTERAÇÃO DE PRONTUÁRIO  
                                int auxAltera = 1;
                                while (auxAltera == 1) {
                                    System.out.println("---------------------- SETOR CLÍNICO - ALTERAR PRONTUÁRIO -------------------");
                                    System.out.println("DIGITE - [1] - PARA ALTERAR NOME\nDIGITE - [2] - PARA ALTERAR IDADE\n"
                                            + "DIGITE - [3] - PARA ALTERAR CPF\nDIGITE - [4] - PARA ALTERAR ENDEREÇO\n"
                                            + "DIGITE - [5] - PARA ALTERAR SEXO\nDIGITE - [6] - PARA ALTERAR O TIPO SANGUINEO\n"
                                            + "DIGITE - [0] - PARA VOLTAR PARA MENU SETOR CLÍNICO\n");
                                    int opt = input.nextInt();// VALOR QUE RECEBE A OPÇÃO DE ALTERAÇÃO 
                                    switch (opt) {

                                        case 1:// 1ª OPÇÃO DO MENU ALTERAÇÕES | ALTERA NOME
                                            System.out.println("DIGITE O ID DO PACIENTE:");
                                            int id = input.nextInt();
                                            
                                            if (setor.verificaIdP(id) == true) {//MÉTODO DA CLASSE "SetorClinico" PARA ALTERAR O NOME, RECEBENDO COMO PARÂMETRO O ID DO PACIENTE E UM NOVO NOME
                                                System.out.println("DIGITE UM NOVO NOME:");
                                                input.nextLine();
                                                String nomeNovo = input.nextLine();
                                                setor.alterarNome(id, nomeNovo);
                                                System.out.println("NOME ALTERADO COM SUCESSO\n");
                                            } else {
                                                System.out.println("PACIENTE INEXISTENTE\n");
                                            }
                                            
                                            break;

                                        case 2://2ª OPÇÃO DO MENU DE ALTERAÇÕES | ALTERA IDADE
                                            System.out.println("DIGITE O ID DO PACIENTE:");
                                            int id2 = input.nextInt();

                                            if (setor.verificaIdP(id2) == true) {//MÉTODO DA CLASSE "SetorClinico" PARA ALTERAR A IDADE, RECEBENDO COMO PARÂMETRO O ID DO PACIENTE E UM NOVA IDADE
                                                System.out.println("DIGITE UM NOVA IDADE:");
                                                
                                                int novaIdade = input.nextInt();
                                                setor.alterarIdade(id2, novaIdade);
                                                System.out.println("IDADE ALTERADA COM SUCESSO\n");
                                            } else {
                                                System.out.println("PACIENTE INEXISTENTE\n");
                                            }
                                            break;

                                        case 3://3ª OPÇÃO DO MENU DE ALTERAÇÕES | ALTERA CPF
                                            System.out.println("DIGITE O ID DO PACIENTE:");
                                            int id3 = input.nextInt();

                                            if (setor.verificaIdP(id3) == true) {//MÉTODO DA CLASSE "SetorClinico" PARA ALTERAR O CPF, RECEBENDO COMO PARÂMETRO O ID DO PACIENTE E UM NOVO CPF
                                                System.out.println("DIGITE UM NOVO CPF:");
                                                long novoCpf = input.nextLong();
                                                setor.alterarCpf(id3, novoCpf);
                                                System.out.println("CPF ALTERADO COM SUCESSO\n");
                                            } else {
                                                System.out.println("PACIENTE INEXISTENTE\n");
                                            }
                                            break;

                                        case 4: //4ªOPÇÃO DO MENU DE ALTERAÇÕES | ALTERA ENDEREÇO
                                            System.out.println("DIGITE O ID DO PACIENTE:");
                                            int id4 = input.nextInt();
                                           
                                            if (setor.verificaIdP(id4) == true) {//MÉTODO DA CLASSE "SetorClinico" PARA ALTERAR O ENDEREÇO, RECEBENDO COMO PARÂMETRO O ID DO PACIENTE E UM NOVO ENDEREÇO
                                                System.out.println("DIGITE UM NOVO ENDEREÇO:");
                                                input.nextLine();
                                                String novoEndereco = input.nextLine();
                                                setor.alterarEndereco(id4, novoEndereco);
                                                System.out.println("ENDEREÇO ALTERADO COM SUCESSO !!!\n");
                                            } else {
                                                System.out.println("PACIENTE INEXISTENTE\n");
                                            }
                                            break;
                                            
                                        case 5://5ªOPÇÃO DO MENU ALTERAÇÕES | ALTERAR SEXO
                                            System.out.println("DIGITE O ID DO PACIENTE:");
                                            int id5 = input.nextInt();

                                            if (setor.verificaIdP(id5) == true) {//MÉTODO DA CLASSE "SetorClinico" PARA ALTERAR O SEXO, RECEBENDO COMO PARÂMETRO O ID DO PACIENTE E UM NOVO SEXO
                                                System.out.println("DIGITE UM NOVO SEXO:");
                                                input.nextLine();
                                                String sexoNovo = input.nextLine();
                                                setor.alterarSexo(id5, sexoNovo);
                                                System.out.println("ENDEREÇO ALTERADO COM SUCESSO !!!\n");
                                            } else {
                                                System.out.println("PACIENTE INEXISTENTE\n");
                                            }
                                            break;
                                        
                                        case 6:// 6ªOPÇÃO DO MENU ALTERAÇÕES | ALTERAR TIPO SANGUINEO
                                            System.out.println("DIGITE O ID DO PACIENTE:");
                                            int id6 = input.nextInt();

                                            if (setor.verificaIdP(id6) == true) {//MÉTODO DA CLASSE "SetorClinico" PARA ALTERAR O ENDEREÇO, RECEBENDO COMO PARÂMETRO O ID DO PACIENTE E UM NOVOTIPO SANGUINEO
                                                System.out.println("DIGITE UM TIPO SANGUINEO QUE DESEJA MODIFICAR:");
                                                input.nextLine();
                                                String novoSangue = input.nextLine();
                                                setor.alterarSangue(id6, novoSangue);
                                                System.out.println("ENDEREÇO ALTERADO COM SUCESSO !!!\n");
                                            } else {
                                                System.out.println("PACIENTE INEXISTENTE\n");
                                            }
                                            break;
                                            
                                        case 0://OPÇÃO DO MENU ALTERAÇÕES | VOLTAR AO MENU DO SETOR CLÍNICO
                                            auxAltera = 0;//CONDIÇÃO DE SAÍDA
                                            System.out.println("ADEUS !!!");
                                            break;

                                        default:
                                            System.out.println("OPÇÃO INVÁLIDA\n");
                                            break;
                                    }//... FIM DO SWITCH QUE CONTÉM O MENU ALTERAÇÃO
                                }//... FIM DO LAÇO DE REPETIÇÕES QUE CONTÉM O SWITCH MEU ALTERAÇÃO
                                break;

                            case 3: //3ª OPÇÃO DO MENU SETOR CLÍNICO | REMOVER PACIENTE
                                System.out.println("DIGITE O ID DO PACIENTE:");
                                int id_P = input.nextInt();
                                if (setor.verificaIdP(id_P) == true) {//metodo da classe Setor clinico para excluir paciente
                                    setor.remover(id_P);
                                    System.out.println("REMOVIDO COM SUCESSO !!!\n");
                                } else {
                                    System.out.println("PACIENTE INEXISTENTE\n");
                                }
                            break;

                            case 4://4ª OPÇÃO DO MENU SETOR CLÍNICO | LISTAR PACIENTES

                                if (setor.listar() == true) {//lista todos os pacientes

                                } else {
                                    System.out.println("LISTA VAZIA\n");
                                }
                                break;

                            case 0:
                                auxSetor2 = 0;//CONDIÇÃO DE SAÍDA
                                System.out.println("ADEUS !!!");
                        }//FIM DO SWITCH QUE CONTÉM O SETOR CLÍNICO
                    }//FIM DO LAÇO DE REPETIÇÃO COM O SETOR CLÍNICO

                    break;

                case 3: //3ª OPÇÃO DO MENU PRINCIPAL | MENU SETOR ADMINISTRATIVO
                        int auxSetor3 = 1;
                        while(auxSetor3 == 1){
                            System.out.println("---------------------------- SETOR ADMINISTRATIVO ----------------------------");
                            System.out.println("DIGITE - [1] - PARA CADASTRAR FUNCIONÁRIO  ");
                            System.out.println("DIGITE - [2] - PARA ATUALIZAR INFORMAÇÕES DO FUNCIONÁRIO ");
                            System.out.println("DIGITE - [3] - PARA REMOVER FUNCIONÁRIO ");
                            System.out.println("DIGITE - [4] - PARA LISTAR FUNCIONÁRIOS  ");
                            System.out.println("DIGITE - [5] - PARA GERAR RELATÓRIO DE CONSULTA");
                            System.out.println("DIGITE - [6] - PARA GERAR RELATÓRIO DE PACIENTE");
                            System.out.println("DIGITE - [0] - PARA VOLTAR AO MENU PRINCIPAL");
                            
                            int optSet3 = input.nextInt();
                            switch(optSet3){
                                case 1://1ªOPÇÃO DO MENU SETOR ADM | CADASTRAR FUNCIONÁRIO
                                    System.out.println("DIGITE O NOME DO FUNCIONÁRIO: ");
                                    input.nextLine();
                                    String nomeF = input.nextLine();
                                    System.out.println("DIGITE A IDADE: ");
                                    int idadeF = input.nextInt();
                                    System.out.println("DIGITE O CPF: ");
                                    long cpf_F = input.nextLong();
                                    System.out.println("DIGITE O SEXO: ");
                                    input.nextLine();
                                    String sexoF = input.nextLine();
                                    System.out.println("DIGITE O ENDEREÇO: ");
                                    String enderecoF = input.nextLine();
                                    System.out.println("DIGITE A FUNÇAO DO PROFISSIONAL: ");
                                    String funcaoF = input.nextLine();
                                    
                                    //INSTANCIANDO A CLASSE FUNCIONARIO
                                    funcionario = new Funcionario(nomeF, idadeF, cpf_F, enderecoF, funcaoF, sexoF);
                                    System.out.println(setor3.cadastraFunc(funcionario));
                                    
                                break;    
                                
                                case 2://2ªOPÇÃO DO SETOR ADM | MENU DE ATUALIZALÇÃO DE PROFICIONAIS
                                    int auxAltera3 = 1;
                                    while(auxAltera3 == 1){
                                        System.out.println("--------------- SETOR ADMINISTRATIVO - ATUALIZAÇÃO DE PROFICIONAIS ------------");
                                        System.out.println("DIGITE - [1] - PARA ALTERAR NOME\nDIGITE - [2] - PARA ALTERAR IDADE\n"
                                            + "DIGITE - [3] - PARA ALTERAR CPF\nDIGITE - [4] - PARA ALTERAR ENDEREÇO\n"
                                                + "DIGITE - [5] - PARA ALTERAR SEXO\nDIGITE - [6] - PARA ALTERAR TIPO SANGUINEO"
                                                + "\nDIGITE - [7] - PARA VOLTAR PARA MENU SETOR ADMINISTRATIVO");
                                        int op2 = input.nextInt();
                                        switch(op2){
                                            case 1: // 1ªOPÇÃO DO MENU ATUALIZAÇÃO DE FUNCIONÁRIO | ALTERAR NOME
                                                System.out.println("DIGITE O ID DO FUNCIONÁRIO:");
                                                int idF = input.nextInt();

                                                if(setor3.varificaIdF(idF) == true){//VERIFICA SE O ID DO FUNCIONÁRIO É VÁLIDO
                                                    
                                                    System.out.println("DIGITE O NOVO NOME DO FUNCIONÁRIO:");
                                                    input.nextLine();
                                                    String nome_F = input.nextLine();
                                                    setor3.alteraNomeF(idF, nome_F);//EFETUA CHAMADA DE METÓDO DE ALTERAÇÃO DE NOME
                                                    System.out.println("ATUALIZADO COM SUCESSO !!!\n");
                                                    
                                                }else{
                                                    System.out.println("FUNCIONÁRIO INEXISTENTE\n");
                                                }
                                            break;
                                                
                                            case 2:// 2ª OPÇÃO DO MENU ATUALIZAÇÕES DE FUNCIONÁRIO | ALTERAR IDADE
                                                System.out.println("DIGITE O ID DO FUNCIONÁRIO: ");
                                                int id_F = input.nextInt();
                                                
                                                if(setor3.varificaIdF(id_F) == true){//VERIFICA SE O ID DO FUNCIONÁRIO É VÁLIDO
                                                   
                                                    System.out.println("DIGITE A NOVA IDADE DO FUNCIONÁRIO:");  
                                                    int idade = input.nextInt();
                                                    setor3.alteraIdadeF(id_F, idade);//EFETUA CHAMADA DE MÉTODO DE ALTERAÇÃO DE IDADE
                                                    System.out.println("ATUALIZADO COM SUCESSO!!");
                                                    
                                                }else{
                                                    System.out.println("FUNCIONÀRIO INEXISTENTE!!");
                                                }
                                            break;
                                                
                                            case 3://3ª OPÇAO DO MENU ATUALIZAÇÕES DE FUNCIONÁRIO | ALTERA CPF
                                                System.out.println("DIGITE O ID DO FUNCIONÁRIO: ");
                                                int idFunc = input.nextInt();
                                                
                                                if(setor3.varificaIdF(idFunc) == true){//VERIFICA SE O ID DO FUNCIONÁRIO É VÁLIDO
                                                    
                                                    System.out.println("DIGITE O NOVO CPF DO FUNCIONÁRIO: ");
                                                    long cpfF = input.nextLong();
                                                    setor3.alteraCpfFunc(idFunc, cpfF);//EFETUA CHAMADA DE MÉTODO  DE ALTERAÇÃO DE CPF
                                                    System.out.println("ATUALIZADO COM SUCESSO!!");
                                                    
                                                }else{
                                                    System.out.println("FUNCIONÀRIO INEXISTENTE!!");
                                                }
                                                break;
                                                
                                            case 4://4ª OPÇÃO DE MENU ATUALIZAÇÕES DE FUNCIONÁRIO | ALTERA ENDEREÇO
                                                System.out.println("DIGITE O ID DO FUNCIONÁRIO: ");
                                                int id = input.nextInt();
                                                
                                                if( setor3.varificaIdF(id)== true){//VERIFICA SE O ID DO FUNCIONÁRIO É VÁLIDO
                                                   
                                                    System.out.println("DIGITE O NOVO ENDEREÇO DO FUNCIONÁRIO: ");
                                                    input.nextLine();
                                                    String endereco_F = input.nextLine();
                                                    setor3.alteraEndF(id, endereco_F);//EFETUA CHAMADA DE MÉTODO DE ALTERAÇÃO DE ENDEREÇO
                                                    System.out.println("\nALTERADO COM SUCESSO!!\n");
                                                    
                                                }else{
                                                    System.out.println("\nFUNCIONÀRIO INEXISTENTE!!\n");
                                                }
                                                break;
                                           
                                            case 5: //5ª OPÇÃO DO MENU ATUALIZAÇÕES DE FUNCIONÁRIO | ALTERA SEXO
                                                System.out.println("DIGITE O ID DO FUNCIONÁRIO: ");
                                                int id_Func = input.nextInt();
                                                
                                                if(setor3.varificaIdF(id_Func) == true){//VERIFICA SE O ID DO FUNCIONÁRIO É VÁLIDO
                                                    
                                                    System.out.println("DIGITE O NOVO SEXO DO FUNCIONÁRIO: ");
                                                    input.nextLine();
                                                    String sexo_F = input.nextLine();
                                                    setor3.alteraSexoF(id_Func, sexo_F);//EFETUA CHAMADA DE MÉTODO DE ALTERAÇÃO DE SEXO
                                                    System.out.println("\nALTERADO COM SUCESSO!!\n");
                                                    
                                                }else{
                                                    System.out.println("\nFUNCIONÀRIO INEXISTENTE!!\n");
                                                }
                                                break;
                                                
                                            case 6: //6ª OPÇÃO DO MENU ATUALIZAÇÕES DE FUNCIONÁRIO | ALTERA A FUNÇÃO
                                                System.out.println("\nDIGITE O ID DO FUNCIONÁRIO: \n");
                                                int cod = input.nextInt();
                                               
                                                if( setor3.varificaIdF(cod)== true){//VERIFICA SE O ID DO FUNCIONÁRIO É VÁLIDO
                                                   
                                                    System.out.println("DIGITE O NOVA FUNÇÃO DO FUNCIONÁRIO: ");
                                                    input.nextLine();
                                                    String funcao_F = input.nextLine();
                                                    setor3.alteraFuncao(cod, funcao_F);//EFETUA A CHAMADA DE MÉTODO DE ALTERAÇÃO DE FUNÇÃO
                                                    System.out.println("\nALTERADO COM SUCESSO!!\n");
                                                    
                                                }else{
                                                    System.out.println("\nFUNCIONÀRIO INEXISTENTE!!\n");
                                                }
                                            break;
                                                
                                            case 7: 
                                                auxAltera3 = 0;
                                                System.out.println("ADEUS!!!");
                                            break;
                                                
                                            default:
                                                System.out.println("OPÇÃO INVÁLIDA!!");
                                            break;
                                            
                                    }//FIM DO SWITCH MENU ALTERAÇÕES SETOR ADM
                                    
                                break;//FIM DO CASE 2 DO MENU ALTERAÇÕES DO SETOR ADM
                                
                            }//FIM DO LAÇO DO MENU ALTERAÇÕES DO SETOR ADM
                            break;        
                                case 3://3ª OPÇÃO DO MENU SETOR ADM | REMOVE UM FUNCIONÁRIO
                                    System.out.println("DIGITE O ID DO FUNCIONÁRO QUE DESEJA REMOVER:");
                                    int idfun = input.nextInt();
                                    
                                    if(setor3.varificaIdF(idfun) == true){//VERIFICA SE O ID DO FUNCIONÁRIO É VÁLIDO
                                        setor3.removeFunc(idfun);//CHAMA O MÉTODO QUE REMOVE FUNCIONÁRIO
                                        System.out.println(" \nREMOVIDO COM SUCESSO !!\n");
                                    }else{
                                        System.out.println("\nID DO FUNCIONÁRIO NÃO CONFERE !!\n");
                                    }
                                break;
                                
                                case 4://4ª OPÇÃO DO MENU SETOR ADM
                                    if(setor3.listarFun() == true){// VERIFICA SE A LISTA ONDE OS FUNCIONÁRIOS ESTÃO ARMAZENADOS POSSUI FUNCIONÁRIO
                                       //SE TIVER A FUNÇÃO RETORNA A TODOS OS FUNCIONÁRIOS CADASTRADOS
                                    }else{
                                         System.out.println("\nNENHUM FUNCIONÁRIO\n");
                                    }
                                break;    
                                
                                case 5://5ª OPÇÃO DO SETOR ADM | RELATÓRIO DE CONSULTA
                                    System.out.println("escreva aqui o relatório da consulta:");
                                    input.nextLine();
                                    String texto = input.nextLine();
                                   setor3.relatorioConsul(texto);//CONVERTE O TEXTO DIGITADO EM TXT NA ÁREA DE TRABALHO
                                    System.out.println("FEITO !!\n");
                                break;    
                                
                                case 6: // 6ªOPÇÃO DO SETOR ADM | RELATÓRIO DE PACIENTE
                                    System.out.println("escreva aqui o relatório do paciente:");
                                    input.nextLine();
                                    String txt = input.nextLine();
                                    setor3.relatorioPacient(txt);//CONVERTE O TEXTO DIGITADO EM TXT NA ÁREA DE TRABALHO
                                    System.out.println("FEITO !!\n");
                                break;    
                                
                                case 0:// 7ªOPÇÃO DO SETOR ADM | CONDIÇÃO DE SAÍDA
                                    auxSetor3 = 0;
                                    System.out.println("ADEUS !!!");
                                break;    
                                
                                default:
                                    System.out.println("\nOPÇÃO INVÁLIDA\n");
                                break;    
                        }//FIM DO SWITCH MENU SETOR ADM
                     }//FIM DO LAÇO DO MENU DO SETOR ADM
                break;

                case 0:
                    aux = 0; //CONDIÇÃO DE SAÍDA 
                    System.out.println("ADEUS !!!!");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }//... FIM DO SWITCH QUE CONTÉM TODOS OS SETORES

        }//...FIM DO LAÇO DE REPETIÇÕES COM TODOS OS SETORES

    }
}
