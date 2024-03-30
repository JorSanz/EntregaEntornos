package programaEntornos;

/**
 * @version 1.0.11
 * @author jsanz
 */

public class Baloncesto {
	
	/**
	 * Esta clase es la main donde probamos el programa llamando a los metodos.
	 * @param args (He creado 2 jugadores y un equipo) 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugador jugador1 = new Jugador("Jorge Sanz", 26);
        Jugador jugador2 = new Jugador("Sergio Sanz", 17); 
        
        System.out.println("Información del 1º jugador: " + jugador1.informacionJugador());
        System.out.println("¿El jugador 1 es mayor de edad?: " + jugador1.mayorDeEdad());
        
        System.out.println("Información del 2º jugador: " + jugador2.informacionJugador());
        System.out.println("¿El jugador 2 es mayor de edad?: " + jugador2.mayorDeEdad());

        Equipo equipo = new Equipo("Leganés", 10);
        System.out.println("Nombre del Equipo: " + equipo.nombreEquipo());
        System.out.println("El número de jugadores que tiene en plantilla: " + equipo.cantidadJugadores());
	}

}
