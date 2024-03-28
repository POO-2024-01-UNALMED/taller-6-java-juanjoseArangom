package vehiculos;

public class Pais {
    private String nombre;

    // Constructor
    public Pais() {
        this(null);
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
