package programaEntornos;

public class Equipo {
    private String nombre;
    private int cantidadJugadores;

    /**
     * Creamos el constructor.
     */
    public Equipo(String nombre, int cantidadJugadores) {
        this.nombre = nombre;
        this.cantidadJugadores = cantidadJugadores;
    }

    /**
     * Para ver el nombre del equipo.
     */
    public String nombreEquipo() {
        return nombre;
    }

    /**
     * Para ver la cantidad de jugadores del equipo.
     */
    public int cantidadJugadores() {
        return cantidadJugadores;
    }
}
