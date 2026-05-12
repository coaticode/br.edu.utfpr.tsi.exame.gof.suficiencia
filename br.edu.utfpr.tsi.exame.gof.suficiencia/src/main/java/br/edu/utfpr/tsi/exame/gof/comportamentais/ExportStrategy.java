package br.edu.utfpr.tsi.exame.gof.comportamentais;

import java.util.List;

import br.edu.utfpr.tsi.exame.gof.suficiencia.model.Usuario;

public interface ExportStrategy {
	void exportar(List<Usuario> usuarios);
}
