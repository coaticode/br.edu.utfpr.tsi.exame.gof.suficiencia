package br.edu.utfpr.tsi.exame.gof.suficiencia.database;

public class ConexaoSQL implements ConexaoBanco{
	private String id;
    
    public ConexaoSQL() {
        this.id = Integer.toHexString(System.identityHashCode(this));
    }

    @Override
    public void conectar() {
        System.out.println("[SQL] Conexão 0x" + id + " ativa (MySQL/PostgreSQL).");
    }

    @Override
    public String getTipo() { 
    	return "Relacional (SQL)";
    }
}
