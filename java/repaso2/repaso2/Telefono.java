package repaso2;

public class Telefono extends DispositivoBase {

    public Telefono() {
        super();
    }

    public void realizarLlamada(String numero) {
        if (estaEncendido) {
            System.out.println("Llamando al número: " + numero );
        } else {
            System.out.println("No se puede llamar");
        }
    }
}
