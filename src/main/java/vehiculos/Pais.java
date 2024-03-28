package vehiculos;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private int cantidadVentas;
    private static ArrayList<Pais> paises = new ArrayList<Pais>();

    // Constructor
    public Pais() {
        this(null);
    }

    public Pais(String nombre) {
        this.nombre = nombre;
        paises.add(this);
    }

    public static Pais paisMasVendedor() {
        Pais mayor = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getCantidadVentas() > mayor.getCantidadVentas()) {
                mayor = pais;
            }
        }
        return mayor;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void aumentaCantidadVentas() {
        cantidadVentas++;
    }
}
