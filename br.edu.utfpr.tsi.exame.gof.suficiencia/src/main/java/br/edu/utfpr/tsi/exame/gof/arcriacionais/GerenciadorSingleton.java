package br.edu.utfpr.tsi.exame.gof.arcriacionais;

import br.edu.utfpr.tsi.exame.gof.suficiencia.database.ConexaoBanco;

/**
 	> Padrão de Projeto: Singleton
 	> Justificativa: Garante uma única instância do gerenciador de conexões em toda a aplicação,
 	> evitando a sobrecarga do banco de dados com múltiplas aberturas de conexões simultâneas.
 */

public class GerenciadorSingleton {
    private static GerenciadorSingleton instancia;
    private ConexaoBanco conexaoBanco;
    
    private String status;
    private String idConexao;
    
    
    
   //contrutor privado
    private GerenciadorSingleton() {
        this.status = "Conexão Inativa";
        this.idConexao = Integer.toHexString(System.identityHashCode(this));
        
        System.out.println("Instanciando o Gerenciador de Conexão pela primeira vez.");
    }

    //metodo estatico
    public static synchronized GerenciadorSingleton getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorSingleton();
        }
        return instancia;
    }

    public void conectar() {
        this.status = "Conexão ativa com o Banco de Dados ";
        System.out.println(status + " " + idConexao);
    }

   
    // CONTROLE DA FACTORY
    public void definirTipoBanco(String tipo) {
    	if (this.conexaoBanco == null) {
            this.conexaoBanco = ConexaoFactory.criarConexao(tipo);
            System.out.println("[SINGLETON] Banco definido com sucesso: " + tipo);
            
        } else {
           
            throw new IllegalStateException("[ERRO CRÍTICO] Tentativa de redefinir o banco para " + tipo 
                + ". O Singleton já está operando com " + conexaoBanco.getTipo());
        }
    }
    
    public void realizarOperacao() {
        if (conexaoBanco != null) {
            conexaoBanco.conectar();
        }
    }
    
    
    public String getStatus() {
        return status;
    }
    
    public String getIdConexao() {
        return idConexao;
    }
}