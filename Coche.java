public class Coche extends Vehiculo{
    private int numPuertas;

    public Coche(String placa, String marca, String modelo, int precioDia, int numPuertas) {
        super(placa, marca, modelo, precioDia);
        this.numPuertas = numPuertas;
    }

    /**GETTER */
    public int getNumPuertas() {
        return numPuertas;
    }

    /**SETTER */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
