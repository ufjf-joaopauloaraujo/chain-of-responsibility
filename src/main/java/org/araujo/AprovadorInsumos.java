package org.araujo;

public class AprovadorInsumos extends Aprovador {

    public AprovadorInsumos(Aprovador aprovador) {
        listaTipoCompra.add(TipoCompraInsumo.getTipoCompraInsumo());
        setProximoAprovador(aprovador);
    }
    
    public String getDescricaoCargo() {
        return "Aprovador de Compra de Insumos";
    }

}
