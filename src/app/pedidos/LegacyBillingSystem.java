/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.pedidos;

/**
 *
 * @author yusuk
 */
public class LegacyBillingSystem {

    void createInvoice(String customerName, double amount) {
        System.out.println("Factura creada correctamente");
        System.out.println("   Cliente: " + customerName);
        System.out.println("   Monto: S/." + String.format("%.2f", amount));
        System.out.println("   Estado: Emitido");   
    }
    
}
