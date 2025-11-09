public class Vehiculo {
    
    private String placa;
    private String marca;
    private String modelo;
    private int precioDia;

    private static int contadorVehiculos ;

    /**
     * Constructor por defecto 
     */
    public Vehiculo(){
    }

    /**
     * Constructor con parametrizados para crear un nuevo vehiculos
     * Cada vez que se crea un vehículo con este constructor, incrementa el contador.
     * @param placa
     * @param marca
     * @param modelo
     * @param precioDia
     */
    public Vehiculo(String placa, String marca, String modelo, int precioDia) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.setPrecioDia(precioDia);
        contadorVehiculos++;
    }

    /**GETTERS */
    /**
     * Obtiene la placa del vehiculo
     * @return
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Obtiene la marca del vehiculo
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtienen el modelo del vehiculo
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtienen el precio del vehiculo
     * @return
     */
    public int getPrecioDia() {
        return precioDia;
    }

    /**
     * Obtiene el contador de vehiculos registrados en el sistema
     * @return
     */
    public static int getContadorVehiculos() {
        return contadorVehiculos;
    }
    /**SETTERS */
    /**
     * Establece la placa del vehiculo 
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Establece la marca del vehiculo
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Establece el modelo del vehiculo
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Establece con validacion el precio por dia del vehiculo para poder alquilarlo
     * @param precioDia
     * @throws IllegalArgumentException
     */
    public final void setPrecioDia(int precioDia){
        if(precioDia <= 0){
            throw new IllegalArgumentException("El precio por dia debe ser mayor que cero");
        }
        this.precioDia = precioDia;
    }
}
