package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;

    // Constructor
    public Fabricante() {
        this(null, null);
    }

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Fabricante fabricaMayorVentas

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
