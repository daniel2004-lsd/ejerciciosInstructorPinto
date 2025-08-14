// aca estamos omplementando el patron de diseño de factory, lo
//cual creamos objetos( en este caso aprediz)

public class AprendizFactory {
    public static Aprendiz crearAprendiz(String nombre, String documento, String programa, String ficha) {
        return new Aprendiz(nombre, documento, programa, ficha);
    }
}
