
public class Main {

	  public static void main(String[] args) {
		  
		  Perro perro = new Perro("Logan");
		  Loro loro = new Loro("Mapache");
		  Tiburon tiburon = new Tiburon("Dibu");
		  
		  System.out.println("SISTEMA DE ANIMALES");
		  
		  
		  System.out.println("PERRO");

		  perro.comer();
		  perro.hacerRuido();
		  perro.estaContento();
		  
		  
		  System.out.println("LORO");

		  loro.comer();
		  loro.hacerRuido();
		  loro.volar();
		  
		  
		  System.out.println("TIBURON");

		  tiburon.comer();
		  tiburon.hacerRuido();
		  tiburon.nadar();
	  }
	  
	  

}
