package restriccion;

import java.math.BigDecimal;

public class FabricaServicio {

    public static ServicioRestriccion getServicio(String ciudad) {
        ServicioRestriccion resultado = null;
        if ("Medellín".equals(ciudad)) {
            resultado = new ServicioRestriccionMedellin();
        } else if ("Bogotá".equals(ciudad)) {
            resultado = new ServicioRestriccionBogota();
        } else if ("Cali".equals(ciudad)) {
            resultado = new ServicioRestriccionCali();
        } else {
            throw new UnsupportedOperationException("La ciudad " + ciudad + " no es soportada.");
        }

        return resultado;
    }

}
