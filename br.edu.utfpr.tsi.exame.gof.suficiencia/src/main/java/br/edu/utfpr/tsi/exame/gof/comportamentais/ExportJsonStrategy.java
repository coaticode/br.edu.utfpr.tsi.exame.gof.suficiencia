package br.edu.utfpr.tsi.exame.gof.comportamentais;

import java.util.List;

import br.edu.utfpr.tsi.exame.gof.suficiencia.model.Usuario;

public class ExportJsonStrategy implements ExportStrategy{

	@Override
	public void exportar(List<Usuario> usuarios) {
		System.out.println("[STRATEGY] Exportando para Formato JSON (.json)...");
        System.out.println("[");
        for (Usuario u : usuarios) {
            System.out.println("  { \"id\": " + u.getId() + ", \"nome\": \"" + u.getNome() + "\" },");
        }
        System.out.println("]");
    }		

}
