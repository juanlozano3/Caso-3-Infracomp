import java.util.HashMap;
import java.util.Map;

public class Estado {
    // Constantes numéricas para los estados
    public static final int ENOFICINA = 0;
    public static final int RECOGIDO = 1;
    public static final int ENCLASIFICACION = 2;
    public static final int DESPACHADO = 3;
    public static final int ENENTREGA = 4;
    public static final int ENTREGADO = 5;
    public static final int DESCONOCIDO = -1;

    // Mapa para traducir los estados numéricos a texto alfabético
    private static final Map<Integer, String> estadoTexto = new HashMap<>();

    static {
        estadoTexto.put(ENOFICINA, "EN OFICINA");
        estadoTexto.put(RECOGIDO, "RECOGIDO");
        estadoTexto.put(ENCLASIFICACION, "EN CLASIFICACIÓN");
        estadoTexto.put(DESPACHADO, "DESPACHADO");
        estadoTexto.put(ENENTREGA, "EN ENTREGA");
        estadoTexto.put(ENTREGADO, "ENTREGADO");
        estadoTexto.put(DESCONOCIDO, "DESCONOCIDO");
    }

    public static String estadoAlfabético(int estado) {
        return estadoTexto.getOrDefault(estado, "DESCONOCIDO");
    }
}
