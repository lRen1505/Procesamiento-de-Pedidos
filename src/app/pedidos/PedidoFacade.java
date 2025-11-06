
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
    public String procesarPedido(String cliente, String producto, int cantidad) {
        System.out.println("\n===== INICIANDO PROCESO DE PEDIDO =====\n");
        
        
        if (!validacionService.validarCantidad(cantidad)) {
            return "ERROR: La cantidad debe ser positiva";
        }
        
        
        if (!validacionService.validarStock(producto, cantidad)) {
            return "ERROR: No hay suficiente stock para el producto";
        }
        double subtotal = calculoService.calcularSubtotal(producto, cantidad);
        double igv = calculoService.calcularIGV(subtotal);
        double total = calculoService.calcularTotal(subtotal, igv);
}
