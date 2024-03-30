package programaEntornos;

public class Baloncesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador jugador1 = new Jugador("Jorge Sanz", 26);
        Jugador jugador2 = new Jugador("Oscar Renero", 18); 
        
        System.out.println("Información del 1º jugador: " + jugador1.imprimirInformacion());
        System.out.println("Información del 2º jugador: " + jugador2.imprimirInformacion());

        Equipo equipo = new Equipo("Leganés", 10);
        System.out.println("Nombre del Equipo: " + equipo.obtenerNombre());
        System.out.println("El número de jugadores que tiene en plantilla: " + equipo.obtenerCantidadJugadores());
	}

}
