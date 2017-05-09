package Fundamentos4;

public class Triangulo extends FigGeometrica{
	private double lado1=1.0;
	private double lado2=1.0;
	private double lado3=1.0;
	protected double area;
	protected double perimetro;
	
	public Triangulo(){
	}
	public Triangulo(double lado1Tri, double lado2Tri, double lado3Tri)
	{
		this.lado1=lado1Tri;
		this.lado2=lado2Tri;
		this.lado3=lado3Tri;
	}
	public void setlado1(double lado1){
		this.lado1=lado1;
	}
	public double getlado1(){
		return lado1;
	}
	public void setlado2(double lado2){
		this.lado2=lado2;
	}
	public double getlado2(){
		return lado2;
	}
	public void setlado3(double lado3){
		this.lado3=lado3;
	}
	public double getlado3(){
		return lado3;
	}

	public double getArea(){
		return area= this.lado1*this.lado2/2;
	}
	public double getPerimetro(){
		return perimetro= this.lado1 + this.lado2+ this.lado3;
	}
		
		}
	

