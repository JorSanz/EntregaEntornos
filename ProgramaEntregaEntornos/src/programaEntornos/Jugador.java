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
     * Método para imprimir la información del jugador.
     */
    public String imprimirInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }

    /**
     * Método para determinar si el jugador es mayor de edad.
     */
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
