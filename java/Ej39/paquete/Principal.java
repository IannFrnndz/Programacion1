package paquete;

public class Principal {
public static void main(String[] args) {
	Lavadora lavadora = new Lavadora("Bosch", 300.5, 50.5 );
	
	lavadora.mostrarDatos();
	
	Televisor televisor = new Televisor("Samsung", 500.6, 10);
	
	televisor.mostrarDatos();
}
}
