package vehiculos;

public class Camion extends Vehiculo{
    private int ejes;
    private static int cantidadCamiones = 0;

    // Constructor
    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        cantidadCamiones++;
        this.fabricante.aumentaCantidadVentas();
    }

    // Getters
    public int getEjes() {
        return ejes;
    }

    public static int getCantidadCamiones() {
        return cantidadCamiones;
    }

    //Setters
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
}
