
package app.pedidos;


public class ValidacionService {

    boolean validarCantidad(int cantidad) {
        
    }

 public boolean validarStock(String producto, int cantidad) {
        
   System.out.println("Verificando stock de: " + producto);
        
        if (cantidad <= 10) {
            System.out.println("Stock disponible: OK");
            return true;
        } else {
            System.out.println(" Stock insuficiente: NO HAY STOCK");
            return false;
        }
    }
}
