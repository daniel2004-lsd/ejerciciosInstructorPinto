import java.util.List;

public class Validador {
    public static boolean nombreValido(String nombre){
        return nombre != null && nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }

    public static boolean  documentoUnico(String documento, List<Aprendiz> existentes){
        for(Aprendiz a : existentes){
            if (a.getDocumento().equalsIgnoreCase(documento)) {
                return false;
            }
        }
        return true;
    }

    public static boolean fichaValida(String ficha){
        return ficha != null && ficha.matches("\\d{6}");
    } 
     public static boolean aprendizYaExiste(String documento, String ficha, List<Aprendiz> existentes) {
        for (Aprendiz a : existentes) {
            if (a.getDocumento().equals(documento) && a.getFicha().equals(ficha)) {
                return true;
            }
        }
        return false;  
    }
    
    public static boolean soloNumeros(String texto) {
    return texto != null && texto.matches("\\d+");
}


}
