
package app.pedidos;


public class ValidacionService {

 public boolean validarCantidad(int cantidad) {
       
    System.out.println(" Verificando cantidad: " + cantidad);
        
        if (cantidad > 0) {
            System.out.println("Cantidad válida: OK");
            return true;
        } else {
            System.out.println("Cantidad inválida: CANTIDAD INCORRECTA");
            return false;
        }
         
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
