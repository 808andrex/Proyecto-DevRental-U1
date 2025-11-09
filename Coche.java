public class Coche extends Vehiculo{

    private int numPuertas;

    /**
     * Constructor por defecto
     */
    public Coche(){
    }

    /**
     * Constructor parametrizados para crear un nuevo coche 
     * @param placa
     * @param marca
     * @param modelo
     * @param precioDia
     * @param numPuertas
     */
    public Coche(String placa, String marca, String modelo, int precioDia, int numPuertas) {
        super(placa, marca, modelo, precioDia);
        this.numPuertas = numPuertas;
    }

    /**GETTER */
    /**
     * Obtiene el numero de puertas que tiene el coche
     * @return
     */
    public int getNumPuertas() {
        return numPuertas;
    }

    /**SETTER */
    /**
     * Establece el numero de puertas que tiene el coche
     * @param numPuertas
     */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
