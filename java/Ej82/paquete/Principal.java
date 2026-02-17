package paquete;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		
		figuras.add(new Circulo("Rojo", 5));
		figuras.add(new Rectangulo("Azul", 4, 6));
		
		
		double areaTotal = 0;
		for (Figura figura : figuras) {
            double area = figura.calcularArea();
            System.out.println("Área de " + figura.getClass().getSimpleName() + " " + figura.color + ": " + area);
            areaTotal += area;
        }
		System.out.println("\nÁrea total de todas las figuras: " + areaTotal);
	}

}
