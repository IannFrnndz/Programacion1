package repaso2;

public class Ordenador extends DispositivoBase {

    public Ordenador() {
        super();
    }


    public void ejecutarPrograma(String programa) {
        if (estaEncendido) {
            System.out.println("Ejecutando programa: " + programa);
        } else {
            System.out.println("No se puede ejecutar el programa");
        }
    }
}
