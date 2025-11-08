public class Motocicleta extends Vehiculo{
    private int cilindrada;

    public Motocicleta(String placa, String marca, String modelo, int precioDia, int cilindrada) {
        super(placa, marca, modelo, precioDia);
        this.cilindrada = cilindrada;
    }
    
    /**GETTER */
    public int getCilindrada() {
        return cilindrada;
    }

    /**SETTER */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
