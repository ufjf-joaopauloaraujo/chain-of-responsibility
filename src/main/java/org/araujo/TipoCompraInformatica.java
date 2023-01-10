package org.araujo;

public class TipoCompraInformatica implements TipoCompra {

    private static TipoCompraInformatica tipoCompraInformatica = new TipoCompraInformatica();

    private TipoCompraInformatica() {};

    public static TipoCompraInformatica getTipoCompraInformatica() {
        return tipoCompraInformatica;
    }
}
