package programaEntornos;

/**
 * La clase que representa a cada jugador.
 * @version 1.0.11
 * @author jsanz
 */

public class Jugador {
    private String nombre;
    private int edad;
    private float altura;

    /**
     * Creamos el constructor
     * @param nombre (Nombre del jugador)
     * @param edad (Cuantos años tiene el jugador)
     */
   
    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Para ver la información del jugador.  
     * @return Devuelve el nombre y la edad del jugador.
     */
    public String informacionJugador() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }

    /**
     * Para ver si el jugador es mayor de edad.
     * @return devuelve "true" si el jugador es mayor de edad, y devuelve "false" si es menor.
     */
     
    public boolean mayorDeEdad() {
        return edad >= 18;
        
    }
}
