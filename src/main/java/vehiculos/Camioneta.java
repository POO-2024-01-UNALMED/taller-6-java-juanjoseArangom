package vehiculos;

public class Camioneta extends Vehiculo{
    private boolean volco;
    private static int cantidadCamionetas = 0;

    // Constructor
    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        cantidadCamionetas++;
        this.fabricante.aumentaCantidadVentas();
    }

    // Getters
    public boolean isVolco() {
        return volco;
    }

    public static int getCantidadCamionetas() {
        return cantidadCamionetas;
    }

    //Setters
    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}
