package org.araujo;

public class TipoCompraEscritorio implements TipoCompra {

    private static TipoCompraEscritorio tipoCompraEscritorio = new TipoCompraEscritorio();

    private TipoCompraEscritorio() {};
    
    public static TipoCompraEscritorio getTipoCompraEscritorio() {
        return tipoCompraEscritorio;
    }
}
