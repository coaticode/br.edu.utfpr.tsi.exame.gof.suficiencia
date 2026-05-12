package br.edu.utfpr.tsi.exame.gof.comportamentais;

import java.util.List;

import br.edu.utfpr.tsi.exame.gof.arcriacionais.*;
import br.edu.utfpr.tsi.exame.gof.suficiencia.model.Usuario;

/**
* Padrão: Strategy (Contexto)
* Justificativa: Permite que o sistema de Registro suporte multiplos 
* formatos de exportação (JSON, Texto ....) sem acoplar a lógica de negocio 
* aos algoritmos de formatação. A estratégia pode ser trocada em tempo de 
* execução conforme necessidade.
*/
public class ExportadorContexto {
    private ExportStrategy strategy;

    public void setStrategy(ExportStrategy strategy) {
        this.strategy = strategy;
    }

    public void executarExportacao(List<Usuario> lista) {
        if (strategy == null) {
            System.err.println("Nenhuma estratégia de exportação definida!");
            return;
        }
        strategy.exportar(lista);
    }
}