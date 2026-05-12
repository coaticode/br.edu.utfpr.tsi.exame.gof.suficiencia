package br.edu.utfpr.tsi.exame.gof.comportamentais;


public class SetorTIObserver implements RegistroObserver {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("[OBSERVER TI] Log de Segurança: " + mensagem);
    }
}
