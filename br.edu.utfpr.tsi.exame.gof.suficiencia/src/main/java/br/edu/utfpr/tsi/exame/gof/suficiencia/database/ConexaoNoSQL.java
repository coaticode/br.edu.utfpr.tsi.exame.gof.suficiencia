package br.edu.utfpr.tsi.exame.gof.suficiencia.database;

public class ConexaoNoSQL implements ConexaoBanco{

	private String id;

    public ConexaoNoSQL() {
        this.id = Integer.toHexString(System.identityHashCode(this));
    }

    @Override
    public void conectar() {
        System.out.println("[NoSQL] Conexão 0x" + id + " ativa (MongoDB).");
    }

    @Override
    public String getTipo() { 
    	return "Não-Somente-Relacional (NoSQL)";
    }
}
