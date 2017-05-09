package Fundamentos5;
import java.sql.Date;
public class Empleado extends Persona {
	private double Salario;
	private Date FechaEntrada;
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	public Date getFechaEntrada() {
		return FechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		FechaEntrada = fechaEntrada;
	}
	

}
