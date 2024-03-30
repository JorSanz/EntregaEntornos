package programaEntornos;

public class Equipo {
    private String nombre;
    private int cantidadJugadores;

    /**
     * El constructor.
     */
    public Equipo(String nombre, int cantidadJugadores) {
        this.nombre = nombre;
        this.cantidadJugadores = cantidadJugadores;
    }

    /**
     * Método para obtener el nombre del equipo.
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Método para obtener la cantidad de jugadores en el equipo.
     */
    public int obtenerCantidadJugadores() {
        return cantidadJugadores;
    }
}
