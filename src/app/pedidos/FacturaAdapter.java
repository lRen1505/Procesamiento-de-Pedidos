
package app.pedidos;


public class FacturaAdapter extends FacturaService {
    private LegacyBillingSystem legacySystem;

    public FacturaAdapter(LegacyBillingSystem legacySystem) {
        this.legacySystem = legacySystem;
    }
    @Override
    public void generarFactura(String cliente, double total) {
        System.out.println("Adaptando llamada al sistema legacy...");
        legacySystem.createInvoice(cliente, total);
    }
}
