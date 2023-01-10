package org.araujo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolicitacaoCompraTest {

    AprovadorInsumos aprovadorInsumos;
    AprovadorInformatica aprovadorInformatica;
    AprovadorInfraestrutura aprovadorInfraestrutura;

    @BeforeEach
    void setUp() {
        aprovadorInsumos = new AprovadorInsumos(null);
        aprovadorInformatica = new AprovadorInformatica(aprovadorInsumos);
        aprovadorInfraestrutura = new AprovadorInfraestrutura(aprovadorInformatica);
    }

    @Test
    void deveRetornarAprovadorEstruturaParaCompraInfraestrutura() {
        assertEquals("Aprovador de compra para estrutura", aprovadorInfraestrutura.aprovaCompra(new SolicitacaoCompra(TipoCompraInfraestrutura.getTipoCompraInfraestrutura())));
    }

    @Test
    void deveRetornarAprovadorEstruturaParaCompraMobilia() {
        assertEquals("Aprovador de compra para estrutura", aprovadorInfraestrutura.aprovaCompra(new SolicitacaoCompra(TipoCompraMobilia.getTipoCompraMobilia())));
    }

    @Test
    void deveRetornarAprovadorInsumoParaCompraInsumo() {
        assertEquals("Aprovador de Compra de Insumos", aprovadorInfraestrutura.aprovaCompra(new SolicitacaoCompra(TipoCompraInsumo.getTipoCompraInsumo())));
    }

    @Test
    void deveRetornarAprovadorInformaticaParaCompraInformatica() {
        assertEquals("Aprovador de compra de Informática", aprovadorInfraestrutura.aprovaCompra(new SolicitacaoCompra(TipoCompraInformatica.getTipoCompraInformatica())));
    }

    @Test
    void deveRetornarSemAprovacaoParaCompraEscritorio() {
        assertEquals("Sem aprovação", aprovadorInfraestrutura.aprovaCompra(new SolicitacaoCompra(TipoCompraEscritorio.getTipoCompraEscritorio())));
    }

}