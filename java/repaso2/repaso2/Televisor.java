package repaso2;

public class Televisor extends DispositivoBase {

    private int canalActual;

    public Televisor() {
        super();
        this.canalActual = 1; 
    }


    public void cambiarCanal(int canal) {
        if (estaEncendido) {
            this.canalActual = canal;
            System.out.println("Cambiando al canal " + canal);
        } else {
            System.out.println("No se puede cambiar de canal");
        }
    }
}
