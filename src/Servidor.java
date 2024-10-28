import java.io.*;
import java.net.*;
import java.util.*;

public class Servidor {
    private final Map<String, Map<String, Integer>> paquetes;

    public Servidor() {
        paquetes = new HashMap<>();
    }
    
    //Conultar el estado de un paquete
    public String consultarPaquete(String id) {
        Map<String, Integer> paquete = paquetes.get(id);
        if (paquete == null) {
            return "DESCONOCIDO";
        }
        return Estado.estadoAlfabético(paquete.get("estado"));
    }

}
