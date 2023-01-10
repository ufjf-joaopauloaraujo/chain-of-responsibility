package org.araujo;

public class TipoCompraInfraestrutura implements TipoCompra {

    private static TipoCompraInfraestrutura tipoCompraInfraestrutura = new TipoCompraInfraestrutura();

    private TipoCompraInfraestrutura() {};
    
    public static TipoCompraInfraestrutura getTipoCompraInfraestrutura() {
        return tipoCompraInfraestrutura;
    }

}
