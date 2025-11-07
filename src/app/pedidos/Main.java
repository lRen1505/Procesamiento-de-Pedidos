
package app.pedidos;


public class Main {


    public static void main(String[] args) {
      System.out.println("=== SISTEMA DE PROCESAMIENTO DE PEDIDOS ===\n");
    }
   LegacyBillingSystem legacySystem = new LegacyBillingSystem();
   FacturaService facturaService = new FacturaAdapter(legacySystem);
   PedidoFacade pedidoFacade = new PedidoFacade(facturaService);
   
}
