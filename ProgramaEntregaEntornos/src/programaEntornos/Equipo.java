package programaEntornos;

/**
 * La clase que representa al equipo.
 * @version 1.0.11
 * @author jsanz
 */

public class Equipo {
    private String nombre;
    private int cantidadJugadores;

    /**
     * Creamos el constructor.
     * @param nombre (Nombre del equipo)
     * @param cantidadJugadores (El número de jugadores que tiene el equipo)
     */
    public Equipo(String nombre, int cantidadJugadores) {
        this.nombre = nombre;
        this.cantidadJugadores = cantidadJugadores;
    }

    /**
     * Para ver el nombre del equipo.
     * @return (devuelve el nombre del equipo)
     */
    public String nombreEquipo() {
        return nombre;
    }

    /**
     * Para ver la cantidad de jugadores del equipo.
     * @return (devuelve la cantidad de jugadores que tiene el equipo)
     */
    public int cantidadJugadores() {
        return cantidadJugadores;
    }
}
