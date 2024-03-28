package vehiculos;
import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int cantidadVentas;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

    // Constructor
    public Fabricante() {
        this(null, null);
    }

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante mayor = fabricantes.get(0);
        for (Fabricante fabricante : fabricantes) {
            if (fabricante.getCantidadVentas() > mayor.getCantidadVentas()) {
                mayor = fabricante;
            }
        }
        return mayor;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void aumentaCantidadVentas() {
        cantidadVentas++;
    }
}
