package org.araujo;

import java.util.ArrayList;

public abstract class Aprovador {

    protected ArrayList listaTipoCompra = new ArrayList();
    private Aprovador proximoAprovador;


    public Aprovador getProximoAprovador() {
        return proximoAprovador;
    }

    public void setProximoAprovador(Aprovador proximoAprovador) {
        this.proximoAprovador = proximoAprovador;
    }
    
    public abstract String getDescricaoCargo();
    
    public String aprovaCompra(SolicitacaoCompra solicitacaoCompra) {
        if (listaTipoCompra.contains(solicitacaoCompra.getTipoCompra())) {
            return getDescricaoCargo();
        }
        else {
            if (proximoAprovador != null) {
                return proximoAprovador.aprovaCompra(solicitacaoCompra);
            }
            else 
            {
                return "Sem aprovação";
            }
        }        
    }
}
