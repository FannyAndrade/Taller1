package Fundamentos4;

public class FigGeometrica {
	
	public static  void main (String[]args)
	{
		Triangulo tri=new Triangulo(1, 1.5, 1);
		tri.setlado1(1);
		tri.setlado2(1.5);
		tri.setlado3(1);
		tri.getArea();
		System.out.println("EL AREA DEL RECTANGULO ES: " +tri.getArea());
		tri.getPerimetro();
		System.out.println("EL AREA DEL RECTANGULO ES: " +tri.getPerimetro());
	}
}
