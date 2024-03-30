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
     * M�todo para obtener el nombre del equipo.
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * M�todo para obtener la cantidad de jugadores en el equipo.
     */
    public int obtenerCantidadJugadores() {
        return cantidadJugadores;
    }
}
