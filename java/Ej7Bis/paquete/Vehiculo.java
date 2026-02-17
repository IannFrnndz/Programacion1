package paquete;

public abstract class Vehiculo {
protected int codigo;
protected int ano;
protected int plazas;


public Vehiculo(int codigo, int ano, int plazas) {
	this.codigo = codigo;
	this.ano = ano;
	this.plazas = plazas;
}

public int getCodigo() {
	return  codigo;
}
public abstract void mostrar();
}