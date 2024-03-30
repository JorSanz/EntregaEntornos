package programaEntornos;

public class Jugador {
    private String nombre;
    private int edad;
    private float altura;

    /**
     * Constructor de la clase Jugador.
     */
    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * M�todo para imprimir la informaci�n del jugador.
     */
    public String imprimirInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }

    /**
     * M�todo para determinar si el jugador es mayor de edad.
     */
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
