package org.araujo;

public class AprovadorInformatica extends Aprovador {

    public AprovadorInformatica(Aprovador aprovador) {
        listaTipoCompra.add(TipoCompraInformatica.getTipoCompraInformatica());
        setProximoAprovador(aprovador);
    }
    
    public String getDescricaoCargo() {
        return "Aprovador de compra de Informática";
    }

}
