package paquete;
import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		 HashMap<Integer, Empleado> empleados = new HashMap<>();
		 
		 empleados.put(1, new EmpleadoFijo(1, "richi Pérez", 2500));
	     empleados.put(2, new EmpleadoPorHoras(2, "Checkout López", 160, 15));
	     
	     for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
	            Empleado empleado = entry.getValue();
	            System.out.println("Empleado: " + empleado.nombre + 
	                               "  salario mensual: " + empleado.calcularSalarioMensual());
	        }
	}

}
