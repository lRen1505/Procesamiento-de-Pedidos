
package app.pedidos;

public class PedidoFacade {
    private ValidacionService validacionService;
    private CalculoService calculoService;
    private RegistroService registroService;
    private ComprobanteService comprobanteService;
    private FacturaService facturaService;
    
    public PedidoFacade(FacturaService facturaService) {
        this.validacionService = new ValidacionService();
        this.calculoService = new CalculoService();
        this.registroService = new RegistroService();
        this.comprobanteService = new ComprobanteService();
        this.facturaService = facturaService;
    }
   
}
