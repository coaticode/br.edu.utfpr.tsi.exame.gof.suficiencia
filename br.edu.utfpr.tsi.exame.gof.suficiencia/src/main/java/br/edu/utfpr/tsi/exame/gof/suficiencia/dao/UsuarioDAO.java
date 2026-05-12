package br.edu.utfpr.tsi.exame.gof.suficiencia.dao;

import java.util.List;

import br.edu.utfpr.tsi.exame.gof.comportamentais.RegistroObserver;
import br.edu.utfpr.tsi.exame.gof.suficiencia.model.Usuario;

public interface UsuarioDAO {
	List<Usuario> listarTodos();
	
	void adicionarObservador(RegistroObserver observer);
    void removerObservador(RegistroObserver observer);
}
