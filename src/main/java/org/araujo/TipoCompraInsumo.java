package org.araujo;

public class TipoCompraInsumo implements TipoCompra {

    private static TipoCompraInsumo tipoCompraInsumo = new TipoCompraInsumo();

    private TipoCompraInsumo() {};

    public static TipoCompraInsumo getTipoCompraInsumo() {
        return tipoCompraInsumo;
    }
}
