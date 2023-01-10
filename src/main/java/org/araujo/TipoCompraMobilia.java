package org.araujo;

public class TipoCompraMobilia implements TipoCompra {

    private static TipoCompraMobilia tipoCompraMobilia = new TipoCompraMobilia();

    private TipoCompraMobilia() {};
    
    public static TipoCompraMobilia getTipoCompraMobilia() {
        return tipoCompraMobilia;
    }

}
