package Fundamentos2;

import java.sql.Date;

public class Cuenta {
	private int id;
	private double saldo;
	private double interesAnual;
	private Date fechaDeCreacion;
	private double InteresMensual;
	public double retiro;
	public double deposito;
	public static int numero=0;

	public Cuenta(int idParam, double saldoParam, double interesAnualParam) {
	this.id = idParam;
	this.saldo = saldoParam;
	this.interesAnual=interesAnualParam;
	
	}

	public Cuenta() {
	id=0;
	saldo=0;
	interesAnual=0;
	
	}

	public int getId() {
	return id;
	}

	public void setId(int id) {
	this.id = id;
	}
	

	public double getSaldo() {
	return saldo;
	}

	public void setSaldo(double saldo) {
	this.saldo = saldo;
	}
	
	public double getInteresAnual() {
	return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
	this.interesAnual = interesAnual;
	}

	public Date getFechaDeCreacion() {
	return fechaDeCreacion;
	}

	public void setFechaDeCreacion(Date fechaDeCreacion) {
	this.fechaDeCreacion = fechaDeCreacion;
	
	}

	public double getInteresMensual() {
		
		return InteresMensual;
	}
	public static void Restaretiro(Cuenta cta){
		cta.retiro-=2500;
	}
	public static void Restaretiro(double retiro){
		retiro-=2500;
	}
	public static void Sumardeposito(Cuenta cta){
		cta.deposito+=3000;
	}
	public static void Sumardeposito(double deposito){
		deposito+=3000;
	}

	public void mostrar(){
		System.out.println("ID: "+ this.id);
		System.out.println("SALDO: "+ this.saldo);
		System.out.println("INTERES ANUAL: "+ this.interesAnual);
	}
		
public static void main(String[] args) {

	Cuenta ct1= new Cuenta(1122,20000,0045);
	ct1.setId(1122);
	ct1.setSaldo(20000);
	ct1.setInteresAnual(0.045);
	ct1.mostrar();
	
	Cuenta ct2=new Cuenta();
	ct2.deposito=20000;
	Sumardeposito(ct2);
	System.out.println( "SALSO CON EL DEPOSITO:" + ct2.deposito);
	
	Cuenta ct3=new Cuenta();
	ct3.retiro=23000;
	Restaretiro(ct3);
	System.out.println("SALDO CON EL RETIRO:" + ct3.retiro);
	
	


	
	}
}





