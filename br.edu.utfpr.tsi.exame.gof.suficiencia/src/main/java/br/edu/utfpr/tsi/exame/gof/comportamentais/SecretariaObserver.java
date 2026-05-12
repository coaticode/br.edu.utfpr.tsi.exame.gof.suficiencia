package br.edu.utfpr.tsi.exame.gof.comportamentais;

public class SecretariaObserver implements RegistroObserver {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("[OBSERVER SECRETARIA] Notificação recebida: " + mensagem);
    }
}