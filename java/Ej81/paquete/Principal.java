package paquete;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Animal> animales = new ArrayList<>();
		
		animales.add(new Perro("Toby"));
        animales.add(new Gato("Nami"));
        animales.add(new Perro("Chispa"));
        animales.add(new Gato("Crookie"));
        
        for (Animal animal : animales) {
            System.out.println(animal.nombre + " dice: " + animal.hacerSonido());
        }

	}

}
