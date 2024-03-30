package programaEntornos;

public class Jugador {
    private String nombre;
    private int edad;
    private float altura;

    /**
     * Creamos el constructor.
     */
    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Para ver la información del jugador.
     */
    public String informacionJugador() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }

    /**
     * Para ver si el jugador es mayor de edad.
     */
    public boolean mayorDeEdad() {
        return edad >= 18;
        
    }
}
