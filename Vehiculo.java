public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int precioDia;

    private static int contadorVehiculos ;

    public Vehiculo(String placa, String marca, String modelo, int precioDia) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precioDia = precioDia;
        contadorVehiculos++;
    }

    /**GETTERS */
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public static int getContadorVehiculos() {
        return contadorVehiculos;
    }
    /**SETTERS */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioDia(int precioDia) {
        if(precioDia > 0){
            throw new IllegalArgumentException("");
        }
        this.precioDia = precioDia;
    }
}
