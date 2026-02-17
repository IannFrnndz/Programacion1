package repaso2;

public class Main {

	public static void main(String[] args) {

        
        Telefono miTelefono = new Telefono();
        Ordenador miOrdenador = new Ordenador();
        Televisor miTelevisor = new Televisor();
        
        System.out.println("DISPOSITIVOS");
        
        System.out.println("TELEFONO");
        miTelefono.mostrarEstado();
        miTelefono.encender();
        miTelefono.realizarLlamada("837492387");
        miTelefono.apagar();
        miTelefono.realizarLlamada("3824798343");
        
        
        System.out.println("ORDENADOR");
        miOrdenador.mostrarEstado();
        miOrdenador.encender();
        miOrdenador.ejecutarPrograma("VS Code");
        miOrdenador.apagar();
        miOrdenador.ejecutarPrograma("Intellij");
        
        
        System.out.println("TELEVISOR");
        miTelevisor.mostrarEstado();
        miTelevisor.encender();
        miTelevisor.cambiarCanal(5);
        miTelevisor.apagar();
        miTelevisor.cambiarCanal(10);
        
	}

}
