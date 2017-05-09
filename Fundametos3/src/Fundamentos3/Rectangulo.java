package Fundamentos3;
public class Rectangulo {
	public double ancho=1;
	public double altura=1;
	public double area;
	public double perimetro;
	
	public Rectangulo(){
	}
	public Rectangulo(double anchoRec, double alturaRec){
		this.ancho=anchoRec;
		this.altura=alturaRec;
		
	}
	public void setancho(double ancho) {
		this.ancho = ancho;
	}
	public void setaltura(double altura) {
		this.altura = altura;
	}
	public double getArea(){
		return area= this.ancho*this.altura;
	}
	public double getPerimetro(){
		return perimetro= this.ancho + this.ancho+ this.altura + this.altura;
	}
	public void mostrar(){
		System.out.println("ANCHO DEL RECTANGULO: "+ this.ancho);
		System.out.println("ALTURA DEL RECTANGULO: "+ this.altura);
	}
		public static  void main (String[]args)
		{
			Rectangulo ct1=new Rectangulo(4,40);
			ct1.setancho(4);
			ct1.setaltura(40);
			ct1.mostrar();
			ct1.getArea();
			System.out.println("EL AREA DEL RECTANGULO ES: " +ct1.getArea());
			ct1.getPerimetro();
			System.out.println("EL PERIMETRO DEL RECTANGULO ES: " + ct1.getPerimetro());
			System.out.println("********************************************************************");
			Rectangulo ct2=new Rectangulo(3.5 , 35.9);
			ct2.setancho(3.5);
			ct2.setaltura(35.9);
			ct2.mostrar();
			ct2.getArea();
			System.out.println("EL AREA DEL RECTANGULO ES: " +ct2.getArea());
			ct1.getPerimetro();
			System.out.println("EL PERIMETRO DEL RECTANGULO ES: " + ct2.getPerimetro());
		}
	}




