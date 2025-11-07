
package app.pedidos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ComprobanteService {

 public String generarComprobante(String cliente, String producto, double subtotal, double igv, double total) {
      LocalDateTime ahora = LocalDateTime.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
      String fechaHora = ahora.format(formatter); 
    }
    
}
