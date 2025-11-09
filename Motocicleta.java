public class Motocicleta extends Vehiculo{
    
    private int cilindrada;

    /**
     * Contrusctor por defecto
     */
    public Motocicleta(){
    }

    /**
     * Contructor parametrizados para crear un nueva motocicleta
     * @param placa
     * @param marca
     * @param modelo
     * @param precioDia
     * @param cilindrada
     */
    public Motocicleta(String placa, String marca, String modelo, int precioDia, int cilindrada) {
        super(placa, marca, modelo, precioDia);
        this.cilindrada = cilindrada;
    }
    
    /**GETTER */
    /**
     * Obtiene la cilindrada de la moticicleta
     * @return
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**SETTER */
    /**
     * Establece con parametro la cilindrada de la moticicleta
     * @param cilindrada
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
