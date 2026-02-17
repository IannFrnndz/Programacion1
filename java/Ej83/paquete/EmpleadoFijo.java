package paquete;

public class EmpleadoFijo extends Empleado {
	 private double salarioBase;

	    public EmpleadoFijo(int id, String nombre, double salarioBase) {
	        super(id, nombre);
	        this.salarioBase = salarioBase;
	    }

	    @Override
	    public double calcularSalarioMensual() {
	        return salarioBase;
	    }
}
