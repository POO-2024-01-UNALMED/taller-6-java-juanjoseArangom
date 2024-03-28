package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    private static int cantidadAutomoviles = 0;

    // Constructor
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        cantidadAutomoviles++;
        this.fabricante.aumentaCantidadVentas();
    }

    // Getters
    public int getPuestos() {
        return puestos;
    }

    public static int getCantidadAutomoviles() {
        return cantidadAutomoviles;
    }

    //Setters
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}