public class DatosInvalidosException extends Exception{

    /**
     * Constructor que recibe un mensaje detallado sobre el error
     * @param mensaje
     */
    public DatosInvalidosException(String mensaje) {
        super(mensaje);
    }
}