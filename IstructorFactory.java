// aca estamos omplementando el patron de diseño de factory, lo
// cual creamos objetos( en este caso istructor)

public class IstructorFactory {
    public static Instructor crear(String nombre , String documento, String area){
        return new Instructor(nombre, documento, area);
    }
}
