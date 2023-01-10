package org.araujo;

public class AprovadorInfraestrutura extends Aprovador {
    
    public AprovadorInfraestrutura(Aprovador aprovador) {
        listaTipoCompra.add(TipoCompraInfraestrutura.getTipoCompraInfraestrutura());
        listaTipoCompra.add(TipoCompraMobilia.getTipoCompraMobilia());
        setProximoAprovador(aprovador);
    }
    
    public String getDescricaoCargo() {
        return "Aprovador de compra para estrutura";
    }
}
