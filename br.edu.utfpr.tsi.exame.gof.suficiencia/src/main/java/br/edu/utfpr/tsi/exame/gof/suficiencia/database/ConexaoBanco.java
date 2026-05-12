package br.edu.utfpr.tsi.exame.gof.suficiencia.database;

public interface ConexaoBanco {
	void conectar();
    String getTipo();
}
