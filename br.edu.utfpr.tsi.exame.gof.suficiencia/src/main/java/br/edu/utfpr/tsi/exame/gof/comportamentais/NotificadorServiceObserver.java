package br.edu.utfpr.tsi.exame.gof.comportamentais;

import java.util.ArrayList;
import java.util.List;

/**
 * Padrão: Observer (Subject/assunto)
 * Justificativa: Permite que diferentes setores da instituição sejam notificados 
 * sobre eventos no registro acadêmico como exemplo, sem que o DAO precise conhecer cada setor 
 * individualmente (Desacoplamento).
 */
public class NotificadorServiceObserver {
    private List<RegistroObserver> observadores = new ArrayList<>();

    public void adicionarInteressado(RegistroObserver obs) {
        observadores.add(obs);
    }

    public void emitirAlerta(String msg) {
        for (RegistroObserver obs : observadores) {
            obs.atualizar(msg);
        }
    }
}