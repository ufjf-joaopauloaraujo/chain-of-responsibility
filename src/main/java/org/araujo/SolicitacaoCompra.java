package org.araujo;

public class SolicitacaoCompra {

    private TipoCompra tipoCompra;

    public SolicitacaoCompra(TipoCompra tipoCompra) {
        this.tipoCompra = tipoCompra;
    }
    
    public TipoCompra getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(TipoCompra tipoCompra) {
        this.tipoCompra = tipoCompra;
    }
    
}
