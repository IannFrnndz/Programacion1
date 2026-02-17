package repaso2;

public abstract class DispositivoBase implements Dispositivo{

	protected boolean estaEncendido;
	
	public DispositivoBase() {
		this.estaEncendido = false;
	}
	
	@Override
	public void encender() {
		if (!estaEncendido) {
			estaEncendido = true;
			System.out.println("Se ha encendido el dispositivo");
		}else {
			System.out.println("El dispositivo ya estaba encendido");
		}
	}
	
	@Override
    public void apagar() {
        if (estaEncendido) {
            estaEncendido = false;
            System.out.println("El dispositivo se ha apagado.");
        } else {
            System.out.println("El dispositivo ya estaba apagado.");
        }
    }

	
	@Override
    public void mostrarEstado() {
        if (estaEncendido) {
            System.out.println("El dispositivo está ENCENDIDO.");
        } else {
            System.out.println("El dispositivo está APAGADO.");
        }
    }
}
