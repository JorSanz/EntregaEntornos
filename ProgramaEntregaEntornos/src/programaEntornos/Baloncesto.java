package programaEntornos;

public class Baloncesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador jugador1 = new Jugador("Jorge Sanz", 26);
        Jugador jugador2 = new Jugador("Oscar Renero", 18); 
        
        System.out.println("Informaci�n del 1� jugador: " + jugador1.imprimirInformacion());
        System.out.println("Informaci�n del 2� jugador: " + jugador2.imprimirInformacion());

        Equipo equipo = new Equipo("Legan�s", 10);
        System.out.println("Nombre del Equipo: " + equipo.obtenerNombre());
        System.out.println("El n�mero de jugadores que tiene en plantilla: " + equipo.obtenerCantidadJugadores());
	}

}
